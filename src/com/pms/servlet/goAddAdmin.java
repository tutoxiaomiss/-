package com.pms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "goAddAdmin",value = "/goAddAdmin")
//去添加用户页面转发的servlet
public class goAddAdmin extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		 request.setCharacterEncoding("UTF-8");
		 request.getRequestDispatcher("/admin/Admin_AddAdmin.jsp").forward(request,response);
		 return;
	}
}
