package com.example.java;
import java.util.Scanner;
//Program will print the users information using the same method, which has 2 signatures: One that will take 2 strings
// as parameters and one that will take 3 strings as parameters
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number that correlates with your position: ");
        System.out.println();
        System.out.println("1. Residential Customer");
        System.out.println("2. Business Customer");

        switch (scanner.nextInt()){
            case 1:

                System.out.println("Please enter the name:");
                String name = scanner.next();

                System.out.println("Please enter the phone number: ");
                String phone = scanner.next();

                Customer_print(name,phone);

                break;

            case 2:

                System.out.println("Please enter the name of the business: ");
                String business = scanner.next();

                System.out.println("Please enter the name: ");
                String _name = scanner.next();

                System.out.println("Please enter the phone number: ");
                String _phone = scanner.next();

                Customer_print(business,_name,_phone);

                break;


            default:

                System.out.println("Error: The entry was invalid.");
                break;
        }




    }

    //The method that will execute if their are two string parameters
    private static void Customer_print(String name, String phone_number){
        System.out.println(name);
        System.out.println(phone_number);

    }
    //the method that will execute if their are three string parameters
    private static void Customer_print(String business_name, String name, String phone_number){
        System.out.println(business_name);
        System.out.println(name);
        System.out.println(phone_number);

    }

}


