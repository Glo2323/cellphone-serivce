package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {


    public static void main(String[] args) {

        CellPhone newPhoneWhoDis = new CellPhone();

        Scanner input = new Scanner(System.in);

        newPhoneWhoDis.setSerialNumber(Integer.parseInt(askQuestion(input, "What is the serial number")));
        newPhoneWhoDis.setModel(askQuestion(input, "What model of phone?"));
        newPhoneWhoDis.setCarrier(askQuestion(input, "Who is your carrier"));
        newPhoneWhoDis.setPhoneNumber(askQuestion(input, "What is your phone number"));
        newPhoneWhoDis.setOwner(askQuestion(input, "Who is the owner"));

        System.out.println(newPhoneWhoDis.toString());

        System.out.println("Serial Number: " + newPhoneWhoDis.getSerialNumber());
        System.out.println("Model: " + newPhoneWhoDis.getModel());
        System.out.println("Carrier: " + newPhoneWhoDis.getCarrier());
        System.out.println("Phone Number: " + newPhoneWhoDis.getPhoneNumber());
        System.out.println("Owner: " + newPhoneWhoDis.getOwner());

    }

    public static  String askQuestion(Scanner scanner, String question){

        System.out.println(question + ": ");
        return scanner.nextLine().trim();
    }

}
