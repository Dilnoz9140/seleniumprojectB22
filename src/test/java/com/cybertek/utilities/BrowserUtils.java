package com.cybertek.utilities;

public class BrowserUtils {
    /*Method that will accept int args
    Wait for given second duration

     */
    public static void sleep(int second)  {
        second*=1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
