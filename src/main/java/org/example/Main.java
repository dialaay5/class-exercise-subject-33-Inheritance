package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Chair chair1 = new Chair(4, "chair", 350.5d);
        System.out.println(chair1.printChair());
        System.out.format("the price you have to pay : %s$\n\n", chair1.calculatePrice(5));

        ChairTable chairTable1 = new ChairTable(4,"chair table",120.5d,false,false,false,1d);
        System.out.println(chairTable1.printChair());
        System.out.format("the price you have to pay : %s$\n\n", chairTable1.calculatePrice(8));

        ChairOffice chairOffice1 = new ChairOffice(5,"chair office",140.5d,true,true,true,0.6d);
        System.out.println(chairOffice1.printChair());
        System.out.format("the price you have to pay : %s$\n", chairOffice1.calculatePrice(10));
    }
}