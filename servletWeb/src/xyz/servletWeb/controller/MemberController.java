package xyz.servletWeb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xyz.servletWeb.dao.MemberDao;
import xyz.servletWeb.vo.MemberVo;

public class MemberController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MemberDao dao;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		dao = new MemberDao();		//객체 초기화
//		super.init(config);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String page = null;
		String action = req.getPathInfo();
		System.out.println("** command : " + action);
		
		if(action==null || action.equals("/listMembers")) {
			System.out.println("** Member List **");
			List<MemberVo> memberList = dao.getMemberList();
			req.setAttribute("memberList", memberList);
			page = "/WEB-INF/views/member/memberList.jsp";
		}if(action.equals("/addMember")) {
			page = "/WEB-INF/views/member/memberForm.jsp";
		}
		
		req.getRequestDispatcher(page).forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
