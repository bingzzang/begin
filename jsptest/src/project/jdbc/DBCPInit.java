package project.jdbc;

import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.tomcat.dbcp.dbcp2.ConnectionFactory;
import org.apache.tomcat.dbcp.dbcp2.DriverManagerConnectionFactory;
import org.apache.tomcat.dbcp.dbcp2.PoolableConnection;
import org.apache.tomcat.dbcp.dbcp2.PoolableConnectionFactory;
import org.apache.tomcat.dbcp.dbcp2.PoolingDriver;
import org.apache.tomcat.dbcp.pool2.impl.GenericObjectPool;
import org.apache.tomcat.dbcp.pool2.impl.GenericObjectPoolConfig;

public class DBCPInit extends HttpServlet{

	@Override
	public void init() throws ServletException
	{
		loadJDBCDriver();
		initConnectionPool();
		
	}
	
	private void loadJDBCDriver() {
		String driverClass = getInitParameter("jdbcDriver");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			throw new RuntimeException("fail to lad JDBC Driver", ex);
		}
	}
	
	private void initConnectionPool() {
		try {
			String jdbcUrl = getInitParameter("jdbcUrl");
			String username = getInitParameter("dbUser");
			String pw = getInitParameter("dbPass");
			
			ConnectionFactory cf = new DriverManagerConnectionFactory(jdbcUrl, username, pw);
			
			PoolableConnectionFactory pcf = new PoolableConnectionFactory(cf, null);
			pcf.setValidationQuery("select 1");
			
			GenericObjectPoolConfig  gbpc = new GenericObjectPoolConfig();
			gbpc.setTimeBetweenEvictionRunsMillis(1000L * 60L * 5L);
			gbpc.setTestWhileIdle(true);
			gbpc.setMinIdle(4);
			gbpc.setMaxTotal(50);
			
			GenericObjectPool<PoolableConnection> cp = new GenericObjectPool<>(pcf, gbpc);
			pcf.setPool(cp);
			
			Class.forName("org.apache.commons.dbcp2.PoolingDriver");
			PoolingDriver driver = (PoolingDriver) DriverManager.getDriver("jdbc:apache:commons:dbcp:");
			String poolName = getInitParameter("poolName");
			driver.registerPool(poolName, cp);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
