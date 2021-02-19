package com.servletboard.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.servletboard.dao.BoardDao;
import com.servletboard.etc.DatabaseCon;
import com.servletboard.vo.BoardVo;

public class BoardService {

	/*
	 * 1. Connection 생성(-> dao con 객체 set)
	 * 2. Dao 클래스 메소드 호출
	 * 3. 싱글톤 클래스
	 * 4. Service 클래스 메소드는 jsp or servlet에서 실행시킴
	 */
	
	private static BoardService service = new BoardService();
	private BoardService() {}
	
	public static BoardService getInstance() {
		return service;
	}
	
	// 글 개수 가져오기
	public int getCount() {
		Connection con = DatabaseCon.getDbConnection();
		BoardDao dao = BoardDao.getInstance();
		dao.setConnection(con);
		
		try {
			int cnt = dao.getCount();
			return cnt;
		} catch (SQLException e) {
			System.out.println("getCount Exception");
		}
		
		return 0;
	}
	
	//글 목록 가져오기
	public ArrayList<BoardVo> getList(int currentPage, int pageSize){
		Connection con = DatabaseCon.getDbConnection();
		BoardDao dao = BoardDao.getInstance();
		dao.setConnection(con);
		int startNo = (currentPage -1) * pageSize;
		ArrayList<BoardVo> list = null;
		
		try {
			list = dao.getList(startNo, pageSize);
		} catch (SQLException e) {
			System.out.println("getList Exception");
			e.printStackTrace();
		}
		DatabaseCon.close(con);
		return list;
	}
	
	// 게시물 작성
	public void insert(BoardVo vo) {
		Connection con = DatabaseCon.getDbConnection();
		BoardDao dao = BoardDao.getInstance();
		dao.setConnection(con);
		
		try {
			dao.insert(vo);
		} catch (SQLException e) {
			System.out.println("insert Exception");
			e.printStackTrace();
		}
		DatabaseCon.close(con);
	}
	
	// 글 조회
	public BoardVo getSelectOne(int num) {
		Connection con = DatabaseCon.getDbConnection();
		BoardDao dao = BoardDao.getInstance();
		dao.setConnection(con);
		
		BoardVo vo = null;
		try {
			dao.getSelectOne(num);
		} catch (SQLException e) {
			System.out.println("getSelectOne Exception");
			e.printStackTrace();
		}
		DatabaseCon.close(con);
		return vo;
	}
	
	// 글 조회 - 조회수 증가
	public void readCount(int num) {
		Connection con = DatabaseCon.getDbConnection();
		BoardDao dao = BoardDao.getInstance();
		dao.setConnection(con);
		
		try {
			dao.readCount(num);
		} catch (SQLException e) {
			System.out.println("readCount Exception");
			e.printStackTrace();
		}
		DatabaseCon.close(con);
	}
	
	
	//글 수정
	public void update(BoardVo vo) {
		Connection con = DatabaseCon.getDbConnection();
		BoardDao dao = BoardDao.getInstance();
		dao.setConnection(con);
		
		try {
			dao.update(vo);
		} catch (SQLException e) {
			System.out.println("update Exception");
			e.printStackTrace();
		}
		DatabaseCon.close(con);
	}
	
	// 패스워드 일치 확인
	public boolean isPassword(int num, String password) {
		Connection con = DatabaseCon.getDbConnection();
		BoardDao dao = BoardDao.getInstance();
		dao.setConnection(con);
		
		boolean result = false;
		
		try {
			result = dao.isPassword(num, password);
		} catch (SQLException e) {
			System.out.println("password check Exception");
			e.printStackTrace();
		}
		DatabaseCon.close(con);
		return result;
	}
	
	//글 삭제
	public void delete(int num) {
		Connection con = DatabaseCon.getDbConnection();
		BoardDao dao = BoardDao.getInstance();
		dao.setConnection(con);
		
		try {
			dao.delete(num);
		} catch (SQLException e) {
			System.out.println("delete Exception");
			e.printStackTrace();
		}
		DatabaseCon.close(con);
	}
}
