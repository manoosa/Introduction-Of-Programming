package com.prog1.assigment5;

public class Question7 {
  
  public static void main(String args[]) {
    int i, f = 0;
    int prevF = 0;
    int precF = 1;
    
    for (i = 2; i < 6; i++) {
      f = prevF + precF;
      prevF = precF;
      precF = f;
    }
  }
}

// alot of syntax error
// F = 5
// prevF = 3
// precF = 5
