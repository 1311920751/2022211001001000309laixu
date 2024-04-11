package com.laixu.week3.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

public class LifeCycleServlet extends HttpServlet {
    public LifeCycleServlet(){
        System.out.println("I an in construct --> LifeCycleServlet()");
    }
    @Override
    public void init(){
        System.out.println("I an in init()");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("I am in service () --> doGet()");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    public void destroy(){
        System.out.println("I am in destroy()");
    }
}