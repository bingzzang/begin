package xyz.servletWeb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import xyz.servletWeb.database.DatabaseCon;
import xyz.servletWeb.vo.ListVo;

public class ListDao {
	
	private Connection con;
	private PreparedStatement psmt;
	
	public List<ListVo> boardList(){
		List<ListVo> list = new ArrayList<ListVo>();
		
		try {
			con = DatabaseCon.getDbConnection();
			String sql = "select * from WEB_BOARD order by bno desc";
			System.out.println("** PrepareStatement : "+sql);
			psmt = con.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				Date regdate = rs.getDate("regdate");
				int viewcnt = rs.getInt("viewcnt");
				
				ListVo vo = new ListVo();
				vo.setBno(bno);
				vo.setTitle(title);
				vo.setWriter(writer);
				vo.setRegdate(regdate);
				vo.setViewcnt(viewcnt);
				
				list.add(vo);
			}
			
			rs.close();
			psmt.close();
			DatabaseCon.close(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
}
