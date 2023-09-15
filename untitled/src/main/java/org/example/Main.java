package org.example;

import org.example.Operations.Add;
import org.example.Operations.Divide;
import org.example.Operations.Multiply;
import org.example.Operations.Subtract;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Integer> numberArray = new ArrayList<>();
    Add add = new Add();
    Subtract subtract = new Subtract();
    Multiply multiply = new Multiply();
    Divide divide = new Divide();
    Scanner scanner = new Scanner(System.in);


    public int computeResult(String operand, ArrayList<Integer> array) {
        if (operand.equals("+")) {
            return add.compute(array);
        } else if (operand.equals("-")) {
            return subtract.compute(array);
        } else if (operand.equals("*")) {
            return multiply.compute(array);
        } else if (operand.equals("/")) {
            return divide.compute(array);
        } else {
            //todo
            return 0;
        }
    }

    public void getArrayOfEnteredNumbers(int arraySize) {
        for (int i = 1; i <= arraySize; i++) {
            System.out.print("Enter number " + i + ": ");
            Integer number = scanner.nextInt();
            numberArray.add(number);
        }
    }

    public void start() {
        int result = 0;
        System.out.print("please choose operation: +, *, - or / ");
        String operation = scanner.nextLine();
        System.out.print("How many numbers? : ");
        int operand = scanner.nextInt();
        this.getArrayOfEnteredNumbers(operand);
        result = this.computeResult(operation, numberArray);
        System.out.println("Result is: " + result);
    }
    public static void main(String[] args) {
        Main App = new Main();
        App.start();
        }
    }
