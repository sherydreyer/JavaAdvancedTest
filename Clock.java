/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabiginnertest;

/**
 *
 * @author Sheryl Dreyer
 */
public class Clock {

    String time;

    void setTime(String t) {
        time = t;
    }

    //  replace void with String
    String getTime() {
        return time;

    }
}

class ClockTestDrive {

    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
