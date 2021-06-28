package xyz.servletWeb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xyz.servletWeb.dao.DetailDao;
import xyz.servletWeb.vo.ListVo;


public class BoardListDetailServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("** detail **");
		
		DetailDao dao = new DetailDao();
		int bno = Integer.parseInt(req.getParameter("bno"));
		ListVo vo = dao.detail(bno);
		dao.increaseViewcnt(bno);
		
		req.setAttribute("vo", vo);
		req.getRequestDispatcher("WEB-INF/views/board/detail.jsp").forward(req, resp);
	}
}
