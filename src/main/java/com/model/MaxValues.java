package com.model;

import java.util.ArrayList;

public class MaxValues {
    private double millage;
    private double numberOfDays;
    private ArrayList<String> receipts = new ArrayList<>();


    private double millageRates;

    private double dailyRates;

    public MaxValues(){
        receipts.add("Taxi");
        receipts.add("Hotel");
        receipts.add("Air Ticket");
        receipts.add("Train Ticket");
        receipts.add("Dinner");
        millageRates = 0.3;
        dailyRates = 15;
        millage = 100000;
        numberOfDays = 10000;

    }

    public double getMillage() {
        return millage;
    }

    public void setMillage(double millage){
        this.millage = millage;
    }

    public double getNumberOfDays(){return numberOfDays;}

    public void setNumberOfDays(double numberOfDays){this.numberOfDays=numberOfDays;}

    public ArrayList<String> getReceipts() {
        return receipts;
    }
    public void setReceipts(ArrayList<String> list){
        receipts = list;
    }
    public void addReceipts(String item){
        receipts.add(item);
    }


    public double getDailyRates() {
        return dailyRates;
    }

    public void setDailyRates(double dailyRates) {
        this.dailyRates = dailyRates;
    }

    public double getMillageRates() {
        return millageRates;
    }

    public void setMillageRates(double millageRates) {
        this.millageRates = millageRates;
    }
}
