package com.cybertek.tests.day8_window_javaFaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MultipleWindowsPractice {
        WebDriver driver;

  @BeforeMethod
  public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");

        }

  @Test
  public void multiple_windows_test(){

      ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
      ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
      ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");


  }
}
