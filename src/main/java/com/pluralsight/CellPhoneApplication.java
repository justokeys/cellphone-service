package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {


    public static  void main(String[] args) {
        Scanner thescanner = new Scanner(System.in);

        CellPhone myPhone = new CellPhone();

        System.out.println("What is the serial number?");

        int serialNumber = thescanner.nextInt();
        thescanner.nextLine();
        System.out.println("WHat is the model?");

        String phModel = thescanner.nextLine();

        System.out.println("WHo is the Carrier?");

        String phCarrier = thescanner.nextLine();

        System.out.println("WHat is the phone number?");

        String phoneNumber = thescanner.nextLine();

        System.out.println("WHo is the owner?");

        String owner = thescanner.nextLine();




        myPhone.setSerialNumber(serialNumber);
        myPhone.setModel(phModel);
        myPhone.setCarrier(phCarrier);
        myPhone.setphoneNumber(phoneNumber);
        myPhone.setOwner(owner);


       int sNum = myPhone.getSerialNumber();
       String pModel = myPhone.getModel();
       String pCarrier = myPhone.getCarrier();
       String pNum = myPhone.getphoneNumber();
       String pOwner = myPhone.getOwner();

        System.out.println(pOwner + " owns a " + pCarrier + " " + pModel + ".");
        System.out.println("Phone number: " + pNum);
        System.out.println("Serial number: " + sNum);







    }
}
