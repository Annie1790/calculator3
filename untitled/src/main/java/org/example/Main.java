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

    public void getEnteredNumber() {
        System.out.print("Enter a number: ");
        int firstNumber = scanner.nextInt();
        numberArray.add(firstNumber);

        while(true) {
                System.out.print("Enter another number: ");
                String number = scanner.next();
                if (!number.equals("done")) {
                    numberArray.add(Integer.parseInt(number));
                } else {
                    //todo
                    return;
                }
            }
        }

        public String getOperation() {
            System.out.println("Welcome to the calculator! \n" +
                    "====================================");
            System.out.print("please choose operation: +, *, - or / ");
            return scanner.nextLine();
        }

        public void printResult(int result) {
            System.out.println("Result is: " + result);
        }

    public void start() {
        int result;
        String operation = this.getOperation();
        this.getEnteredNumber();
        result = this.computeResult(operation, numberArray);
        this.printResult(result);
    }
    public static void main(String[] args) {
        Main App = new Main();
        App.start();
        }
    }
