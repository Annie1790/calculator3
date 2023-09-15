package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        System.out.println("please choose operation: +, *, or -");
        Scanner scanner = new Scanner(System.in);
        String operand = scanner.nextLine();
        System.out.println("enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("enter second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Numbers are: " + number1 + " " + number2);
        if (operand.equals("+")) {
            result = number1 + number2;
        } else if (operand.equals("-")) {
            result = number1 - number2;
        } else if (operand.equals("*")) {
            result = number1 * number2;
        }
        System.out.println("Result is: " + result);
        }
    }
