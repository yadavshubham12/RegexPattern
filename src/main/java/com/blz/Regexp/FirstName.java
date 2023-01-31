package com.blz.Regexp;

import java.util.Scanner;

public class FirstName {
    public static void main(String[] args) {
        System.out.print("Enter a first name: ");
        Scanner scannner = new Scanner(System.in);
        String firstName = scannner.nextLine();
        if (firstName.length() >= 3 && Character.isUpperCase(firstName.charAt(0))) {
            System.out.println("Valid first name.");
        } else {
            System.out.println("Invalid first name.");
        }
    }
}
