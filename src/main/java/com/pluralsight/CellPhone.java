package com.pluralsight;


// Create the blueprint for a CellPhone and declare the properties every phone will have. I.E The materials
public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;
//contructs the object
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }

    // the objects are private so you have to make setters and getters for them to be called and set in the main class , this allows for more secuirty.

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

    public String getphoneNumber() {
        return phoneNumber;
    }

    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
//creates a method that can be called in main that prints out what phone number the usewr has dialed
    public void dial(String phoneNumber){
        System.out.println(this.owner + "'s phone is calling " + phoneNumber);
    }


}