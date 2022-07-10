package com.view;

import com.model.MaxValues;
import com.model.MaxValuesHolder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "/AdminChangeMax", value = "/AdminChangeMax")
public class AdminChangeMax extends HttpServlet {


    public void init() {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("username", UserHolder.getInstance().getUsername());
        if(MaxValuesHolder.getInstance().getMaxValues() == null){
            MaxValuesHolder.getInstance().setMaxValues(new MaxValues());
        }
        httpSession.setAttribute("millage",MaxValuesHolder.getInstance().getMaxValues().getMillage() );
        httpSession.setAttribute("numberOfDays",MaxValuesHolder.getInstance().getMaxValues().getNumberOfDays() );
        httpSession.setAttribute("dataList",MaxValuesHolder.getInstance().getMaxValues().getReceipts() );

        RequestDispatcher rs = request.getRequestDispatcher("AdminChangeMax.jsp");
        rs.include(request,response);


    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }

    public void destroy() {
    }
}