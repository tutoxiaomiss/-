package com.pms.servlet;

import com.pms.dao.UserDao;
import com.pms.dao.WageDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//接收路径
@WebServlet(name = "addPmss",value = "/addPmss")
/**
 * 添加人事评价servlet
 */
public class addPmss extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		//设置中文编码utf-8
		request.setCharacterEncoding("UTF-8");
		//获取用户输入的数据
		String a1p = request.getParameter("adminName1");
		String a2 = request.getParameter("adminName2");
		String a3 = request.getParameter("adminName3");
		String a4 = request.getParameter("adminName4");
		String a5 = request.getParameter("adminName5");
		//蒋id转成int类型
		int a1 = Integer.parseInt(a1p);
		//实例化dao层对象
		WageDao wageDao = new WageDao();
		//调用dao层的isertDao添加人事评价方法蒋用户输入的数据传过去
		wageDao.isertPmss(a1,a2,a3,a4,a5);
		//提升添加成功
		request.setAttribute("successrt","<script>alert('添加成功');</script>");
		//转发到人事评价列表
		request.getRequestDispatcher("/findAllPmss").forward(request,response);
	}
}
