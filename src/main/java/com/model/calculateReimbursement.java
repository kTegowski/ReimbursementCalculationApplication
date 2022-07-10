package com.model;

public class calculateReimbursement {
    static double totalReimbursement;
    static double millage;
    static double numberOfDays;
    public static double Calculate(MaxValues maxValues, ReimbursementClaim reimbursementClaim){
        if(maxValues.getMillage()>= reimbursementClaim.getMillage()){
            millage = reimbursementClaim.getMillage();
        }
        else millage = reimbursementClaim.getMillage()-maxValues.getMillage();

        if(maxValues.getNumberOfDays() >= reimbursementClaim.getNumberOfDays()){
            numberOfDays = reimbursementClaim.getNumberOfDays();
        }
        else numberOfDays = reimbursementClaim.getNumberOfDays()- maxValues.getNumberOfDays();
        double receiptsRate = 0;
        for (float s:reimbursementClaim.getReceipts().values()) {
            receiptsRate = receiptsRate + s;
        }

        totalReimbursement = millage * maxValues.getMillageRates() + numberOfDays * maxValues.getDailyRates()
                + receiptsRate;

        return totalReimbursement;
    }

}
