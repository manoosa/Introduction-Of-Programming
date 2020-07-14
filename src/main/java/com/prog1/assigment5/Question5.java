package com.prog1.assigment5;

import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter first points with comma separator :");
    String points1 = scanner.nextLine();
    String[] firstPoints = points1.split(",");
    int x1 = Integer.valueOf(firstPoints[0]);
    int y1 = Integer.valueOf(firstPoints[1]);
    
    System.out.println("Please enter second points with comma separator :");
    String points2 = scanner.nextLine();
    String[] secondPoints = points2.split(",");
    int x2 = Integer.valueOf(secondPoints[0]);
    int y2 = Integer.valueOf(secondPoints[1]);
    int slope = (y2 - y1) / (x2 - x1);
    // The perpendicular slope will be the opposite reciprocal of the original slope
    // perpendicular will throw an error in this implementation
    
    System.out.print("Striaght line is : y = " + slope + "x + " + (y1 + -(slope * x1)));
  }
}

// m = (y2-y1) / (x2-x1)
// y = mx+c
// c = y1 - mx1
// y = mx + y1 -mx1
// y = y1 + m(x-x1)
// y = y1 + ((y2 - y1)/(x2 - x1))*(x - x1)
