package xyz.servletWeb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xyz.servletWeb.dao.ListDao;
import xyz.servletWeb.vo.ListVo;

public class BoardListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("** list **");
		ListDao dao = new ListDao();
		List<ListVo> list = dao.boardList();
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/board/list.jsp").forward(req, resp);
	}
	
}
