package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {


    public static  void main(String[] args) {
        Scanner thescanner = new Scanner(System.in);

        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

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




        cellPhone1.setSerialNumber(serialNumber);
        cellPhone1.setModel(phModel);
        cellPhone1.setCarrier(phCarrier);
        cellPhone1.setphoneNumber(phoneNumber);
        cellPhone1.setOwner(owner);


        cellPhone2.setSerialNumber(9993393);
        cellPhone2.setModel("Iphone 16");
        cellPhone2.setCarrier("T-Mobile");
        cellPhone2.setphoneNumber("310-888-9999");
        cellPhone2.setOwner("Batman");


        int sNum = cellPhone1.getSerialNumber();
       String pModel = cellPhone1.getModel();
       String pCarrier = cellPhone1.getCarrier();
       String pNum = cellPhone1.getphoneNumber();
       String pOwner = cellPhone1.getOwner();

        System.out.println(pOwner + " owns a " + pModel + ".");
        System.out.println("Carrier: " + pCarrier);
        System.out.println("Phone number: " + pNum);
        System.out.println("Serial number: " + sNum);

        cellPhone1.dial(phoneNumber);



    }
    public static void display1(CellPhone phone) {

        System.out.println(phone.getOwner()  + " owns a " + phone.getOwner() + ".");
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getphoneNumber());
        System.out.println("Serial number: " + phone.getSerialNumber());


    }


    }
