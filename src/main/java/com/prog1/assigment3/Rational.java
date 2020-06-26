package com.prog1.assigment3;

public class Rational implements Comparable<Rational> {
  private int numerator;
  private int denominator;
  
  public Rational() {
    this.numerator = 0;
    this.denominator = 1;
  }
  
  public Rational(int x) {
    this.numerator = x;
    this.denominator = 1;
  }
  
  public Rational(int x, int y) {
    this.numerator = x;
    this.denominator = y;
  }
  
  public float get() {
    return (float) numerator / denominator;
  }
  
  public Rational sum(Rational rational) {
    int sumNumerator = (this.denominator * rational.numerator) + (this.numerator * rational.denominator);
    int sumDenominator = this.denominator * rational.denominator;
    return new Rational(sumNumerator, sumDenominator);
  }
  
  public boolean greater(Rational rational) {
    return compareTo(rational) == 1;
    // return this.get() > rational.get();
  }
  
  @Override
  public int compareTo(Rational rational) {
    Float a = (Float) this.get();
    Float b = (Float) rational.get();
    return a.compareTo(b);
  }
}
