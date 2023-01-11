package com.pms.servlet;

import com.pms.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addUser",value = "/addUser")
//添加用户servlet
public class AddUserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//获取用户输入的账号
		String adminName = request.getParameter("adminName");
		//获取用户输入的密码
		String adminPwd = request.getParameter("adminPwd");
		//实例化dao层对象
		UserDao userDao = new UserDao();
		//判断用户是否添加成功
		if(userDao.insertUser(adminName,adminPwd)){
			//提示成功
			request.setAttribute("success","<script>alert('恭喜您:添加用户成功');</script>");
			//转发到用户列表
			request.getRequestDispatcher("/findAllAdmin").forward(request,response);
			return;
		}
		//如果没添加成功 提示失败
		request.setAttribute("success","<script>alert('很遗憾:添加失败')</script>");
		//转发添加页面 继续添加
		request.getRequestDispatcher("/goAddAdmin").forward(request,response);
	}
}
