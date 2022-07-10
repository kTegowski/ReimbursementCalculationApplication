package com.view;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/login", value = "/login")
public class login extends HttpServlet {


    public void init() {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        UserHolder.getInstance().setUsername(request.getParameter("username"));
        if(request.getParameter("username").equals("admin")) {
            response.sendRedirect(request.getContextPath() + "/AdminPage");}
        else if (request.getParameter("username").equals("user")) {
            response.sendRedirect(request.getContextPath() + "/UserPage");}
        }




    public void destroy() {
    }
}