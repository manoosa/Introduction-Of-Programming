package com.prog1.assigment2;

public class Question6 {
  public static void main(String[] args) {
    final Keyboard keyboard = new Keyboard();
    final int octal = keyboard.getInputValue();
    final ConversionOfAnOctalNumber conversionResult = convertOctalToDecimalAndBinary(octal);
    System.out.printf("%d in octal = %d in decimal and %d in binary", octal, conversionResult.getDecimalNumber(), conversionResult.getBinaryNumber());
  }
  
  public static ConversionOfAnOctalNumber convertOctalToDecimalAndBinary(final int octal) {
    final int decimalNumber = convertOctalToDecimal(octal);
    final long binaryNumber = convertDecimalToBinary(decimalNumber);
    return new ConversionOfAnOctalNumber(decimalNumber, binaryNumber);
  }
  
  public static long convertDecimalToBinary(final int decimal) {
    long binaryNumber = 0;
    int decimalNumber = decimal, i = 1;
    
    while (decimalNumber != 0) {
      binaryNumber += (decimalNumber % 2) * i;
      decimalNumber /= 2;
      i *= 10;
    }
    
    return binaryNumber;
  }
  
  public static int convertOctalToDecimal(final int octal) {
    int octalNumber = octal, decimalNumber = 0, i = 0;
    
    while (octalNumber != 0) {
      decimalNumber += (octalNumber % 10) * Math.pow(8, i);
      ++i;
      octalNumber /= 10;
    }
    
    return decimalNumber;
  }
  
  // another way
  public static int convertOctalToDecimal2(final int octal) {
    int octalNumber = octal, count = String.valueOf(octal).length(), decimalNumber = 0;
    
    while (octalNumber != 0) {
      final int number = Integer.parseInt(Integer.toString(octalNumber).substring(0, 1));
      decimalNumber += (number) * Math.pow(8, count - 1);
      --count;
      final String octalString = Integer.toString(octalNumber).substring(1, Integer.toString(octalNumber).length());
      
      if (octalString != null && !octalString.isEmpty()) {
        octalNumber = Integer.parseInt(octalString);
      } else {
        octalNumber = 0;
      }
    }
    
    return decimalNumber;
  }
  
  public static class ConversionOfAnOctalNumber {
    private int decimalNumber;
    private long binaryNumber;
    
    public ConversionOfAnOctalNumber(int decimalNumber, long binaryNumber) {
      super();
      this.decimalNumber = decimalNumber;
      this.binaryNumber = binaryNumber;
    }
    
    public int getDecimalNumber() {
      return decimalNumber;
    }
    
    public long getBinaryNumber() {
      return binaryNumber;
    }
  }
}
