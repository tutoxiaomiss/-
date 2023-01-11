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
import java.util.List;

@WebServlet(name = "selectWages",value = "/selectWages")
//通过员工编号查询工资servlet
public class selectWages extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		String title1 = request.getParameter("title1");
		if(title1.equals ("")){
			title1 = "0";
		}
		WageDao wageDao = new WageDao();
		List<Wage> Wages = wageDao.selectWages(Integer.parseInt(title1));
		request.setAttribute("list",Wages);
		request.getRequestDispatcher("/admin/GAdmin_ManageAdmin.jsp").forward(request,response);


	}
}
