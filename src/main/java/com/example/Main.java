package com.example;

import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Richard Nham
 */
public class Main {

    public static void main(String[] args) {
        Scanner scannerUserInput= new Scanner(System.in);
        double euros;
        double rate;

        System.out.println("How many euros are you exchanging?");
        euros =  scannerUserInput.nextInt();

        System.out.println("What is the exchange rate?");
        rate =  scannerUserInput.nextInt();

        double usd = euros * rate;

        usd = Math.ceil(usd * 100) / 100.0;

        System.out.println(euros + " at the exchange rate of "+rate+"is");
        System.out.println(usd + " U.S. Dollars");

        scannerUserInput.close();
    }

}
