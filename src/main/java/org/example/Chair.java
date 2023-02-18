package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Chair {
    private int numberOfLegs;
    private String model;
    private double price;


    public Chair(int numberOfLegs, String model, double price) {
        this.numberOfLegs = numberOfLegs;
        this.model = model;
        this.price = price;
    }

    public String printChair() {
        return "Class Chair {" +
                "numberOfLegs= " + numberOfLegs +
                ", model= " + model +
                ", price= " + price +
                '}';
    }


    public double calculatePrice(int numberOfChairs){
        return(numberOfChairs * getPrice());
    }
}
