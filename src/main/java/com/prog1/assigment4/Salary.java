package com.prog1.assigment4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salary {
  public static void main(String[] args) throws IOException {
    InputStreamReader inStream = new InputStreamReader(System.in);
    BufferedReader stdin = new BufferedReader(inStream);
    String inData;
    double salary;
    int rating;
    Double newSalary;
    
    System.out.print("Please enter the annual salary: ");
    inData = stdin.readLine();
    salary = Double.parseDouble(inData);
    
    System.out.print("Please enter the rating: ");
    inData = stdin.readLine();
    rating = Integer.parseInt(inData);
    
    if (rating == 1 || rating == 2 || rating == 3) {
      if (rating == 1) {
        newSalary = 1.06 * salary;
      } else if (rating == 2) {
        newSalary = 1.04 * salary;
      } else
      // if (rating == 3)
      {
        newSalary = 1.015 * salary;
      }
      System.out.print("New Salary: " + newSalary);
    } else {
      System.out.print("Invalid rating");
    }
    
    // if (newSalary != null) {
    // System.out.print("New Salary: " + newSalary);
    // } else {
    // System.out.print("Invalid rating");
    // }
  }
}
