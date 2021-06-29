package xyz.servletWeb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xyz.servletWeb.dao.DetailDao;
import xyz.servletWeb.dao.UpdateDao;
import xyz.servletWeb.vo.ListVo;

public class BoardUpdateServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DetailDao dao = new DetailDao();
		int bno = Integer.parseInt(req.getParameter("bno"));
		ListVo vo = dao.detail(bno);
		dao.increaseViewcnt(bno);
		
		req.setAttribute("vo", vo);
		req.getRequestDispatcher("WEB-INF/views/board/update.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UpdateDao dao = new UpdateDao();
		
		String title = req.getParameter("title");
		String conts = req.getParameter("conts");
		String writer = req.getParameter("writer");
		int bno = Integer.parseInt(req.getParameter("bno"));
		
		ListVo vo = new ListVo(bno, title, conts, writer);
		dao.update(vo);
		resp.sendRedirect("/detail.do?bno="+vo.getBno());
	}
}
