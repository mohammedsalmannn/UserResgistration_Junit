package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    String NamePattern = "^[A-Z][a-z]{3,}$";
    String EmailParttern = "^[a-z][0-9A-Za-z]+([-_+.][0-9A-Za-z]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    String MobileParttern = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";
    String PassWordParttern = "[*.! @#$%^&(){}[]:;<>,.?/~_+-=|\\]]]";
    public static void main(String[] args) {

    }
    // Name method
    public boolean validatName(String name) {
       // return (Pattern.matches(NamePattern, name));
        Pattern pattern = Pattern.compile(EmailParttern);
        Matcher matcher = pattern.matcher(name);
                return matcher.find();
    }
    public boolean ValidEmail (String email){
        Pattern pattern = Pattern.compile(NamePattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public boolean InvalidEmail(String email) {
        Pattern pattern = Pattern.compile(NamePattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public boolean MobileParttern(String mobile) {
        Pattern pattern = Pattern.compile(MobileParttern);
        Matcher matcher = pattern.matcher(mobile);
        return matcher.find();
    }
    public boolean PassWordParttern(String password) {
        Pattern pattern = Pattern.compile(PassWordParttern);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}

