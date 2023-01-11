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

@WebServlet(name = "selectStaff",value = "/selectStaff")
//通过姓名查询员工servlet
public class selectStaff extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		String title1 = request.getParameter("title1");
		UserDao userDao = new UserDao();
		List<Staff> staffs = userDao.selectStaff(title1);
		request.setAttribute("list",staffs);
		request.getRequestDispatcher("/admin/EAdmin_ManageAdmin.jsp").forward(request,response);


	}
}
