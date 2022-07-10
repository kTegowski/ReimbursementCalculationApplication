package com.model;

import javax.enterprise.inject.Default;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.HashMap;

public class ReimbursementClaim {
    private double millage;
    private HashMap<String, Float> receipts = new HashMap<>();
    private LocalDate startDate;
    private LocalDate endDate;
    private long numberOfDays;
    private double totalCost = 0;
    public double getMillage() {
        return millage;
    }


    public long getNumberOfDays() {
        return numberOfDays;
    }

    public HashMap<String, Float> getReceipts() {
        return receipts;
    }

    private static String fitToCase(String name){
        if(MaxValuesHolder.getInstance().getMaxValues() == null){MaxValuesHolder.getInstance().setMaxValues(new MaxValues());}
        switch (name){
            case ("0"):
                return MaxValuesHolder.getInstance().getMaxValues().getReceipts().get(0);
            case ("1"):
                return MaxValuesHolder.getInstance().getMaxValues().getReceipts().get(1);
            case ("2"):
                return MaxValuesHolder.getInstance().getMaxValues().getReceipts().get(2);
            case("3"):
                return MaxValuesHolder.getInstance().getMaxValues().getReceipts().get(3);
            case ("4"):
                return MaxValuesHolder.getInstance().getMaxValues().getReceipts().get(4);
            default:
                return "";
        }
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public static final class Builder{
        private double millage;
        private  HashMap<String, Float> receipts = new HashMap<>();
        private LocalDate startDate;
        private LocalDate endDate;
        private long numberOfDays;
        private double totalCost;

        public Builder millage(double millage){
            this.millage=millage;
            return this;
        }
        public Builder startDate(LocalDate startDate){
            this.startDate = startDate;
            return this;
        }
        public Builder endDate(LocalDate endDate){
            this.endDate = endDate;
            return this;
        }
        public Builder addReceipts(String name, String cost){
            if(!name.isEmpty() && !cost.isEmpty()){
            receipts.put(fitToCase(name), Float.parseFloat(cost));}
            return this;
        }

        public ReimbursementClaim build(){
            ReimbursementClaim reimbursementClaim = new ReimbursementClaim();
            reimbursementClaim.millage = this.millage;
            reimbursementClaim.startDate = this.startDate;
            reimbursementClaim.endDate = this.endDate;
            reimbursementClaim.numberOfDays = ChronoUnit.DAYS.between(startDate,endDate) + 1;
            reimbursementClaim.receipts = this.receipts;
            return reimbursementClaim;
        }
    }


}
