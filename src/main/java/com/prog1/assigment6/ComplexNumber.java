package com.prog1.assigment6;

public class ComplexNumber {
  
  private double complexRealNumber;
  private double complexImaginaryNumber;
  static int complexNumberCount = 0;
  
  public ComplexNumber() {
  }
  
  public ComplexNumber(double complexRealNumber, double complexImaginaryNumber) {
    super();
    this.complexRealNumber = complexRealNumber;
    this.complexImaginaryNumber = complexImaginaryNumber;
    complexNumberCount++;
  }
  
  public double getComplexRealNumber() {
    return complexRealNumber;
  }
  
  public void setComplexRealNumber(double complexRealNumber) {
    this.complexRealNumber = complexRealNumber;
  }
  
  public double getComplexImaginaryNumber() {
    return complexImaginaryNumber;
  }
  
  public void setComplexImaginaryNumber(double complexImaginaryNumber) {
    this.complexImaginaryNumber = complexImaginaryNumber;
  }
  
  public static boolean compare(final ComplexNumber a, final ComplexNumber b) {
    final Double realNumber = a.getComplexRealNumber();
    final Double otherRealNumber = b.getComplexRealNumber();
    final int compareRealNumbers = realNumber.compareTo(otherRealNumber);
    
    final Double imaginaryNumber = a.getComplexImaginaryNumber();
    final Double otherImaginaryNumber = b.getComplexImaginaryNumber();
    final int compareImaginaryNumbers = imaginaryNumber.compareTo(otherImaginaryNumber);
    
    if (compareRealNumbers == 0 && compareImaginaryNumbers == 0) {
      return true;
    }
    
    return false;
  }
  
  @Override
  public String toString() {
    return "The complex number is: " + complexRealNumber + " + " + complexImaginaryNumber + "i";
  }
  
}
