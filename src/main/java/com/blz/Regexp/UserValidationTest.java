package com.blz.Regexp;

import org.testng.annotations.Test;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
    public class EmailValidationTest {

        private String email;
        private boolean expectedResult;

        public EmailValidationTest(String email, boolean expectedResult) {
            this.email = email;
            this.expectedResult = expectedResult;
        }
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][] {
                    {"shubham.yadav@example.com", true},
                    {"shubham_yadav@example.com", true},
                    {"shubhamyadav@sub.example.com", true},
                    {"shubhamyadav@example", false},
                    {"shubhamyadavexample.com", false},
                    {"@example.com", false}
            });
        }
        @Test
        public void testEmailValidation() {
            boolean result = User.isValidEmail(email);
            assertEquals(expectedResult, result);
        }
    }