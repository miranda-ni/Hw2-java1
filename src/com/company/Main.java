package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Азамат";
        int age = 28;
        int temperature = 3;
        boolean itsNotCold = true;
        if ((age > 20 && age < 45) || (temperature < 30 && temperature > -20)) {
            System.out.println("можно идти гулять");
        } else {
            System.out.println("лучше поспать");
        }
        if (age < 20 || temperature > 0 && temperature < 28) {
            System.out.println("можно идти гулять");
        } else {
            System.out.println("лучше поспать");
        }
        if ((age > 45) || (temperature > -10 && temperature < 25)) {
            System.out.println("можно идти гулять");
        } else {
            System.out.println("лучше поспать");



        }
    }

}
