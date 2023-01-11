package com.pms.servlet;

import com.pms.entity.Pmss;
import com.pms.dao.WageDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "findAllPmss",value = "/findAllPmss")
//查询所有人事评价servlet
public class findAllPmss extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		//设置中文编码
		request.setCharacterEncoding("UTF-8");
		//实例化wagedao类
		WageDao wageDao = new WageDao();
		//调用wagedao类查询所有人事评价的数据
		List<Pmss> Pmss =  wageDao.findAllPmss();
		//将数据放到前端jsp 页面 显示出来
		request.setAttribute("list",Pmss);
		//转发到人事评价列表页面
		request.getRequestDispatcher("/admin/RAdmin_ManageAdmin.jsp").forward(request,response);

	}
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		doGet(request,response);
	}
}
