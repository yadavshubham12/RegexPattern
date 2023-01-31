package com.blz.Regexp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        System.out.println("Enter an email");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        String emailRegex = "^[a-zA-z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z]+\\.[a-zA-Z]{2,}([.][a-zA-Z]{2,})*$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid Email");
        }
        else {
            System.out.println("Invalid Email");
        }

    }
}
