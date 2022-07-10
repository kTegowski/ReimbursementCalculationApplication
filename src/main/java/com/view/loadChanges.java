package com.view;

import com.model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@WebServlet(name = "/loadChanges", value = "/loadChanges")
public class loadChanges extends HttpServlet {
    ReimbursementClaim reimbursmentClaim;

    public void init() {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        MaxValuesHolder.getInstance().getMaxValues().setMillage(Double.parseDouble(request.getParameter("millage")));
        MaxValuesHolder.getInstance().getMaxValues().setNumberOfDays(Double.parseDouble(request.getParameter("numOfDays")));
        ArrayList<String> buffor = new ArrayList<>();
        buffor.add(request.getParameter("receipts1"));
        buffor.add(request.getParameter("receipts2"));
        buffor.add(request.getParameter("receipts3"));
        buffor.add(request.getParameter("receipts4"));
        buffor.add(request.getParameter("receipts5"));
        MaxValuesHolder.getInstance().getMaxValues().setReceipts(buffor);
        MaxValuesHolder.getInstance().getMaxValues().setMillageRates(Double.parseDouble(request.getParameter("millagerate")));
        MaxValuesHolder.getInstance().getMaxValues().setDailyRates(Double.parseDouble(request.getParameter("dailyrate")));
        response.sendRedirect(request.getContextPath() + "/AdminPage");
        }




    public void destroy() {
    }
}