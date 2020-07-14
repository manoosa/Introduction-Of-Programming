package com.prog1.assigment4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
  
  public static void main(String[] args) throws IOException {
    InputStreamReader inStream = new InputStreamReader(System.in);
    BufferedReader stdin = new BufferedReader(inStream);
    String inData;
    int number1;
    int number2;
    char operation;
    
    System.out.print("Please enter the first number: ");
    inData = stdin.readLine();
    number1 = Integer.parseInt(inData);
    
    System.out.print("Please enter the second number: ");
    inData = stdin.readLine();
    number2 = Integer.parseInt(inData);
    
    System.out.print("Please enter the operation: ");
    inData = stdin.readLine();
    operation = inData.charAt(0);
    
    switch (operation) {
      case '+':
        System.out.println(number1 + number2);
        break;
      case '-':
        System.out.println(number1 - number2);
        break;
      case '*':
        System.out.println(number1 * number2);
        break;
      case '/':
        // check null -> throw exception
        System.out.println(number1 / number2);
        break;
      case '%':
        System.out.println(number1 % number2);
        break;
      default:
        System.out.println("Invalid operation");
    }
    
  }
  
}
