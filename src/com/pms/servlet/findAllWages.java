package com.pms.servlet;

import com.pms.dao.UserDao;
import com.pms.dao.WageDao;
import com.pms.entity.Wage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "findAllWages",value = "/findAllWages")
//查询所有工资servlet
public class findAllWages extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		WageDao wageDao = new WageDao();
		List<Wage>  wages = wageDao.findAllWages();
		request.setAttribute("list",wages);
		request.getRequestDispatcher("/admin/GAdmin_ManageAdmin.jsp").forward(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		 doGet(request,response);

	}
}
