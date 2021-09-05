/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Hodge
 */

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {

        // Prompt the user for 2 numbers separately
        // Store each number it its own variable
        // Print the result of the addition, subtraction, multiplication
        // and division of the two number, all on separate line

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter a second number: ");
        int num2 = scan.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        System.out.printf("%d + %d = %d\n" +
                "%d - %d = %d\n" +
                "%d * %d = %d\n" +
                "%d / %d = %d\n",
                num1, num2, add,
                num1, num2, sub,
                num1, num2, mul,
                num1, num2, div);
    }
}
