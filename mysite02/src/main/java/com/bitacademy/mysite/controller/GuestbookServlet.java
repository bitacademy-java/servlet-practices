package com.bitacademy.mysite.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bitacademy.mysite.dao.GuestbookDao;
import com.bitacademy.mysite.vo.GuestbookVo;
import com.bitacademy.web.mvc.WebUtil;

public class GuestbookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("a");
		if("add".equals(action)) {
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String contents = request.getParameter("contents");
			
			GuestbookVo vo = new GuestbookVo();
			vo.setName(name);
			vo.setPassword(password);
			vo.setContents(contents);
			
			new GuestbookDao().insert(vo);
			WebUtil.redirect(request.getContextPath() + "/guestbook", request, response);
		} else if("deleteform".equals(action)) {
			WebUtil.forward("/WEB-INF/views/guestbook/deleteform.jsp", request, response);		
		} else if("delete".equals(action)) {
			String no = request.getParameter("no");
			String password = request.getParameter("password");
			
			new GuestbookDao().delete(Long.parseLong(no), password);
			WebUtil.redirect(request.getContextPath() + "/guestbook", request, response);
		} else {
			/* list */
			List<GuestbookVo> list = new GuestbookDao().findAll();
			
			request.setAttribute("list", list);

			WebUtil.forward("/WEB-INF/views/guestbook/index.jsp", request, response);
		}		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
