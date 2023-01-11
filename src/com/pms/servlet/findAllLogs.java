package com.pms.servlet;

import com.pms.dao.UserDao;
import com.pms.dao.WageDao;
import com.pms.entity.Logs;
import com.pms.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "findAllLogs",value = "/findAllLogs")
//查询所有日志
public class findAllLogs extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		WageDao wageDao = new WageDao();
		//调用wagedao类查询所有日志方法
		List<Logs> logs =  wageDao.findAllLogs();
		//奖所有日志放到前端页面jsp中 显示出来
		request.setAttribute("list",logs);
		//转发日志页面
		request.getRequestDispatcher("/admin/LOGAdmin_ManageAdmin.jsp").forward(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		doGet(request,response);
	}
}
