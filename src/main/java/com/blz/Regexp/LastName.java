package com.blz.Regexp;

import java.util.Scanner;

public class LastName {
    public static void main(String[] args) {
        System.out.println("Enter a Last Name");
        Scanner scanner = new Scanner(System.in);
        String lastName = scanner.nextLine();
        if (lastName.length() >= 3 && Character.isUpperCase(lastName.charAt(0))) {
            System.out.println("Valid Last Name");
        }else {
            System.out.println("Invalid Last Name");
        }
    }
}
