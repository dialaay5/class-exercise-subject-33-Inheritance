package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChairTable extends Chair{
    private boolean isAllowAdjustments;
    private boolean isSpinning;
    private boolean hasDiscount;
    private double discountAmount;

    public ChairTable(int numberOfLegs, String model, double price ,
                      boolean isAllowAdjustments, boolean isSpinning ,boolean hasDiscount, double discountAmount) {
        super(numberOfLegs, model, price);
        this.isAllowAdjustments = isAllowAdjustments;
        this.isSpinning = isSpinning;
        this.hasDiscount = hasDiscount;
        this.discountAmount = discountAmount;
    }

    @Override
    public String printChair() {
        return "Class ChairTable {" +
                "super:[" + super.printChair() + "] " +
                ", isAllowAdjustments= " + isAllowAdjustments +
                ", isSpinning= " + isSpinning +
                ", hasDiscount= " + hasDiscount +
                ", discountAmount= " + discountAmount +
                '}';
    }

    @Override
    public double calculatePrice(int numberOfChairs){
        return(numberOfChairs * super.getPrice() * getDiscountAmount());
    }
}
