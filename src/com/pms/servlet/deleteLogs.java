package com.pms.servlet;

import com.pms.dao.WageDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "deleteLogs",value = "/deleteLogs")
public class deleteLogs extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        doPost(request,response);

    }
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //获取前端id
        String id = request.getParameter ("id");
        //对象实例化
        WageDao wageDao = new WageDao ();
        wageDao.deleteLogs(Integer.parseInt (id));
        request.setAttribute ("successlog","<script>alert('删除成功');</script>");
        request.getRequestDispatcher ("/findAllLogs").forward (request,response);
    }
}
