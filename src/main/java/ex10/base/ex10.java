package ex10.base;

/* UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Rachel Schwarz
*/

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        String str1 = input.nextLine();
        int item1Price = Integer.parseInt(str1);
        System.out.print("Enter the quantity of item 1: ");
        String str2 = input.nextLine();
        int item1Quant = Integer.parseInt(str2);

        System.out.print("Enter the price of item 2: ");
        String str3 = input.nextLine();
        int item2Price = Integer.parseInt(str3);
        System.out.print("Enter the quantity of item 2: ");
        String str4 = input.nextLine();
        int item2Quant = Integer.parseInt(str4);

        System.out.print("Enter the price of item 3: ");
        String str5 = input.nextLine();
        int item3Price = Integer.parseInt(str5);
        System.out.print("Enter the quantity of item 3: ");
        String str6 = input.nextLine();
        int item3Quant = Integer.parseInt(str6);

        int item1Total = item1Price * item1Quant;
        int item2Total = item2Price * item2Quant;
        int item3Total = item3Price * item3Quant;
        double subtotal = item1Total + item2Total + item3Total;
        final double taxRate = .055;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        System.out.format("Subtotal: $%.2f%n", subtotal);
        System.out.format("Tax: $%.2f%n", tax);
        System.out.format("Total: $%.2f%n", total);

    }
}
