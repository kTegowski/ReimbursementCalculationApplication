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

@WebServlet(name = "/LoadingData", value = "/LoadingData")
public class LoadingData extends HttpServlet {
    ReimbursementClaim reimbursmentClaim;

    public void init() {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        ReimbursementClaimHolder.getInstance().setReimbursementClaim(reimbursmentClaim = new ReimbursementClaim.Builder()
                .millage(Double.parseDouble(request.getParameter("millage")))
                .startDate(LocalDate.parse(request.getParameter("startday"), formatter))
                .endDate(LocalDate.parse(request.getParameter("lastday"), formatter))
                .addReceipts(request.getParameter("receipts1"), request.getParameter("cost1"))
                .addReceipts(request.getParameter("receipts2"), request.getParameter("cost2"))
                .addReceipts(request.getParameter("receipts3"), request.getParameter("cost3"))
                .addReceipts(request.getParameter("receipts4"), request.getParameter("cost4"))
                .addReceipts(request.getParameter("receipts5"), request.getParameter("cost5"))
                .build());


        ReimbursementClaimHolder.getInstance().getReimbursementClaim().setTotalCost(calculateReimbursement.Calculate(new MaxValues(),ReimbursementClaimHolder.getInstance().getReimbursementClaim()));
        //ReimbursementClaimHolder.getInstance().setReimbursementClaim(reimbursmentClaim);
        response.sendRedirect(request.getContextPath() + "/UserReimbursement");
        }




    public void destroy() {
    }
}