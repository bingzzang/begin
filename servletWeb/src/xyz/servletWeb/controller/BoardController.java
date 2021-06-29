package xyz.servletWeb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xyz.servletWeb.service.BoardService;
import xyz.servletWeb.vo.BoardVO;

@WebServlet("/board/*")
public class BoardController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	BoardService service;
	BoardVO vo;

	@Override
	public void init() throws ServletException {
		System.out.println("** BOARD w member **");
		super.init();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String command = req.getParameter("command");
	}
	
}
