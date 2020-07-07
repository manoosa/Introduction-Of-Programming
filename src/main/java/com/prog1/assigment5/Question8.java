package com.prog1.assigment5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question8 {
  public static void main(String arg[]) {
    Map<String, String> numberToWordMap = new HashMap<String, String>();
    numberToWordMap.put("0", "zero");
    numberToWordMap.put("1", "one");
    numberToWordMap.put("2", "two");
    numberToWordMap.put("3", "three");
    numberToWordMap.put("4", "four");
    numberToWordMap.put("5", "five");
    numberToWordMap.put("6", "six");
    numberToWordMap.put("7", "seven");
    numberToWordMap.put("8", "eight");
    numberToWordMap.put("9", "nine");
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter string :");
    String str = scanner.nextLine();
    StringBuilder newStr = new StringBuilder();
    
    for (int i = 0; i < str.length(); i++) {
      String value = str.substring(i, i + 1);
      
      if (numberToWordMap.containsKey(value)) {
        newStr.append(numberToWordMap.get(value));
      } else {
        newStr.append(value);
      }
    }
    
    System.out.println(newStr.toString());
  }
}
