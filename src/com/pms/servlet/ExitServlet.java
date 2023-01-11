package com.pms.servlet;

import com.pms.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ExitServlet",value = "/ExitServlet")
public class ExitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        doPost(request,response);

    }
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
       request.setCharacterEncoding ("UTF-8");
       request.getSession ().removeAttribute ("message");
       response.sendRedirect (request.getContextPath ()+"/admin/login.jsp");
       return;
    }
}
