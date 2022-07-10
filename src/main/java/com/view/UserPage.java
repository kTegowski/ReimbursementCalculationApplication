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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Enumeration;

import com.model.*;


@WebServlet("/UserPage")
public class UserPage extends HttpServlet {
    ReimbursementClaim reimbursmentClaim;

    public void init() {

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("username", UserHolder.getInstance().getUsername());
        if(MaxValuesHolder.getInstance().getMaxValues() == null){
            MaxValuesHolder.getInstance().setMaxValues(new MaxValues());
        }
        request.setAttribute("dataList", MaxValuesHolder.getInstance().getMaxValues().getReceipts());
        RequestDispatcher rs = request.getRequestDispatcher("UserPage.jsp");
        rs.include(request,response);

        response.setContentType("text/html");



    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }

    public void destroy() {
    }
}