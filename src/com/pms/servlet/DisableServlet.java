package com.pms.servlet;

import com.pms.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Disable",value = "/Disable")
//禁用用户servlet
public class DisableServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		String id = request.getParameter("id");
		//对象实例化
		UserDao userDao = new UserDao();
		//调用userdao类禁用用户方法
		userDao.Disable(Integer.parseInt(id));
		//提示成功
			 request.setAttribute("success","<script>alert('禁用成功');</script>");
			 //转发用户列表
			 request.getRequestDispatcher("/findAllAdmin").forward(request,response);
			 return;
		}

	}

