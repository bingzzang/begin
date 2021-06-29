package xyz.servletWeb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import xyz.servletWeb.database.DatabaseCon;
import xyz.servletWeb.vo.ListVo;

public class UpdateDao {
	
	private Connection con;
	private PreparedStatement psmt;
	
	public void update(ListVo vo) {
		try {
			con = DatabaseCon.getDbConnection();
			
			int bno = vo.getBno();
			String title = vo.getTitle();
			String writer = vo.getWriter();
			String conts = vo.getConts();
			
			String sql = "update web_board set title=?, conts=?, writer=? where bno=?";
			System.out.println("** PrepareStatement : "+sql);
			psmt = con.prepareStatement(sql);
			psmt.setString(1, title);
			psmt.setString(2, conts);
			psmt.setString(3, writer);
			psmt.setInt(4, bno);
			
			psmt.executeUpdate();
			
			psmt.close();
			DatabaseCon.close(con);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
