package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {


    //!creating the main method
    public static void main(String[] args) {

        //?creating the phones
        CellPhone thatPhone2 = new CellPhone();

        CellPhone thePhone1 = new CellPhone();

        //!Creating the scanner
        Scanner input = new Scanner(System.in);

        //*Intro
        System.out.println("\u001B[31m+++++++++Please enter Info here++++++++\u001B[0m\n");

        //?Using the method to ask the questions
        display(thatPhone2);
        display(thePhone1);

        //?Printing out the results of the phone number
        thatPhone2.dial(thePhone1.getPhoneNumber());
        System.out.print("""
                \n\n\
                \u001B[35m===========Second phone calling the other phone===========\u001B[0m
                \n\n""");
        thePhone1.dial(thatPhone2.getPhoneNumber());


    }

    //!Creating method for question
    public static String askQuestion(Scanner scanner, String question) {

        System.out.print(question + "~ ");
        return scanner.nextLine().trim();
    }

    //!Method to pull user info via questions
    public static void display(CellPhone phone2) {

        //!Creating my scanner
        Scanner input = new Scanner(System.in);

        //*user phone info
        phone2.setSerialNumber(Integer.parseInt(askQuestion(input, "What is the serial number\n")));
        phone2.setModel(askQuestion(input, "What model of phone\n"));
        phone2.setCarrier(askQuestion(input, "Who is your carrier\n"));
        phone2.setPhoneNumber(askQuestion(input, "What is your phone number\n"));
        phone2.setOwner(askQuestion(input, "Who is the owner\n"));


    }


}
