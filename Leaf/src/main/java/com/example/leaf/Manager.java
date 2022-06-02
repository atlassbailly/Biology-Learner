package com.example.leaf;

//keeps track of several important variables for coordination
public class Manager {
    public static boolean day = true;

    public static void makeDay(){
        day = true;
    }

    public static void makeNight(){
        day = false;
    }

    public static boolean isDay(){
        return day;
    }
}
