package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.tesla.com");

        Thread.sleep(100);

        System.out.println("Current Title: "+driver.getTitle());

        String currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = "+currentUrl);

        driver.navigate().back();

        Thread.sleep(200);

        driver.navigate().forward();

        Thread.sleep(200);

        driver.navigate().refresh();

        driver.navigate().to("https://google.com");

        System.out.println("Current Title: "+driver.getTitle());
        currentUrl = driver.getCurrentUrl();

        driver.getCurrentUrl();

        driver.manage().window().maximize();
        Thread.sleep(300);
        driver.manage().window().fullscreen();
        /* this method will close the currently opened browser
        it will only close one
         */
        driver.close();
        driver.quit();

    }
}

