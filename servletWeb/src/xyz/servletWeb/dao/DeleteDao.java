package xyz.servletWeb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import xyz.servletWeb.database.DatabaseCon;

public class DeleteDao {

	private Connection con;
	private PreparedStatement psmt;
	
	public void delete(int bno) {
		try {
			con = DatabaseCon.getDbConnection();
			String sql = "delete from web_board where bno=?";
			System.out.println("** PrepareStatement : "+sql);
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, bno);
			
			psmt.executeUpdate();
			
			psmt.close();
			DatabaseCon.close(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
