package org.example;

import org.example.Operations.Add;
import org.example.Operations.Divide;
import org.example.Operations.Multiply;
import org.example.Operations.Subtract;

import java.util.Scanner;

public class Main {
    Add add = new Add();
    Subtract subtract = new Subtract();
    Multiply multiply = new Multiply();
    Divide divide = new Divide();

    public int computeResult(String operand, int number1, int number2) {
        if (operand.equals("+")) {
            return add.compute(number1,number2);
        } else if (operand.equals("-")) {
            return subtract.compute(number1,number2);
        } else if (operand.equals("*")) {
            return multiply.compute(number1,number2);
        } else if (operand.equals("/")) {
            return divide.compute(number1, number2);
        } else {
            //todo
            return 0;
        }
    }

    public void start() {
        int result = 0;
        System.out.println("please choose operation: +, *, - or /");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        System.out.println("enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("enter second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Numbers are: " + number1 + " " + number2);
        result = this.computeResult(operation,number1,number2);
        System.out.println("Result is: " + result);
    }
    public static void main(String[] args) {
        Main App = new Main();
        App.start();
        }
    }
