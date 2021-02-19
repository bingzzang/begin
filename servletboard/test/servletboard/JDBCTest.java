package servletboard;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

import org.junit.Test;

public class JDBCTest {

	private final static Logger log = Logger.getGlobal();
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String USER = "bej";
	private static final String PW = "bej930303";
	
	@Test
	public void connectionTes() throws ClassNotFoundException {
		Class.forName(DRIVER);
		
		String sql = "select sysdate as time from dual";
		
		try(
				Connection conn = DriverManager.getConnection(URL, USER, PW);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				){
			assertNotNull(conn);
			log.info("conn : "+conn);
			log.info("pstmt : "+pstmt);
			
			rs.next();
			log.info(rs.getString("time"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
