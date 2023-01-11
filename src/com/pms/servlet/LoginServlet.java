package com.pms.servlet;


import com.pms.dao.UserDao;
import com.pms.dao.WageDao;
import com.pms.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name="Login",value = "/Login")
//登录servlet
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		    doPost(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//设置中文编码
		request.setCharacterEncoding("UTF-8");
		//获取用户输入的账号
		String adminName = request.getParameter("adminName");
		//获取用户输入的密码
		String adminPwd = request.getParameter("adminPwd");
		//实例化userdao类对象
		UserDao userDao = new UserDao();
		//调用userdao类登录方法返回一个user对象
		User user = userDao.login(adminName,adminPwd);
		//判断数据库是否有这个账号 并且这个账号是启用状态
		if(user != null && user.getState().equals("启用")){
			//实例化wagedao类对象
			WageDao wageDao = new WageDao();
			//获取当前时间
			Date date = new Date();
			String strDateFormat = "yyyy-MM-dd HH:mm:ss";
			SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
			String dated= sdf.format(date);
			//获取时间结束

			//把当前用户名字和登录时间添加到log日志中
			wageDao.insertLogs(adminName,dated);
			//把用户放到session中并设置欢迎语
			request.getSession().setAttribute("message","欢迎您:"+user.getAdminName());
			if(user.getU_admin () > 0){
				response.sendRedirect(request.getContextPath()+"/admin/index.jsp");
				return;
			}
			//重定向到主页面
			response.sendRedirect(request.getContextPath()+"/admin/index1.jsp");
			return;
		}
		//如果没有查询到或被禁用
		//提示失败
		request.setAttribute("successl","<script>alert('账号或密码错误或被禁用');</script>");
		//转发登录页面继续登录
		request.getRequestDispatcher("/admin/login.jsp").forward(request,response);

	}
}
