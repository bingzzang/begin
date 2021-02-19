package com.servletboard.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servletboard.service.BoardService;
import com.servletboard.vo.BoardList;
import com.servletboard.vo.BoardVo;

@WebServlet("/board/list")
public class ListServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public ListServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String temp = req.getParameter("page");
		int currentPage = 1;
		
		if(temp != null) {
			currentPage = Integer.parseInt(temp);
		}
		
		int pageSize = 10;
		
		BoardService service = BoardService.getInstance();
		int totalCount = service.getCount();
		
		//������ ����� ���� ���� ���� ����Ͽ� ��������� ����
		BoardList plist = new BoardList(currentPage, pageSize, totalCount);
		
		ArrayList<BoardVo> list = service.getList(currentPage, pageSize);
		int cnt = service.getCount();
		req.setAttribute("list", list);
		
		// ������ ��� attribute ����
		req.setAttribute("plist", plist);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/board/listView.jsp");
		dispatcher.forward(req, resp);
	}
}
