package com.prog1.assigment3;

public class Question3 {
  
  public static void main(String[] args) {
    Time time1 = new Time(2, 40, 59);
    Time time2 = new Time(6, 59, 59);
    
    time1.addSecond();
    time1.addMinute();
    time2.addSecond();
    time2.addHour();
    
    System.out.println(time1.getSeconds());
    System.out.println(time1.getMinutes());
    System.out.println(time1.getHours());
    System.out.println(time1.toString());
    
    System.out.println(time2.display());
    
  }
}
