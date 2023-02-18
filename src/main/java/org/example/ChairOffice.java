package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChairOffice extends Chair{

    private boolean isAllowAdjustments;
    private boolean isSpinning;
    private boolean hasDiscount;
    private double discountAmount;

    public ChairOffice(int numberOfLegs, String model, double price ,
                      boolean isAllowAdjustments, boolean isSpinning ,boolean hasDiscount, double discountAmount) {
        super(numberOfLegs, model, price);
        this.isAllowAdjustments = isAllowAdjustments;
        this.isSpinning = isSpinning;
        this.hasDiscount = hasDiscount;
        this.discountAmount = discountAmount;
    }

    @Override
    public String printChair() {
        return "Class ChairOffice {" +
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
