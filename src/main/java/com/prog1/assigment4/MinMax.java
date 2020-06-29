package com.prog1.assigment4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMax {
  public static void main(String[] args) throws IOException {
    InputStreamReader inStream = new InputStreamReader(System.in);
    BufferedReader stdin = new BufferedReader(inStream);
    String inData;
    int number1;
    int number2;
    int number3;
    
    System.out.print("Please enter the first number: ");
    inData = stdin.readLine();
    number1 = Integer.parseInt(inData);
    
    System.out.print("Please enter the second number: ");
    inData = stdin.readLine();
    number2 = Integer.parseInt(inData);
    
    System.out.print("Please enter the third number: ");
    inData = stdin.readLine();
    number3 = Integer.parseInt(inData);
    
    int maxOfThree = number1 > number2 ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);
    System.out.println("Maximum of three is: " + maxOfThree);
    
    int minOfThree = number1 < number2 ? (number1 < number3 ? number1 : number3) : (number2 < number3 ? number2 : number3);
    System.out.println("Minimum of three is: " + minOfThree);
    
  }
}
