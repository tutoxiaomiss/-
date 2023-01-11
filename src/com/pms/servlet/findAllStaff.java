package com.pms.servlet;

import com.pms.dao.UserDao;
import com.pms.entity.Staff;
import com.pms.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "findAllStaff",value = "/findAllStaff")
//查询所有员工servlet
public class findAllStaff extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		UserDao userDao = new UserDao();
		List<Staff> staffs =  userDao.findAllStaff();
		request.setAttribute("list",staffs);
		request.getRequestDispatcher("/admin/EAdmin_ManageAdmin.jsp").forward(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		doGet(request,response);
	}
}
