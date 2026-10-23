package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {


    //!creating the main method
    public static void main(String[] args) {

        //*Creating the phones
        CellPhone thatPhone2 = new CellPhone();

        CellPhone thePhone1 = new CellPhone();

        //*Creating my overloaded phone
        CellPhone whyPhone = new CellPhone("Iphone 7", 111111, "Messie", "214-563-9342", "Verizon");

        //*Intro
        System.out.println("\u001B[31m+++++++++Please enter Info here++++++++\u001B[0m\n");

        //*Using the method to ask for phone info

        phoneInfo(thatPhone2);

        System.out.print("\n");

        phoneInfo(thePhone1);

        //?Using the method to display the info
        display(thatPhone2);

        System.out.print("\n");

        display(thePhone1);

        System.out.print("\n");

        display(whyPhone);

        System.out.print("\n");

        //?Printing out the results of the phone number
        thatPhone2.dial(thePhone1.getPhoneNumber());

        System.out.print("""
                \n\n\
                \u001B[35m===========Second phone calling the other phone===========\u001B[0m
                \n\n""");

        thePhone1.dial(thatPhone2.getPhoneNumber());

        thePhone1.dial(whyPhone);

    }

    //!Creating method for question
    public static String askQuestion(Scanner scanner, String question) {

        System.out.print(question + "~ ");

        return scanner.nextLine().trim();
    }

    //!Method to pull user info via questions
    public static void phoneInfo(CellPhone phone2) {

        //*Creating my scanner
        Scanner input = new Scanner(System.in);

        //*Asking for user's phone serial number
        phone2.setSerialNumber(Integer.parseInt(askQuestion(input, "What is the serial number\n")));

        //*Asking for user's phone model
        phone2.setModel(askQuestion(input, "What model of phone\n"));

        //*Asking for user's phone provider
        phone2.setCarrier(askQuestion(input, "Who is your carrier\n"));

        //*Asking for user's phone number
        phone2.setPhoneNumber(askQuestion(input, "What is your phone number\n"));

        //*Asking for user's name
        phone2.setOwner(askQuestion(input, "Who is the owner\n"));

    }

     //!Creating a method that displays user info
    public static void display(CellPhone somePhone) {

        //*printing out the serial number
        System.out.println("Serial Number: " + somePhone.getSerialNumber());

        //*printing out the model
        System.out.println("Model: " + somePhone.getModel());

        //*printing out carrier
        System.out.println("Carrier: " + somePhone.getCarrier());

        //*printing out the owner
        System.out.println("Owner: " + somePhone.getOwner());

        //*printing out user phone number
        System.out.println("Phone Number: " + somePhone.getPhoneNumber());

    }


}
