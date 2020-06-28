package com.prog1.assigment4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatingPoint {
  
  public static void main(String[] args) throws IOException {
    InputStreamReader inStream = new InputStreamReader(System.in);
    BufferedReader stdin = new BufferedReader(inStream);
    String inData;
    double number1;
    double number2;
    double number3;
    
    System.out.print("Please enter the first number: ");
    inData = stdin.readLine();
    number1 = Double.parseDouble(inData);
    
    System.out.print("Please enter the second number: ");
    inData = stdin.readLine();
    number2 = Double.parseDouble(inData);
    
    System.out.print("Please enter the third number: ");
    inData = stdin.readLine();
    number3 = Double.parseDouble(inData);
    
    // Arrays.sort(numbers);
    
    // double leastOf2Values = number1 < number2 ? number1 : number2;
    // double least = leastOf2Values < number3 ? leastOf2Values : number3;
    //
    // double mostOf2Values = number1 > number2 ? number1 : number2;
    // double most = mostOf2Values > number3 ? mostOf2Values : number3;
    
    double least = number1 < number2 ? (number1 < number3 ? number1 : number3) : (number2 < number3 ? number2 : number3);
    double most = number1 > number2 ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);
    double middle = (number1 != least && number1 != most) ? number1 : (number2 != least && number2 != most) ? number2 : (number3 != least && number3 != most) ? number3 : null;
    
    System.out.println("The numbers in sorted order are: ");
    System.out.println(least);
    System.out.println(middle);
    System.out.println(most);
  }
}
