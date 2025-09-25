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

//        Step 1

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

//        Step 2

//        1. Declare AND initialize variables for:

//        2. The number of days in a week
        int daysInWeek = 7;
        System.out.println("There are " + daysInWeek + " days in a week");

//        3. The price of coffee ($4.99)
        double coffeePrice = 4.99;
        System.out.println("The price for coffee is " + coffeePrice + "$");

//        4. Your favorite letter
        char myFavLetter = 'Z';
        System.out.println("My favorite letter is " + myFavLetter);

//        5. Whether it's raining (true/false)
        boolean isRaining = false;
        System.out.println("Is it raining " + isRaining);

    }
}
