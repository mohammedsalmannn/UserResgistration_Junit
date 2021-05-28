package com.bridgelabz.com.bridgelabz;

import com.bridgelabz.UserRegistration;
import com.bridgelabz.UserRegistrationTest;
import org.junit.Assert;
import org.junit.Test;
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
        return Arrays.asList(new Object[][]{{"abc@gmail.com", false},
                                            { "rmdsalman001@gmail.com", false  },
                                            { "1rmdsalman001@gmail.com",true  }

         });
    }

    @Test
    public void emailChecker() {
        boolean result = u1.giveEmail_AsTrue_When_its_Valid(email);
        Assert.assertEquals(this.status,result);
    }
    @Test
    public void emailChecker1() {
        boolean result = u1.giveEmail_AsFalse_When_its_Valid(email);
        Assert.assertEquals(this.status,result);
    }
}
