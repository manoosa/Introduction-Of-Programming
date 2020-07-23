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
  
  @Override
  public String toString() {
    return "The complex number is: " + complexRealNumber + " + " + complexImaginaryNumber + "i";
  }
  
}
