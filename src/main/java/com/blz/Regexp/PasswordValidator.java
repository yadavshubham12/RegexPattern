package com.blz.Regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    private static final String RULE_UPPERCASE = ".*[A-Z].*";
    private static final int MIN_LENGTH = 8;

    public static boolean isValid(String password) {
        if (password.length() < MIN_LENGTH) {
            return false;
        }

        Pattern pattern = Pattern.compile(RULE_UPPERCASE);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (isValid(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid.");
        }
    }
}

