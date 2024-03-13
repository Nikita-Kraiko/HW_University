package com.university.practice_2.run;

import com.university.practice_2.RationalFraction;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RationalFraction r = new RationalFraction();
        RationalFraction r2 = new RationalFraction(6,2);
        r.printFraction();
        r2.printFraction();
        r2.reduceFraction();
        r2.simplifyFraction();
    }
}
