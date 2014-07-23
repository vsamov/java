/**
 * @file SwichDemo.java
 * @author - Valery Samovich
 * @version 1.0
 * @date 07/23/2014
 */

package com.valerysamovich.java.trail.basic.statements.switchstatement;

public class SwitchDemo {

    public static void main(String[] args) {
        
        // variables
        int  month = 8;
        String monthString;
        
        //switch statement
        switch (month) {
            case 1: monthString = "January";
                    break;
            case 2: monthString = "February";
                    break;
            case 3: monthString = "March";
                    break;
            case 4: monthString = "April";
                    break;
            case 5: monthString = "May";
                    break;
            case 6: monthString = "June";
                    break;
            case 7: monthString = "July";
                    break;
            case 8: monthString = "August";
                    break;
            case 9: monthString = "September";
                    break;
            case 10: monthString = "October";
                    break;
            case 11: monthString = "November";
                    break;
            case 12: monthString = "December";
                    break;
            default: monthString = "Invalid month";
                    break;
        }
        
        System.out.println(monthString);
        
    }

}
