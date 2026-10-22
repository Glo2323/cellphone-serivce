package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    //!creating the main method
    public static void main(String[] args) {

        //?Connecting the cellphone to the app/ creating the phone
        CellPhone newPhoneWhoDis = new CellPhone();

        //!Creating the scanner
        Scanner input = new Scanner(System.in);

        //?Using the method to ask the questions
        newPhoneWhoDis.setSerialNumber(Integer.parseInt(askQuestion(input, "What is the serial number")));
        newPhoneWhoDis.setModel(askQuestion(input, "What model of phone?"));
        newPhoneWhoDis.setCarrier(askQuestion(input, "Who is your carrier"));
        newPhoneWhoDis.setPhoneNumber(askQuestion(input, "What is your phone number"));
        newPhoneWhoDis.setOwner(askQuestion(input, "Who is the owner"));


        //?Printing out the results of the phone number
        System.out.println(newPhoneWhoDis.toString());
        

    }

    //!Creating method for question
    public static  String askQuestion(Scanner scanner, String question){

        System.out.print(question + ": ");
        return scanner.nextLine().trim();
    }

}
