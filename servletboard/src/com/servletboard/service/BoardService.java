package com.servletboard.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.servletboard.dao.BoardDao;
import com.servletboard.etc.DatabaseCon;
import com.servletboard.vo.BoardVo;

public class BoardService {

	/*
	 * 1. Connection ����(-> dao con ��ü set)
	 * 2. Dao Ŭ���� �޼ҵ� ȣ��
	 * 3. �̱��� Ŭ����
	 * 4. Service Ŭ���� �޼ҵ�� jsp or servlet���� �����Ŵ
	 */
	
	private static BoardService service = new BoardService();
	private BoardService() {}
	
	public static BoardService getInstance() {
		return service;
	}
	
	// �� ���� ��������
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
	
	//�� ��� ��������
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
	
	// �Խù� �ۼ�
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
	
	// �� ��ȸ
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
	
	// �� ��ȸ - ��ȸ�� ����
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
	
	
	//�� ����
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
	
	// �н����� ��ġ Ȯ��
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
	
	//�� ����
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
