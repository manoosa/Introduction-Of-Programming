package com.prog1.assigment3;

public class Question1 {
  
  public static void main(String[] args) {
    final Rational rational1 = new Rational(1, 4);
    final Rational rational2 = new Rational(1, 2);
    
    if (rational1.greater(rational2)) {
      System.out.println(rational1.get());
    } else if (rational2.greater(rational1)) {
      System.out.println(rational2.get());
    } else {
      System.out.println("Both are equal");
    }
    
    final float average = (rational1.get() + rational2.get()) / 2;
    System.out.println(average);
  }
}
