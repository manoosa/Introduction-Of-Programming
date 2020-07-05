package com.prog1.assigment4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Astrology {
  public static void main(String[] args) throws IOException {
    InputStreamReader inStream = new InputStreamReader(System.in);
    BufferedReader stdin = new BufferedReader(inStream);
    String month;
    int day;
    String inData;
    String zodiac = null;
    // enum
    // add method
    System.out.print("Please enter the month: ");
    inData = stdin.readLine();
    month = inData;
    
    System.out.print("Please enter the day: ");
    inData = stdin.readLine();
    day = Integer.parseInt(inData);
    
    if (month.equalsIgnoreCase("December")) {
      if (day >= 22) {
        zodiac = "Capricon";
      } else {
        zodiac = "Sagitarius";
      }
    } else if (month.equalsIgnoreCase("January")) {
      if (day >= 20) {
        zodiac = "Aquarius";
      } else {
        zodiac = "Capricon";
      }
    } else if (month.equalsIgnoreCase("February")) {
      if (day >= 18) {
        zodiac = "Pisces";
      } else {
        zodiac = "Aquarius";
      }
    } else if (month.equalsIgnoreCase("March")) {
      if (day >= 20) {
        zodiac = "Aries";
      } else {
        zodiac = "Pisces";
      }
    } else if (month.equalsIgnoreCase("April")) {
      if (day >= 20) {
        zodiac = "Taurus";
      } else {
        zodiac = "Aries";
      }
    } else if (month.equalsIgnoreCase("May")) {
      if (day >= 21) {
        zodiac = "Gemini";
      } else {
        zodiac = "Taurus";
      }
    } else if (month.equalsIgnoreCase("June")) {
      if (day >= 21) {
        zodiac = "Cancer";
      } else {
        zodiac = "Gemini";
      }
    } else if (month.equalsIgnoreCase("July")) {
      if (day >= 23) {
        zodiac = "Leo";
      } else {
        zodiac = "Cancer";
      }
    } else if (month.equalsIgnoreCase("August")) {
      if (day >= 23) {
        zodiac = "Virgo";
      } else {
        zodiac = "Leo";
      }
    } else if (month.equalsIgnoreCase("September")) {
      if (day >= 23) {
        zodiac = "Libra";
      } else {
        zodiac = "Virgo";
      }
    } else if (month.equalsIgnoreCase("October")) {
      if (day >= 23) {
        zodiac = "Scorpio";
      } else {
        zodiac = "Libra";
      }
    } else if (month.equalsIgnoreCase("November")) {
      if (day >= 22) {
        zodiac = "Sagitarius";
      } else {
        zodiac = "Scorpio";
      }
    }
    
    if (zodiac != null) {
      System.out.print("Zodiac Sign: " + zodiac);
    } else {
      System.out.print("Invalid day/month");
    }
  }
}
