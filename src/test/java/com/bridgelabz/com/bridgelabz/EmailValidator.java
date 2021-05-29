package com.bridgelabz.com.bridgelabz;

import com.bridgelabz.UserExcpect;
import com.bridgelabz.UserRegistration;
import com.bridgelabz.UserRegistrationTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidator {
    UserRegistration u1 = new UserRegistration();
    UserRegistrationTest u2 = new UserRegistrationTest();
    public String email;
    public boolean status;

    public EmailValidator(String email, boolean status) {
        this.email = email;
        this.status = status;
    }
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{{"abc@gmail.com", true},
                                            { "rmdsalman001@gmail.com", true  },
                                            { "1rmdsalman001@gmail.com",false  }

         });
    }

    @Test
    public void emailChecker() {
        boolean result = false;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(UserExcpect.class);
            result = u1.ValidEmail(email);

        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertEquals(this.status,result);
        }

    }
    @Test
    public void emailChecker1() {
        boolean result = false;
        try {
            ExpectedException exception = ExpectedException.none();
            exception.expect(UserExcpect.class);
            result = u1.InvalidEmail(email);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertEquals(this.status,result);
        }

    }
}
