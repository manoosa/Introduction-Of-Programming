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
    addSeconds(3600);
  }
  
  public void addMinute() {
    addSeconds(60);
    // if (minutes > 59) {
    // minutes = minutes - 60;
    // addHour();
    // }
  }
  
  public void addSecond() {
    addSeconds(1);
    // if (seconds > 59) {
    // seconds = seconds - 60;
    // addMinute();
    // }
  }
  
  String display() {
    return hours + " : " + minutes + " : " + seconds;
  }
  
  @Override
  public String toString() {
    return "Hourse :" + hours + "\n" + "Minutes :" + minutes + "\n" + "Seconds :" + seconds;
  }
  
  private void addSeconds(final int seconds) {
    this.seconds += seconds;
    this.minutes += this.seconds / 60;
    this.hours += minutes / 60;
    this.seconds = this.seconds % 60;
    this.minutes = minutes % 60;
    this.hours = hours % 24;
  }
}
