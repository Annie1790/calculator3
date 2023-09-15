package org.example;

import org.example.Operations.Add;
import org.example.Operations.Divide;
import org.example.Operations.Multiply;
import org.example.Operations.Subtract;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Integer> numberArray = new ArrayList<>();
    Add add = new Add();
    BufferedReader inputStream = null;
    Subtract subtract = new Subtract();
    Multiply multiply = new Multiply();
    Divide divide = new Divide();
    Scanner scanner = new Scanner(System.in);


    public int computeResult(String operand, ArrayList<Integer> array) throws Exception {
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
// NOT USED IN EXCERCISE 6
//    public void getEnteredNumber() {
//        System.out.print("Enter a number: ");
//        int firstNumber = scanner.nextInt();
//        numberArray.add(firstNumber);
//
//        while(true) {
//                System.out.print("Enter another number: ");
//                String number = scanner.next();
//                if (!number.equals("done")) {
//                    numberArray.add(Integer.parseInt(number));
//                } else {
//                    //todo
//                    return;
//                }
//            }
//        }

    public void getNumbersFromTxtFile() {
        System.out.print("Enter a file: ");
        String fileName = scanner.nextLine();
        try {
            inputStream = new BufferedReader(new FileReader("test.txt"));
            int number;
            while((number = inputStream.read()) != -1) {
                System.out.println(inputStream.read());
                numberArray.add(number);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found \n" + e);
        } catch (IOException e) {
            throw new RuntimeException("IOException error \n" + e);
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

    public void start() throws Exception {
        int result;
        String operation = this.getOperation();
        this.getNumbersFromTxtFile();
//        this.getEnteredNumber();
        result = this.computeResult(operation, numberArray);
        this.printResult(result);
    }

    public static void main(String[] args) throws Exception {
        Main App = new Main();
        App.start();
    }
}
