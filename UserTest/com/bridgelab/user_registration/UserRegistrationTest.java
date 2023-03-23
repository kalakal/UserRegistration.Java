package com.bridgelab.user_registration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
// UC-10 - JUnit test to validiate user information.
class UserTest {

    //happy test case for first name.
    @Test
    public void testFirstNameReturnTrue() {

        boolean result = UserRegistration.firstName("Sayed");
        assertEquals(true, result);

    }

    //Sad test case for first name.
    @Test
    public void testFirstNameReturnFalse() {

        boolean result = UserRegistration.firstName("Faizan");
        assertEquals(true, result);

    }

    //happy test case for last name.
    @Test
    public void testLastNameReturnTrue() {

        boolean result = UserRegistration.lastName("Simnani");
        assertEquals(true, result);

    }
    //Sad test case for last name.
    @Test
    public void testLastNameReturnFalse() {

        boolean result = UserRegistration.lastName("simnani");
        assertEquals(true, result);

    }
    //happy test case for email .
    @Test
    public void testEmailReturnTrue() {

        boolean result = UserRegistration.email("sayedfaizanqadri@gmail.com");
        assertEquals(true, result);

    }
    //sad test case for email.
    @Test
    public void testEmailReturnFalse() {

        boolean result = UserRegistration.email("sayedfaizanqadri@gmail.com");
        assertEquals(true, result);

    }

    //happy test case for mobile number.
    @Test
    public void testMobileNumberReturnTrue() {

        boolean result = UserRegistration.mobileNumber("9906276508");
        assertEquals(true, result);

    }

    //sad  test case for mobile number.
    @Test
    public void testMobileNumberReturnFalse() {

        boolean result = UserRegistration.mobileNumber("9906276508");
        assertEquals(true, result);

    }

    //happy test case for password.
    @Test
    public void testPasswordReturnTrue() {

        boolean result = UserRegistration.password("Faian$123");
        assertEquals(true, result);

    }

    //sad test case for pasword.
    @Test
    public void testPasswordReturnFalse() {

        boolean result = UserRegistration.password("Faian123");
        assertEquals(true, result);

    }
}
