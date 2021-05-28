package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    String NamePattern = "^[A-Z][a-z]{3,}$";
    String EmailParttern = "^[a-z][0-9A-Za-z]+([-_+.][0-9A-Za-z]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    public static void main(String[] args) {

    }
    // Name method
    public boolean validatName(String name) {
       // return (Pattern.matches(NamePattern, name));
        Pattern pattern = Pattern.compile(EmailParttern);
        Matcher matcher = pattern.matcher(name);
                return matcher.find();
    }
    public boolean giveEmail_AsTrue_When_its_Valid (String email){
        Pattern pattern = Pattern.compile(NamePattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public boolean giveEmail_AsFalse_When_its_Valid(String email) {
        Pattern pattern = Pattern.compile(NamePattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
}

