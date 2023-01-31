package com.blz.Regexp;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        System.out.println("Enter Valid Password:");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (password.length() >= 8) {
            System.out.println("Valid Password.");
        }
        else {
            System.out.println("Invalid Password.");
        }
    }
}
