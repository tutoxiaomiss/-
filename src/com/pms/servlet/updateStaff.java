package com.pms.servlet;

import com.pms.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "updateStaff" ,value = "/updateStaff")
//修改员工servlet
public class updateStaff extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//设置中文编码
		request.setCharacterEncoding("UTF-8");
		//获取用户输入的员工数据
		String id = request.getParameter("id");
		String a2 =request.getParameter("adminName1");
		String a3 =request.getParameter("adminName2");
		String a4 =request.getParameter("adminName3");
		String a5 =request.getParameter("adminName4");
		String a6 =request.getParameter("adminName5");
		String a7 =request.getParameter("adminName6");
		String a8 =request.getParameter("adminName7");
		String a9 =request.getParameter("adminName8");
		String a10 =request.getParameter("adminPwd9");
		String a11 =request.getParameter("adminPwd10");
		//获取结束

		//实例化userdao类对象
		UserDao userDao = new UserDao();
		//调用userdao类的修改员工方法 把用户输入的员工数据放到形参中传过去
		userDao.update(Integer.parseInt(id),a2,a3,a4,a5,a6,a7,a8,a9,a10,a11);
		//提示成功
		request.setAttribute("successae","<script>alert('修改成功');</script>");
		//转发到员工列表页面
		request.getRequestDispatcher("/findAllStaff").forward(request,response);
	}
}
