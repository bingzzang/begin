package com.servletboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.servletboard.vo.BoardVo;

public class BoardDao {

	//싱글톤
	private static BoardDao dao = new BoardDao();
	
	private BoardDao() {
		
	}
	
	public static BoardDao getInstance() {
		return dao;
	}
	
	private Connection con; 	//db연결 객체
	
	public void setConnection(Connection con) {
		this.con = con;
	}
	
	//글 비밀번호 검사
	public boolean isPassword(int num, String password) throws SQLException{
		String sql = "select * from board where idx=? and password = ?";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, num);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) return true;
		else return false;
		
	}
	
	// 조회수 증가
	public void readCount(int num) throws SQLException{
		String sql = "update board set readnum=readnum+1 where num=?";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, num);
		pstmt.execute();
	}
	
	//글쓰기
	public void insert(BoardVo vo) throws SQLException{
		String sql = "insert into board(num, writer,title, conts, wdate, readnum, password) "
				+ "values(board_seq.nextval, ?, ?, ?, sysdate, 0, ?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo.getWriter());
		pstmt.setString(2, vo.getTitle());
		pstmt.setString(3, vo.getConts());
		pstmt.setString(4, vo.getPassword());
		pstmt.execute();
	}
	
	//글수정
	public void update(BoardVo vo) throws SQLException{
		String sql = "update board set title=?, conts=? where num = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo.getTitle());
		pstmt.setString(2, vo.getConts());
		pstmt.setInt(3, vo.getNum());
		pstmt.execute();
	}
	
	//글삭제
	public void delete(int num) throws SQLException{
		String sql = "delete from board where idx = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, num);
		pstmt.execute();
	}
	
	//전체 글 갯수
	public int getCount() throws SQLException{
		String sql = "select count(*) from board";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		int cnt = rs.getInt(1);		//데이터가 한개만 나오기 때문에 이렇게 표현 가능
		
		return cnt;
	}
	
	//num, writer,title, conts, wdate, readnum, password
	public BoardVo getSelectOne(int num) throws SQLException{
		String sql = "select num, writer, title, conts, to_char(wdate, 'YYYY-MM-DD HH24:MI:SS') as wdate, readnum"
				+ " from board where num = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, num);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		
		BoardVo vo = new BoardVo();
		vo.setNum(rs.getInt("num"));
		vo.setWriter(rs.getString("writer"));
		vo.setTitle(rs.getString("title"));
		vo.setConts(rs.getString("conts"));
		vo.setWdate(rs.getString("wdate"));
		vo.setReadnum(rs.getInt("readnum"));
		
		return vo;
	}
	
	public ArrayList<BoardVo> getList(int startNo, int pageSize) throws SQLException{
		String sql = "SELECT * " + 
				"  FROM(" + 
				"        SELECT ROWNUM AS RNUM, A.*" + 
				"            FROM ( select * from board order by num desc ) A" + 
				"         WHERE ROWNUM <= ?+?" + 
				"      )" + 
				" WHERE RNUM > ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, startNo);
		pstmt.setInt(2, pageSize);
		pstmt.setInt(3, startNo);
		
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<BoardVo> list = new ArrayList<>();
		
		if(rs.next()) {
			do {
				BoardVo vo = new BoardVo();
				vo.setNum(rs.getInt("num"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setWdate(rs.getString("wdate"));
				vo.setReadnum(rs.getInt("readnum"));
				
				list.add(vo);
			}while(rs.next());
		}
		
		return list;
	}
}
