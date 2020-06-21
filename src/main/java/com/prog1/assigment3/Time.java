package com.prog1.assigment3;

public class Time {
  private int hours;
  private int minutes;
  private int seconds;
  
  public Time() {
    this.hours = 0;
    this.minutes = 0;
    this.seconds = 0;
  }
  
  public Time(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }
  
  public int getHours() {
    return hours;
  }
  
  public int getMinutes() {
    return minutes;
  }
  
  public int getSeconds() {
    return seconds;
  }
  
  public void addHour() {
    this.hours++;
  }
  
  public void addMinute() {
    this.minutes++;
    
    if (minutes > 59) {
      minutes = minutes - 60;
      addHour();
    }
  }
  
  public void addSecond() {
    this.seconds++;
    
    if (seconds > 59) {
      seconds = seconds - 60;
      addMinute();
    }
  }
  
  String display() {
    return hours + " : " + minutes + " : " + seconds;
  }
  
  public String toString() {
    return "Hourse :" + hours + "\n" + "Minutes :" + minutes + "\n" + "Seconds :" + seconds;
  }
}
