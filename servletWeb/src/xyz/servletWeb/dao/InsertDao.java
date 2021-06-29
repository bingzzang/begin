package xyz.servletWeb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import xyz.servletWeb.database.DatabaseCon;
import xyz.servletWeb.vo.ListVo;

public class InsertDao {

	private Connection con;
	private PreparedStatement psmt;
	
	public void insert(ListVo vo) {
		try {
			con = DatabaseCon.getDbConnection();
			
			String title = vo.getTitle();
			String writer = vo.getWriter();
			String conts = vo.getConts();
			
			String sql = "insert into WEB_BOARD values(WEB_BOARD_SEQ.nextval, ?, ?, ?, sysdate, 0)";
			System.out.println("** PrepareStatement : "+sql);
			psmt = con.prepareStatement(sql);
			psmt.setString(1, title);
			psmt.setString(2, conts);
			psmt.setString(3, writer);
			
			psmt.executeUpdate();
			
			psmt.close();
			DatabaseCon.close(con);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
