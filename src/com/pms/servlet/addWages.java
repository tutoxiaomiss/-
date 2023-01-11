package com.pms.servlet;

import com.pms.dao.UserDao;
import com.pms.dao.WageDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "addWages",value = "/addWages")
//添加工资servlet
public class addWages extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//获取用户输入的工资数据
		String g1 = request.getParameter("adminName1");
		String g2 = request.getParameter("adminName2");
		String g3 = request.getParameter("adminName3");
		String g4 = request.getParameter("adminName4");
		String g5 = request.getParameter("adminName5");
		//获取结束
		//蒋数据由String类型转为int类型
		int id = Integer.parseInt(g1);
//		int q1 = Integer.parseInt(g2);
		int q2 = Integer.parseInt(g3);
		int q3 = Integer.parseInt(g4);
		int q4 = Integer.parseInt(g5);
		//计算总工资
		int q5 =   q2 + q3 + q4;
		//实例化dao层wagedao类对象
		WageDao wageDao = new WageDao();
		//获取当前时间
		Date date = new Date();
		String strDateFormat = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
	    String dated= sdf.format(date); // 输出已经格式化的现在时间（24小时制）
		//获取当前时间结束

		//调用dao层的添加工资方法蒋工资数据放进形参 传过去
		wageDao.insertWage(id,g2,q2,q3,q4,q5,dated);

		//提示添加成功
		request.setAttribute("successage","<script>alert('添加成功');</script>");
		//转发到工资列表页面
		request.getRequestDispatcher("/findAllWages").forward(request,response);
	}
}