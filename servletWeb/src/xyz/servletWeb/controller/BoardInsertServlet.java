package xyz.servletWeb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xyz.servletWeb.dao.InsertDao;
import xyz.servletWeb.vo.ListVo;

public class BoardInsertServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/board/insert.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("*** post ***");
		InsertDao dao = new InsertDao();
		String title = req.getParameter("title");
		String conts = req.getParameter("conts");
		String writer = req.getParameter("writer");
		
		ListVo vo = new ListVo(title, conts, writer);
		
		dao.insert(vo);
		resp.sendRedirect("/list.do");
	}
}
