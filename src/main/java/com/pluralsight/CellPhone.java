package com.pluralsight;

//!Creating cellphone class
public class CellPhone {

    //?Creating cellphone private date members (properties)
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;;


    //?Creating cellphone constructor
    public CellPhone() {

        //*set defaults for properties of this class
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }

    //!getters and setters to gather cellphone info
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    //!Creating the string to display the user answer
    public String toString() {
        return "CellPhone \n" +
                "serialNumber = " + serialNumber + "\n" +
                "model = " + model + "\n" +
                "carrier = " + carrier + "\n" +
                "phoneNumber =  " + phoneNumber + "\n" +
                "owner = " + owner;
    }


    //* Method for calling
    public void dial(String phoneNumber) {
        System.out.printf("%s's phone is calling %s", owner, phoneNumber);

    }




}
