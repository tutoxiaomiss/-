package com.pms.servlet;

import com.pms.dao.UserDao;
import com.pms.entity.Staff;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "findOneStaff",value = "/findOneStaff")
//通过id查询员工servlet
public class findOneStaff extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		String id = request.getParameter("id");
		UserDao userDao = new UserDao();
		Staff staff = userDao.findOneStaff(Integer.parseInt(id));
		request.setAttribute("c",staff);
		request.getRequestDispatcher("/admin/EAdmin_EditAdmin.jsp").forward(request,response);
		return;

	}
}
