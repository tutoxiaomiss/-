package com.pms.servlet;

import com.pms.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Enable",value = "/Enable")
//启用用户方法
public class Enable extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		String id = request.getParameter("id");
		//对象实例化
		UserDao userDao = new UserDao();
		//调用userdao启用用户方法
		userDao.Enable(Integer.parseInt(id));
		//提示成功
		request.setAttribute("success","<script>alert('启用成功');</script>");
		//转发到用户列表
		request.getRequestDispatcher("/findAllAdmin").forward(request,response);
		return;
	}
}
