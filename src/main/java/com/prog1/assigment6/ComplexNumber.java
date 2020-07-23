package com.prog1.assigment6;

public class ComplexNumber {
  
  private final double complexRealNumber;
  private final double complexImaginaryNumber;
  
  static int COMPLEX_NUMBER_COUNT = 0;
  
  public ComplexNumber(final double complexRealNumber, final double complexImaginaryNumber) {
    this.complexRealNumber = complexRealNumber;
    this.complexImaginaryNumber = complexImaginaryNumber;
    ComplexNumber.COMPLEX_NUMBER_COUNT++;
  }
  
  public ComplexNumber(final String number) {
    String[] complexNumber = number.split("\\+");
    String complexImaginaryNumber = complexNumber[1];
    complexImaginaryNumber = complexImaginaryNumber.replace("i", "");
    this.complexRealNumber = Double.parseDouble(complexNumber[0]);
    this.complexImaginaryNumber = Double.parseDouble(complexImaginaryNumber);
  }
  
  public double getComplexRealNumber() {
    return complexRealNumber;
  }
  
  public double getComplexImaginaryNumber() {
    return complexImaginaryNumber;
  }
  
  public static int getComplexNumberCount() {
    return COMPLEX_NUMBER_COUNT;
  }
  
  public static boolean compare(final ComplexNumber complexNumber1, final ComplexNumber complexNumber2) {
    final Double realNumber = complexNumber1.getComplexRealNumber();
    final Double otherRealNumber = complexNumber2.getComplexRealNumber();
    final int compareRealNumbers = realNumber.compareTo(otherRealNumber);
    
    final Double imaginaryNumber = complexNumber1.getComplexImaginaryNumber();
    final Double otherImaginaryNumber = complexNumber2.getComplexImaginaryNumber();
    final int compareImaginaryNumbers = imaginaryNumber.compareTo(otherImaginaryNumber);
    
    if (compareRealNumbers == 0 && compareImaginaryNumbers == 0) {
      return true;
    }
    
    return false;
  }
  
  protected static void complexNumbersAddition(ComplexNumber firstComplexNumber, ComplexNumber secondComplexNumber) {
    double realAddition = firstComplexNumber.getComplexRealNumber() + secondComplexNumber.getComplexRealNumber();
    double imginaryAddition = firstComplexNumber.getComplexImaginaryNumber() + secondComplexNumber.getComplexImaginaryNumber();
    System.out.println("Addition is: " + realAddition + " + " + imginaryAddition + "i");
  }
  
  protected static void complexNumbersSubtraction(ComplexNumber firstComplexNumber, ComplexNumber secondComplexNumber) {
    double realSubtraction = firstComplexNumber.getComplexRealNumber() - secondComplexNumber.getComplexRealNumber();
    double imginarySubtraction = firstComplexNumber.getComplexImaginaryNumber() - secondComplexNumber.getComplexImaginaryNumber();
    System.out.println("Subtraction is: " + realSubtraction + " + " + imginarySubtraction + "i");
  }
  
  protected static void complexNumbersMultiplication(ComplexNumber firstComplexNumber, ComplexNumber secondComplexNumber) {
    double realMultiplication = firstComplexNumber.getComplexRealNumber() * secondComplexNumber.getComplexRealNumber();
    double imginaryMultiplication = firstComplexNumber.getComplexImaginaryNumber() * secondComplexNumber.getComplexImaginaryNumber();
    System.out.println("Multiplication is: " + realMultiplication + " + " + imginaryMultiplication + "i");
  }
  
  protected static void complexNumbersDivision(ComplexNumber firstComplexNumber, ComplexNumber secondComplexNumber) {
    if (secondComplexNumber.getComplexRealNumber() == 0 || secondComplexNumber.getComplexImaginaryNumber() == 0) {
      System.out.println("Invalid Division");
      return;
    }
    
    double realDivision = firstComplexNumber.getComplexRealNumber() / secondComplexNumber.getComplexRealNumber();
    double imginaryDivision = firstComplexNumber.getComplexImaginaryNumber() / secondComplexNumber.getComplexImaginaryNumber();
    System.out.println("Division is: " + realDivision + " + " + imginaryDivision + "i");
  }
  
  protected static void complexNumbersConjugate(ComplexNumber firstComplexNumber, ComplexNumber secondComplexNumber) {
    
    String firstNumber = firstComplexNumber.getComplexRealNumber() + " + " + firstComplexNumber.getComplexImaginaryNumber() + "i";
    String secondNumber = secondComplexNumber.getComplexRealNumber() + " + " + secondComplexNumber.getComplexImaginaryNumber() + "i";
    
    String firstNumberConjugate = firstComplexNumber.getComplexRealNumber() + " - " + firstComplexNumber.getComplexImaginaryNumber() + "i";
    String secondNumberConjugate = secondComplexNumber.getComplexRealNumber() + " - " + secondComplexNumber.getComplexImaginaryNumber() + "i";
    
    System.out.println("Conjugate of " + firstNumber + " = " + firstNumberConjugate);
    System.out.println("Conjugate of " + secondNumber + " = " + secondNumberConjugate);
  }
  
  @Override
  public String toString() {
    return "The complex number is: " + complexRealNumber + " + " + complexImaginaryNumber + "i";
  }
  
}
