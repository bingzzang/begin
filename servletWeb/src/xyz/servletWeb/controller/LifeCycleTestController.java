package xyz.servletWeb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleTestController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		System.out.println("*** init ***");
		super.init();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("*** service ***");
		super.service(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("*** do get ***");
		req.setAttribute("title", "LIFE CYCLE");
		req.getRequestDispatcher("/WEB-INF/views/life.jsp").forward(req, resp);
//		super.doGet(req, resp);
	}
	@Override
	public void destroy() {
		System.out.println("*** destroy ***");
		super.destroy();
	}
}
