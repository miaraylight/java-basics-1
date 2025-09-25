package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
        int myNum = 123;

        myNum += 1;
        System.out.println("The result is " + myNum);

        myNum *= 10;
        System.out.println("The result is " + myNum);

        myNum /= 2;
        System.out.println("The result is " + myNum);

        myNum -= 1;
        System.out.println("The result is " + myNum);

//        1. Declare a variable to store your favorite color
        String myFavColor = "black";
        System.out.println("My favorite color is " + myFavColor);

//        2. Declare a variable to store the year you started this class
        int yearYU = 2025;
        System.out.println("Year I started this class " + yearYU);

//        3. Declare a variable to store your middle initial
        char midIn = 'M';
        System.out.println("My middle initial " + midIn);

//        4. Declare a variable to store whether you have pets (yes/no)
        boolean pet = false;
        System.out.println("Whether you have pets " + pet);

//        5. Declare a variable with a nice message or saying
        String quote = "It always seems impossible until it's done";
        System.out.println(quote);

    }
}
