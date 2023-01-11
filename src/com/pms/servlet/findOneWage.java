package com.pms.servlet;

import com.pms.dao.UserDao;
import com.pms.dao.WageDao;
import com.pms.entity.Staff;
import com.pms.entity.Wage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "findOneWage",value = "/findOneWage")
//通过id查询所有工资方法
public class findOneWage extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		WageDao wageDao = new WageDao();
		Wage wage = wageDao.findOneWage(Integer.parseInt(id));
		request.setAttribute("c",wage);
		request.getRequestDispatcher("/admin/GAdmin_EditAdmin.jsp").forward(request,response);

	}
}
