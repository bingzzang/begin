package xyz.servletWeb.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseCon {
	
	public static Connection getDbConnection() {
		Connection con = null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "bej";
			String pw = "bej930303";
			
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("** Connection Success **");
		} catch (ClassNotFoundException | SQLException e ) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void close(Connection con) {
		try {
			if(con != null) {
				con.close();
				System.out.println("** Connection Close **");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
