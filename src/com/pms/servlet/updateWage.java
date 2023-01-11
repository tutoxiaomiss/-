package com.pms.servlet;

import com.pms.dao.UserDao;
import com.pms.dao.WageDao;
import com.pms.entity.Staff;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "updateWage",value = "/updateWage")
//修改工资servlet
public class updateWage extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//设置中文编码
		request.setCharacterEncoding("UTF-8");
		//获取用户输入的工资数据
		String idg = request.getParameter("adminName1");
		String g2 = request.getParameter("adminName2");
		String a3 = request.getParameter("adminName3");
		String a4 = request.getParameter("adminName4");
		String a5 = request.getParameter("adminName5");
		//获取结束
		//将工资数据由string类型转成int类型
		int id = Integer.parseInt(idg);
		int g3 = Integer.parseInt(a3);
		int g4 = Integer.parseInt(a4);
		int g5 = Integer.parseInt(a5);
		//计算总工资
		int g6 = g3+g4+g5;
		//实例化wagedao类对象
		WageDao wageDao = new WageDao();
		//调用wagedao类的修改工资方法 并把工资数据放到形参中传过去
		wageDao.updateWage(id,g2,g3,g4,g5,g6);
		//提示修改成功
		request.setAttribute("successage","<script>alert('修改成功');</script>");
		//转发工资列表页面
		request.getRequestDispatcher("/findAllWages").forward(request,response);
	}
}
