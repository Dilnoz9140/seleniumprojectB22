package com.cybertek.tests.Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Vytrack {
        WebDriver driver;
        @BeforeMethod
        public void BeforeRun() {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();

            //Step 1-Go to Vytrack Log-In Page
            driver.get("https://qa3.vytrack.com/user/login");

        }
        @Test
        public void Test() throws InterruptedException {

            //Step 2- Log-In successfully for Truck Driver
            WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
            username.sendKeys("user24");
            WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
            password.sendKeys("UserUser123" + Keys.ENTER);
            Thread.sleep(6000);
            //Step 3- Navigate to the Fleet module and access Vehicles from dropdown menu
            WebElement FleetTab = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
            Thread.sleep(3000);
            FleetTab.click();
            Thread.sleep(3000);
            WebElement VehiclesTab = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));
            Thread.sleep(3000);
            VehiclesTab.click();
            Thread.sleep(5000);

            //Step 4- Find any car and click on it
            WebElement SelectVehicleTab = driver.findElement(By.xpath("(//tr[@class='grid-row row-click-action'])[1]"));
            Thread.sleep(3000);
            SelectVehicleTab.click();
            Thread.sleep(3000);

            //Step 5- Click on "Add Event" tab on the top right
            WebElement EventTab = driver.findElement(By.xpath("(//a[@href='javascript: void(0);'])[2]"));
            Thread.sleep(3000);
            EventTab.click();
            Thread.sleep(3000);

            //Step 6- After creating new event click on Save button
            WebElement titleOfEventTab= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
            Thread.sleep(3000);
            titleOfEventTab.sendKeys("SeleniumTest");
            Thread.sleep(3000);
            WebElement saveButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
            Thread.sleep(3000);
            saveButton.click();
            Thread.sleep(3000);

            //Step 7- See calendar event in General Information page and Activity Tab
            WebElement eventLocation = driver.findElement(By.xpath("(//div[@class='message-item message'])[1]"));
            Thread.sleep(3000);
            Assert.assertEquals(eventLocation.getText(), "SeleniumTest");
            WebElement activityTab= driver.findElement(By.xpath("//a[@href='#scroll-2-1607']"));
            Thread.sleep(3000);
            activityTab.click();
            Thread.sleep(3000);
            Assert.assertEquals(eventLocation.getText(), "SeleniumTest");
        }
    }
