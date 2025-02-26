package org.example; //DO NOT DELETE
import java.util.Scanner;
import java.text.NumberFormat;
public class Main {
    public static void main(String[] args) {
        double gal;
        double quart;
        double pint;
        double cup;
        double tablespoon;
        Scanner scanner = new Scanner(System.in);
        NumberFormat round = NumberFormat.getNumberInstance();
        System.out.print("Enter the number of gallons: ");
        gal = scanner.nextDouble();
        System.out.println("In " + 4.0 + " gallons there are:");
        quart = gal*4.0;
        pint = quart*2.0;
        cup = pint*2.0;
        tablespoon = cup*16.0;
        System.out.println(quart +" quart");
        System.out.println(pint+" pints");
        System.out.println(cup+" cups");
        System.out.println(tablespoon +" tablespoons");

    }
}