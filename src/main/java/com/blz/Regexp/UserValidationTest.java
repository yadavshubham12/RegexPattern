package com.blz.Regexp;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserValidationTest {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        validateInput(firstName, (s) -> s.matches("[A-Z][a-zA-Z]*"));

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();
        validateInput(lastName, (s) -> s.matches("[a-zA-Z]+([ '-][a-zA-Z]+)*"));

        System.out.print("Enter email: ");
        String email = sc.nextLine();
        validateInput(email, (s) -> s.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));

        System.out.print("Enter mobile: ");
        String mobile = sc.nextLine();
        validateInput(mobile, (s) -> s.matches("[0-9]{10}"));

        System.out.print("Enter password: ");
        String password = sc.nextLine();
        validateInput(password, (s) -> s.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}"));
    }

    private static void validateInput(String input, Predicate<String> validationRule) {
        if (validationRule.test(input)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
