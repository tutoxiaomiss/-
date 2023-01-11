package com.pms.servlet;

import com.pms.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addStaff",value = "/addStaff")
/**
 * 添加员工servlet
 */
public class addStaff extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {

		 request.setCharacterEncoding("UTF-8");
		 //获取用户输入的员工数据
		String a1 =request.getParameter("adminName1");
		String a2 =request.getParameter("adminName2");
		String a3 =request.getParameter("adminName3");
		String a4 =request.getParameter("adminName4");
		String a5 =request.getParameter("adminName5");
		String a6 =request.getParameter("adminName6");
		String a7 =request.getParameter("adminName7");
		String a8 =request.getParameter("adminName8");
		String a9 =request.getParameter("adminPwd9");
		String a10 =request.getParameter("adminPwd10");
		//获取前端用户输入的员工数据结束
		//实例化dao层对象
		UserDao userDao = new UserDao();
		//调用dao层的添加员工方法
		userDao.insertStaff(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10);
		//提示添加成功
			request.setAttribute("successae","<script>alert('添加员工成功');</script>");
			//转发到员工列表
			request.getRequestDispatcher("/findAllStaff").forward(request,response);

	}

}
