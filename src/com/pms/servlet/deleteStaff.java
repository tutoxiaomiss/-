package com.pms.servlet;

import com.pms.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "deleteStaff",value = "/deleteStaff")
//删除员工servlet
public class deleteStaff extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//获取要删除的员工id
		String id = request.getParameter("id");
		//实例化userdao类 对象
		UserDao userDao = new UserDao();
		//掉用userdao类的删除方法
		userDao.deleteStaff(Integer.parseInt(id));
		//提示成功
		request.setAttribute("successae","<script>alert('删除成功');</script>");
		//转发到员工列表
		request.getRequestDispatcher("/findAllStaff").forward(request,response);
	}
}
