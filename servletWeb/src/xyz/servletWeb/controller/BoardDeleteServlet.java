package xyz.servletWeb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xyz.servletWeb.dao.DeleteDao;

public class BoardDeleteServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int bno = Integer.parseInt(req.getParameter("bno"));
		
		DeleteDao dao = new DeleteDao();
		dao.delete(bno);
		resp.sendRedirect("/list.do");
	}
	
}
