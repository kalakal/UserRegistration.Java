package com.bridgelab.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// UC8-Method for validation of Password with rule -4.
public class UserRegistration {

    public static boolean firstName(String firstName) {
        String regex = "^[A-Z]{1}[a-zA-Z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher match = p.matcher(firstName);
        if (match.matches()) {
            System.out.println(firstName + " : is a valid first name ");
            return true;
        } else {
            System.out.println(firstName + " : is a invalid first name ");
            return false;
        }
    }

    public static boolean lastName(String lastName) {
        String regex = "^[A-Z]{1}[a-zA-Z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher match = p.matcher(lastName);
        if (match.matches()) {
            System.out.println(lastName + " : is a valid last name ");
            return true;
        } else {
            System.out.println(lastName + " : is a invalid last name ");
            return false;
        }
    }

    public static boolean email(String email) {
        String regex = "^[a-z]{3,}[.+-_]*[a-z0-9]*{3,}[@][a-z0-9]{1,}[.][a-z]{2,}[.]*[a-z]*{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher match = p.matcher(email);
        if (match.matches()) {
            System.out.println(email + " : is a valid email ");
            return true;
        } else {
            System.out.println(email + " : is a invalid email ");
            return false;
        }
    }

    public static boolean mobileNumber(String mobile) {
        String regex = "^[0-9]{2}[0-9]{10}$";
        Pattern p = Pattern.compile(regex);
        Matcher match = p.matcher(mobile);
        if (match.matches()) {
            System.out.println(mobile + " : is a valid Mobile Number");
            return true;
        } else {
            System.out.println(mobile + " : is a invalid Mobile Number ");
            return false;
        }
    }

    public static boolean password(String password) {
        String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}";
        Pattern p = Pattern.compile(regex);
        Matcher match = p.matcher(password);
        if (match.matches()) {
            System.out.println(" Password is valid ");
            return true;
        } else {
            System.out.println(" Password is invalid ");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome in User registration program using Regex");
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "What do want enter \n1. First Name \n2. Last Name \n3. E-mail \n4. Mobile number \n5. Password ");
        int option = sc.nextInt();
        switch (option) {

            case 1:
                System.out.println("Enter First Name");
                String firstName = sc.next();
                firstName(firstName);
                break;

            case 2:
                System.out.println("Enter last Name");
                String lastName = sc.next();
                lastName(lastName);
                break;
            case 3:
                System.out.println("Enter e-mail");
                String email = sc.next();
                email(email);
                break;
            case 4:
                System.out.println("Enter Mobile Number");
                String mobile = sc.next();
                mobileNumber(mobile);
                break;
            case 5:
                System.out.println("Enter Password ");
                String password = sc.next();
                password(password);
                break;
        }
    }


}
