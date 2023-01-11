package com.pms.servlet;

import com.pms.dao.UserDao;
import com.pms.dao.WageDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "deleteWage",value = "/deleteWage")
//删除工资servlet
public class deleteWage extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		//设置中文编码utf-8
		request.setCharacterEncoding("UTF-8");
		//获取工资信息id
		String id = request.getParameter("id");
		//对象实例化
		WageDao wageDao = new WageDao();
		//调用wagedao类的删除工资方法
		wageDao.deleteWage(Integer.parseInt(id));
		//提示成功
		request.setAttribute("successage","<script>alert('删除成功');</script>");
		//转发到工资列表页面
		request.getRequestDispatcher("/findAllWages").forward(request,response);
	}

}
