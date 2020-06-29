package com.prog1.assigment4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
  public static void main(String[] args) throws IOException {
    InputStreamReader inStream = new InputStreamReader(System.in);
    BufferedReader stdin = new BufferedReader(inStream);
    int year;
    String inData;
    
    System.out.print("Please enter the year: ");
    inData = stdin.readLine();
    year = Integer.parseInt(inData);
    
    if (year > 1582) {
      if (year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0))) {
        System.out.println(year + " is leap year");
      } else {
        System.out.println(year + " is not leap year");
      }
    } else {
      if (year % 4 == 0) {
        System.out.println(year + " is leap year");
      } else {
        System.out.println(year + " is not leap year");
      }
    }
  }
}
