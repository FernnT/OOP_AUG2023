/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assingment2time;

/**
 *
 * @author TJ
 */
public class Assingment2TIme {

    public static void main(String[] args) {
        Time ph = new Time(11, 59, 45, false);
    
        System.out.println("Original Time: " + ph);
        ph.displayIn24HourFormat();


        ph.addTimeBySec(30); 
        System.out.println("Advanced Time: " + ph); 
        ph.displayIn24HourFormat();
    
        ph.tickByHour();
        System.out.println("Advanced Time: " + ph); 
        ph.displayIn24HourFormat();
        
        
        ph.tickByHour();
        System.out.println("Advanced Time: " + ph); 
        ph.displayIn24HourFormat();
        
        ph.tickByMinute();
        ph.tickByMinute();
        System.out.println("Advanced Time: " + ph); 
        ph.displayIn24HourFormat();
        
        ph.tickBySec();    
        ph.tickBySec();
        ph.tickBySec();
        System.out.println("Advanced Time: " + ph); 
        ph.displayIn24HourFormat();
    }
}
