package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserRegistrationTest {
    UserRegistration u1 = new UserRegistration();

    @Test
    public void givenFirstName_whenValid_thenReturnTrue() {
        String name = "SAlman";
        boolean firstName = false;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserExcpect.class);
            firstName = u1.validatName(name);
           //
        } catch (UserExcpect e) {
            e.printStackTrace();
            Assert.assertTrue(firstName);
        }
    }


    @Test
    public void givenLastName_whenValid_thenReturnFalse() {
        String name = "mohammed";
        boolean firstName = false;
        try {
            firstName = u1.validatName(name);
            Assert.assertTrue(firstName);
        } catch (UserExcpect UserExcpect) {
            System.out.println("Hpie");
        }

    }

    @Test
    public void giveEmail_AsTrue_When_its_Valid() {
        String input = "rmdsalman001@gmail.com";
        boolean email = false;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserExcpect.class);
            email = u1.ValidEmail(input);

        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertTrue(email);
        }

    }

    @Test
    public void giveEmail_AsFalse_When_its_Valid() {
        String input = "1Rmdsalman001@gmail.com";
        boolean email = false;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserExcpect.class);
            email = u1.ValidEmail(input);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertEquals(false,email);
        }

    }

    @Test
    public void givenMobile_whenValid_thenReturnTrue() {
        String name = "+91 9988776655";
        boolean mobile = false;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserExcpect.class);
            mobile = u1.MobileParttern(name);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertEquals(true,mobile);
        }

    }
    @Test
    public void givenMobile_whenValid_thenReturnFalse() {
        String name = "988776655";
        boolean mobile = false;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserExcpect.class);
            mobile = u1.MobileParttern(name);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertEquals(false,mobile);
        }

    }
    @Test
    public void givenPassWord_whenValid_thenReturnFalse() {
        String name = "A@112";
        boolean password = false;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserExcpect.class);
            password = u1.MobileParttern(name);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertEquals(false,password);
        }

    }
    @Test
    public void givenPassWord_whenValid_thenReturnTrue() {
        String name = "saddaA@112";
        boolean password = false;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserExcpect.class);
            password = u1.PassWordParttern(name);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertEquals(false, password);
        }

       }
}

