package com.cybertek.tests.day3_reviews_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[]args){
        //TC #1: Facebook title verification
        //1. Open Chrome browser
        //setup browser driver
        WebDriverManager.chromedriver().setup();

        // create driver instance and open browser
        WebDriver driver = new ChromeDriver();

        // use the 'driver' object created to use selinium methods
        // maximise browser
        driver.manage().window().maximize();

        //2. go to facebook
        driver.get("https://www.facebook.com");

        //3. Verify  title:
        //Expected:"Facebook - login or sign up
        String expectedTitle ="Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed!");
        }

    }
}

