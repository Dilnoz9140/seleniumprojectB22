package com.cybertek.tests.Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dilnoz {
    @BeforeClass
    public void  BeforeRun(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa3.vytrack.com/user/login");
    }

    @Test
    public void Test() throws InterruptedException{

    }
}

