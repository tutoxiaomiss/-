package com.pms.servlet;

import com.pms.dao.UserDao;
import com.pms.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "findAllAdmin",value = "/findAllAdmin")
//查询所有用户servlet
public class findAllAdmin extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//实例化对象
		UserDao userDao = new UserDao();
		//调用userdao类查询所有用户方法
		List<User>  users =  userDao.findAllAdmin();
		//将查询出来的用户数据放到前端jsp页面上
		request.setAttribute("list",users);
		//转发到用户列表
		request.getRequestDispatcher("/admin/Admin_ManageAdmin.jsp").forward(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		doGet(request,response);
	}
}
