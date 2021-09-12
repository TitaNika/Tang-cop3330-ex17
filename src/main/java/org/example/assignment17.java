/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment17 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        int Alcohol, Weight, Hours, Gender;
        float ratio = 0;
        double BAC;

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        Gender = scan.nextInt();

        System.out.print("How many ounces of alcohol did you have?: ");
        Alcohol = scan.nextInt();

        System.out.print("What is your weight, in pounds?: ");
        Weight = scan.nextInt();

        System.out.print("How many hours has it been since yours last drink?: ");
        Hours = scan.nextInt();

        scan.close();

        if (Gender == 1) {
            ratio = (float) 0.73;
        }

        if (Gender == 2) {
            ratio = (float) 0.66;
        }

        BAC = (Alcohol * 5.14 / Weight * ratio) - (0.015 * Hours);

        System.out.println("Your BAC is " + BAC);

        if (BAC < 0.08) {
            System.out.println("It is legal for you to drive.");
        }
        else{
            System.out.println("It is not legal for you to drive.");
        }
    }
}