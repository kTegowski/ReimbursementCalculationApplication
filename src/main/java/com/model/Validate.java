package com.model;

import com.view.UserHolder;

public class Validate {
    public static String checkLog(String username, String password ){

        if(username.equals("admin")){
            if (password.equals("admin")){
                return "admin";
            }
        }
        else if (username.equals("user")) {
            if (password.equals("user")){
                return "user";
            }
        }

        return "Invalid data";
    }

}
