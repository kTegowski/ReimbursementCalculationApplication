package com.view;

public class UserHolder {
    public String username;
    private  static UserHolder INSTANCE = new UserHolder();


    private UserHolder(){
    }
    public static UserHolder getInstance(){
        return INSTANCE;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }
}
