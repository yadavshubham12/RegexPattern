package com.blz.Regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNum {
    public static void main(String[] args) {
        System.out.println("Enter Valid Mobile Number");
        Scanner scanner = new Scanner(System.in);
        String mobileNo = scanner.nextLine();

        String mobileRegex = "^[0-9]{2} [0-9]{10}$";
        Pattern pattern = Pattern.compile(mobileRegex);
        Matcher matcher = pattern.matcher(mobileNo);
        if (matcher.matches()) {
            System.out.println("Valid Mobile Number");
        }
        else {
            System.out.println("Invalid Mobile Number");
        }
    }
}
