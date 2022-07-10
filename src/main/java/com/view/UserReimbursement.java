package com.view;

import com.model.*;

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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;


@WebServlet("/UserReimbursement")
public class UserReimbursement extends HttpServlet {

    public void init() {

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession httpSession = request.getSession();

        httpSession.setAttribute("username", UserHolder.getInstance().getUsername());
        httpSession.setAttribute("millage", ReimbursementClaimHolder.getInstance().getReimbursementClaim().getMillage());
        httpSession.setAttribute("numberOfDays", ReimbursementClaimHolder.getInstance().getReimbursementClaim().getNumberOfDays());
        request.setAttribute("dataList", ReimbursementClaimHolder.getInstance().getReimbursementClaim().getReceipts());
        httpSession.setAttribute("cost", ReimbursementClaimHolder.getInstance().getReimbursementClaim().getTotalCost());

        RequestDispatcher rs = request.getRequestDispatcher("UserReimbursement.jsp");
        rs.include(request,response);
        response.setContentType("text/html");


    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    public void destroy() {
    }
}