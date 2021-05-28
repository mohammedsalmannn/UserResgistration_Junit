package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Parameter;

public class UserRegistrationTest {
    UserRegistration u1 = new UserRegistration();

    @Test
    public void givenFirstName_whenValid_thenReturnTrue() {
        String name = "salman";
        boolean firstName = u1.validatName(name);
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenLastName_whenValid_thenReturnFalse() {
        String name = "mohammed";
        boolean firstName = u1.validatName(name);
        Assert.assertFalse(firstName);
    }

    @Test
    public void giveEmail_AsTrue_When_its_Valid() {
        String input = "rmdsalman001@gmail.com";
        boolean email = u1.ValidEmail(input);
        Assert.assertTrue(email);
    }

    @Test
    public void giveEmail_AsFalse_When_its_Valid() {
        String input = "1Rmdsalman001@gmail.com";
        boolean email = u1.ValidEmail(input);
        //Assert.assertFalse(email);
        Assert.assertEquals(false,email);
    }

    @Test
    public void givenMobile_whenValid_thenReturnTrue() {
        String name = "+91 9988776655";
        boolean mobile = u1.MobileParttern(name);
        Assert.assertEquals(true,mobile);
    }
    @Test
    public void givenMobile_whenValid_thenReturnFalse() {
        String name = "988776655";
        boolean mobile = u1.MobileParttern(name);
        Assert.assertEquals(false,mobile);
    }
    @Test
    public void givenPassWord_whenValid_thenReturnFalse() {
        String name = "A@112";
        boolean password = u1.MobileParttern(name);
        Assert.assertEquals(false,password);
    }
    @Test
    public void givenPassWord_whenValid_thenReturnTrue() {
        String name = "saddaA@112";
        boolean password = u1.PassWordParttern(name);
        Assert.assertEquals(true,password);
    }
}

