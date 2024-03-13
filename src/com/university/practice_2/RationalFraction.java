package com.university.practice_2;

public class RationalFraction {
    private int numerator;
    private int denominator;

    public RationalFraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public RationalFraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            System.out.println("Error! Wrong denominator");
        } else {
            this.denominator = denominator;
        }
    }

    public void printFraction() {
        if (numerator == 0){
            System.out.println("0");
        }else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    public void reduceFraction() {
        if (numerator > denominator) {
            int x = numerator / denominator;
            int y =  numerator % denominator;
            if (y == 0){
                System.out.println(x);
            }else {
                System.out.println("Reduced fraction: " + x + " " + numerator + "/" + denominator);
            }
        }
    }

    public void simplifyFraction() {
        int limit = Math.min(numerator, denominator);
        for (int i = 2; i <= limit; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
        }
        System.out.println(numerator + "/" + denominator);
    }

    


}
