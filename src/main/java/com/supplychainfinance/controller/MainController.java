package com.supplychainfinance.controller;

import java.io.IOException;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MainController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // Forward to the JSP page
        System.out.println("MainController doGet method called!");
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

}
