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
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doHandle(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doHandle(req, resp);
	}
	
	private void doHandle(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		
		String page = null;
		String action = req.getPathInfo();
		System.out.println("** command : " + action);
		
		if(action==null || action.equals("/listMembers")) {
			System.out.println("** Member List **");
			List<MemberVo> memberList = dao.getMemberList();
			req.setAttribute("memberList", memberList);
			page = "/WEB-INF/views/member/memberList.jsp";
		}else if(action.equals("/memberForm")) {
			page = "/WEB-INF/views/member/memberForm.jsp";
		}else if(action.equals("/addMember")) {
			String userid = req.getParameter("userid");
			String userpw = req.getParameter("userpw");
			String username = req.getParameter("username");
			String email = req.getParameter("email");
			
			MemberVo vo = new MemberVo(userid, userpw, username, email);
			dao.addMember(vo);
			page = "/member/listMembers";
		}else if(action.equals("/updateForm")) {
			String userid = req.getParameter("userid");
			MemberVo vo = dao.getMember(userid);
			req.setAttribute("memberInfo", vo);
			page = "/WEB-INF/views/member/memberUpdateForm.jsp";
		}else if(action.equals("/updateMember")) {
			String userid = req.getParameter("userid");
			String userpw = req.getParameter("userpw");
			String username = req.getParameter("username");
			String email = req.getParameter("email");
			
			MemberVo vo = new MemberVo(userid, userpw, username, email);
			dao.updateMember(vo);
			page = "/member/listMembers";
		}else if(action.equals("/deleteMember")) {
			String userid = req.getParameter("userid");
			dao.delete(userid);
			
			page = "/member/listMembers";
		}
		
		req.getRequestDispatcher(page).forward(req, resp);
	}
}
