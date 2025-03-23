package com.assignment.project;
public class MasterClass {

    public static boolean checkEmail(String email) {
        if(email.contains(".*@(gmail|yahoo|hotmail)\\.com")){
            return email.matches(".*@(gmail|yahoo|hotmail)\\.com");
        }
        return false;
    }

    public static int getStringLength(String txt) {
        return txt.length();
    }

    public static String changeToUpper(String txt) {
        return txt.toUpperCase();
    }
    
    public static void main(String[] args) {

    }
}
