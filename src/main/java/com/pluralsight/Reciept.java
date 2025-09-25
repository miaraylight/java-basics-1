package com.pluralsight;

public class Reciept {
    public static void main(String[] args) {
        String itemName = "Glasses";
        double itemPrice = 80.99;
        int count = 5;

        System.out.println("You bought " + count + " " + itemName + " for " + itemPrice * count + "$");
    }
}
