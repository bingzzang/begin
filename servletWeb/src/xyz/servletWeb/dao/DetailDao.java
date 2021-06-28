package xyz.servletWeb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import xyz.servletWeb.database.DatabaseCon;
import xyz.servletWeb.vo.ListVo;

public class DetailDao {

	private Connection con;
	private PreparedStatement psmt;
	
	public ListVo detail(int bno) {
		ListVo vo = null;
		
		try {
			con = DatabaseCon.getDbConnection();
			String sql = "select * from WEB_BOARD where bno=?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, bno);
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				vo = new ListVo();
				
				bno = rs.getInt("bno");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String conts = rs.getString("conts");
				Date regdate = rs.getDate("regdate");
				int viewcnt = rs.getInt("viewcnt");
				
				vo.setBno(bno);
				vo.setTitle(title);
				vo.setConts(conts);
				vo.setWriter(writer);
				vo.setRegdate(regdate);
				vo.setViewcnt(viewcnt);
				
				vo = new ListVo(bno, title, conts, writer, regdate, viewcnt);
				
			}
			
			rs.close();
			psmt.close();
			DatabaseCon.close(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	public int increaseViewcnt(int bno) {
		try {
			con = DatabaseCon.getDbConnection();
			String sql = "update web_board set viewcnt=viewcnt+1 where bno=?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, bno);
			
			int resultViewcnt = psmt.executeUpdate();
			
			psmt.close();
			DatabaseCon.close(con);
			
			return resultViewcnt;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bno;
	}
}
