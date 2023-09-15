package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        System.out.println("please choose operation: +, *, or -");
        Scanner scanner = new Scanner(System.in);
        String operand = scanner.nextLine();
        Random random = new Random();
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
        System.out.println("random numbers are: " + number1 + " " + number2);
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
