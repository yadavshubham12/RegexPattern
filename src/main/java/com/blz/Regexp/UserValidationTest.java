package com.blz.Regexp;

import org.testng.annotations.Test;

public class UserValidationTest {
    @Test
    public void happyTestCase() {
        User user = new User("Shubham", "Yadav", "Shubham@example.com", "1234567890", "password");
        boolean result = user.validate();
        assert equals(true, result);
    }

    @Test
    public void sadTestCase_InvalidEmail() {
        User user = new User("Shubham", "Yadav", "Shubhamexample.com", "1234567890", "password");
        boolean result = user.validate();
        assertEquals(false, result);
    }

    @Test
    public void sadTestCase_InvalidMobile() {
        User user = new User("Jane", "Doe", "janedoe@example.com", "123456", "password");
        boolean result = user.validate();
        assertEquals(false, result);
    }

    @Test
    public void sadTestCase_InvalidPassword() {
        User user = new User("Jane", "Doe", "janedoe@example.com", "1234567890", "pass");
        boolean result = user.validate();
        assertEquals(false, result);
    }
}
