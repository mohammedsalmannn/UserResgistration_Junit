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
    public boolean validatName(String name)  throws UserExcpect {
       // return (Pattern.matches(NamePattern, name));
       try {
           Pattern pattern = Pattern.compile(NamePattern);

           Matcher matcher = pattern.matcher(name);
           return matcher.find();
       }catch (NullPointerException e){
           throw new UserExcpect("Enter the Valid Message");
       }
    }
    public boolean ValidEmail (String email) throws UserExcpect{
        try {
            Pattern pattern = Pattern.compile(NamePattern);

        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }catch (Exception e){
            throw new UserExcpect("Enter Valid Email");
        }
    }

    public boolean InvalidEmail(String email) throws UserExcpect{
        try {
            Pattern pattern = Pattern.compile(NamePattern);

            Matcher matcher = pattern.matcher(email);
            return matcher.find();
        }catch (Exception e)
        {
            throw new UserExcpect("Your Email is InValid");
        }
    }

    public boolean MobileParttern(String mobile) throws UserExcpect{
       try {
           Pattern pattern = Pattern.compile(MobileParttern);

           Matcher matcher = pattern.matcher(mobile);
           return matcher.find();
       }catch (Exception e){
           throw new UserExcpect("Invalid Mobile");
       }
    }
    public boolean PassWordParttern(String password) throws UserExcpect{
        try {
            Pattern pattern = Pattern.compile(PassWordParttern);

            Matcher matcher = pattern.matcher(password);
            return matcher.find();
        }catch (Exception e){
            throw new UserExcpect("Enter a Valid Password");
        }
    }
}

