package com.view;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import com.model.Validate;

@WebServlet(name = "/", value = "/")
public class HelloServlet extends HttpServlet {


    public void init() {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String result = Validate.checkLog(username,password);

        if(result.equals("Invalid data")){

            RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
            rs.include(request,response);
            out.println("Invalid data");
        } else {

            RequestDispatcher rs = request.getRequestDispatcher("login");
            rs.forward(request,response);
        }


    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

    }
    public void destroy() {
    }
}