package com.model;

public final class MaxValuesHolder {
    private  MaxValues maxValues;
    private final static MaxValuesHolder INSTANCE = new MaxValuesHolder();

    private MaxValuesHolder(){};

    public static MaxValuesHolder getInstance(){
        return INSTANCE;
    }

    public void setMaxValues(MaxValues maxValues){
        this.maxValues=maxValues;
    }

    public MaxValues getMaxValues(){
        return maxValues;
    }

}
