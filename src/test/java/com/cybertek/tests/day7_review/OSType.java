package com.cybertek.tests.day7_review;

public class OSType {
    public static void getOsInfo()
    {
        System.out.println("OS: " + System.getProperty("os.name") + ";" +
                " Version: " + System.getProperty("os.version"));
    }
}
