package com.prog1.assigment6;

import java.util.Scanner;

//q4
//Write a program to deal with complex numbers (addition, subtraction, multiplication, division, and conjugate). 
//The input should be two complex numbers and an operation of the proceeding ones. 
//Use functions for each operation and the main program only for calling them according to the input

//q5
//A complex number consists of a real part and an imaginary part. In this exercise, we will implement a complex number class Complex.
//a) Define a class Complex with the attributes defined above
//b) Augment your class with two constructors. The first constructor takes no arguments, and sets the variables to 0. The overloaded constructor takes the two arguments, real and imaginary.
//c) Augment your class with the following methods:
// Two methods to return the real and imaginary parts, respectively
// Two methods to add two complex numbers. The first method should be an instance method that has only one parameter as input and will be invoked on an object of type Complex:
// public Complex add(Complex cvalue)
// The second method is a static method that has two parameters as input.
// public static Complex add(Complex cvalue1, Complex cvalue2)
// Both methods should create a new Complex object holding the addition of the two complex numbers
// A method that compares whether two complex numbers are identical, i.e. both real and imaginary parts are equal.
// A method toString to return a String representing the complex number in the following form:   4.1 + 3.9 i
//d) Augment your class with a class variable to keep a track of every instance of the class Complex
//e) Augment your class with a method that returns the total number of complex numbers created.
//f) A main method to test your class. 

public class Question4_5 {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter first number :");
    final String firstNumber = scanner.next();
    
    System.out.println("Please enter second number :");
    final String secondNumber = scanner.next();
    
    System.out.println("Please enter the operation :");
    String inData = scanner.next();
    char operation = inData.charAt(0);
    
    ComplexNumber firstComplexNumber = new ComplexNumber(firstNumber);
    ComplexNumber secondComplexNumber = new ComplexNumber(secondNumber);
    
    switch (operation) {
      case '+':
        complexNumbersAddition(firstComplexNumber, secondComplexNumber);
        break;
      case '-':
        complexNumbersSubtraction(firstComplexNumber, secondComplexNumber);
        break;
      case '*':
        complexNumbersMultiplication(firstComplexNumber, secondComplexNumber);
        break;
      case '/':
        complexNumbersDivision(firstComplexNumber, secondComplexNumber);
        break;
      case '!':
        complexNumbersConjugate(firstComplexNumber, secondComplexNumber);
        break;
      default:
        System.out.println("Invalid operation");
    }
  }
  
  private static void complexNumbersAddition(ComplexNumber firstComplexNumber, ComplexNumber secondComplexNumber) {
    double realAddition = firstComplexNumber.getComplexRealNumber() + secondComplexNumber.getComplexRealNumber();
    double imginaryAddition = firstComplexNumber.getComplexImaginaryNumber() + secondComplexNumber.getComplexImaginaryNumber();
    System.out.println("Addition is: " + realAddition + " + " + imginaryAddition + "i");
  }
  
  private static void complexNumbersSubtraction(ComplexNumber firstComplexNumber, ComplexNumber secondComplexNumber) {
    double realSubtraction = firstComplexNumber.getComplexRealNumber() - secondComplexNumber.getComplexRealNumber();
    double imginarySubtraction = firstComplexNumber.getComplexImaginaryNumber() - secondComplexNumber.getComplexImaginaryNumber();
    System.out.println("Subtraction is: " + realSubtraction + " + " + imginarySubtraction + "i");
  }
  
  private static void complexNumbersMultiplication(ComplexNumber firstComplexNumber, ComplexNumber secondComplexNumber) {
    double realMultiplication = firstComplexNumber.getComplexRealNumber() * secondComplexNumber.getComplexRealNumber();
    double imginaryMultiplication = firstComplexNumber.getComplexImaginaryNumber() * secondComplexNumber.getComplexImaginaryNumber();
    System.out.println("Multiplication is: " + realMultiplication + " + " + imginaryMultiplication + "i");
  }
  
  private static void complexNumbersDivision(ComplexNumber firstComplexNumber, ComplexNumber secondComplexNumber) {
    if (secondComplexNumber.getComplexRealNumber() == 0 || secondComplexNumber.getComplexImaginaryNumber() == 0) {
      System.out.println("Invalid Division");
      return;
    }
    
    double realDivision = firstComplexNumber.getComplexRealNumber() / secondComplexNumber.getComplexRealNumber();
    double imginaryDivision = firstComplexNumber.getComplexImaginaryNumber() / secondComplexNumber.getComplexImaginaryNumber();
    System.out.println("Division is: " + realDivision + " + " + imginaryDivision + "i");
  }
  
  private static void complexNumbersConjugate(ComplexNumber firstComplexNumber, ComplexNumber secondComplexNumber) {
    
    String firstNumber = firstComplexNumber.getComplexRealNumber() + " + " + firstComplexNumber.getComplexImaginaryNumber() + "i";
    String secondNumber = secondComplexNumber.getComplexRealNumber() + " + " + secondComplexNumber.getComplexImaginaryNumber() + "i";
    
    String firstNumberConjugate = firstComplexNumber.getComplexRealNumber() + " - " + firstComplexNumber.getComplexImaginaryNumber() + "i";
    String secondNumberConjugate = secondComplexNumber.getComplexRealNumber() + " - " + secondComplexNumber.getComplexImaginaryNumber() + "i";
    
    System.out.println("Conjugate of " + firstNumber + " = " + firstNumberConjugate);
    System.out.println("Conjugate of " + secondNumber + " = " + secondNumberConjugate);
  }
  
}
