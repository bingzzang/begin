package xyz.servletWeb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import xyz.servletWeb.vo.MemberVo;

public class MemberDao {

	private Connection con;
	private PreparedStatement psmt;
	DataSource dataFactory;
	
	public MemberDao() {
		
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
            dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<MemberVo> getMemberList(){
		List<MemberVo> memberList = new ArrayList<MemberVo>();
		
		try {
			con = dataFactory.getConnection();
			String sql = "select * from web_member order by userid";
			System.out.println("** sql : "+sql);
			psmt = con.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				String userid = rs.getString("userid");
				String userpw = rs.getString("userpw");
				String username = rs.getString("username");
				String email = rs.getString("email");
				Date regdate = rs.getDate("regdate");
				Date updatedate = rs.getDate("updatedate");
				
				MemberVo vo = new MemberVo(userid, userpw, username, email, regdate, updatedate);
				memberList.add(vo);
			}
			
			rs.close();
			psmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return memberList;
	}
}
