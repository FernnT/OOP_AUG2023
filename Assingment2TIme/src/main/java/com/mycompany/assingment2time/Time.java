/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assingment2time;

/**
 *
 * @author TJ
 */
public class Time {
    private int hour;
    private int min;
    private int sec;
    private boolean meridian;

    /**
     *
     */
    public Time() {
    }

    public Time(int hour, int min, int sec, boolean meridian) {
        setHour(hour);
        setMin(min);
        setSec(sec);
        setMeridian(meridian);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 1 && hour <= 12) {
            this.hour = hour;
        } 
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min >= 0 && min <= 59) {
            this.min = min;
        } 
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if (sec >= 0 && sec <= 59) {
            this.sec = sec;
        } 
    }

    public boolean isMeridian() {
        return meridian;
    }

    public void setMeridian(boolean meridian) {
        this.meridian = meridian;
    }
    
public void addTimeBySec(int seconds) {
    int totalSeconds = hour * 3600 + min * 60 + sec + seconds;
    
    //values for hours, minutes, and seconds
    hour = (totalSeconds / 3600) % 12;
    min = (totalSeconds % 3600) / 60;
    sec = totalSeconds % 60;
    
    
    if (totalSeconds >= 43200) { // 12 hours in seconds
        meridian = !meridian; // Toggle between AM and PM ???
    }
    
    if(hour==0){
        hour=12;
    }
    
}
  
 public void tickByHour() {
   //
    hour = (hour % 12) + 1;
    
    // If the hour becomes 12, toggle between AM and PM
    if (hour == 12) {
        meridian = !meridian;
    }
}
 
 public void tickByMinute(){
     addTimeBySec(60);
 }
 
 public void tickBySec(){
     addTimeBySec(1);
 }
 
 public void displayIn24HourFormat() {
    //based on the meridian
    int hour24 = hour;
    if (!meridian && hour != 12) {
        hour24 += 12;
    } else if (meridian && hour == 12) {
        hour24 = 0;
    }

    System.out.printf("%02d:%02d:%02d%n", hour24, min, sec);
}
 
 

    @Override
    public String toString() {
        String meridianStr = meridian ? "PM" : "AM";
        return String.format("%02d:%02d:%02d %s", hour, min, sec, meridianStr);
    }
}
