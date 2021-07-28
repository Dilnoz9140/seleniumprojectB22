package com.cybertek.tests.Assignments;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    /**
     * US: As a user when I am on Vytrack => Fleet => Vehicles, I should be able to see Export Grid dropdown , Refresh, Reset and Grid Settings Buttons
     *
     * AC: User should be able to click refresh button
     *
     *
     * Test Scenario1 : Truck Driver should be able to click refresh button on Vehicles Page
     *
     * Test Case#1
     * Given Truck Driver<User> goes to Vytrack's login page.
     * When Truck Driver<User> enters correct username
     * And Truck Driver<User> enters correct password
     * And Truck Driver<User> clicks Login button
     * And Truck Driver<User> navigates to the Fleet module and accesses Vehicles from dropdown menu
     * Then Truck Driver<User> clicks Refresh button on the top right
     *
     * Test Scenario2 : Sales Manager should be able to click refresh button on Vehicles Page
     *
     * Test Case#1
     * Given Sales Manager<User> goes to Vytrack's login page.
     * When Sales Manager<User> enters correct username
     * And Sales Manager<User> enters correct password
     * And Sales Manager<User> clicks Login button
     * And Sales Manager<User> navigates to the Fleet module and accesses Vehicles from dropdown menu
     * Then Sales Manager<User> clicks Refresh button on the top right
     *
     * Test Scenario3 : Store Manager should be able to click refresh button on Vehicles Page
     *
     * Test Case#1
     * Given Store Manager<User> goes to Vytrack's login page.
     * When Store Manager<User> enters correct username
     * And Store Manager<User> enters correct password
     * And Store Manager<User> clicks Login button
     * And Store Manager<User> navigates to the Fleet module and accesses Vehicles from dropdown menu
     *
     * Then Store Manager<User> clicks Refresh button on the top right
     */

    public class Assignment5 {
        @BeforeMethod
        public void setupMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vyrtackUrl"));
    }
        @Test
        public void Test1() {
            Driver.getDriver().get("https://qa3.vytrack.com/user/login");
            WebElement username = Driver.getDriver().findElement(By.xpath("//input[@type='text']"));
            username.sendKeys("user24");
            WebElement password = Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
            password.sendKeys("UserUser123" + Keys.ENTER);
            BrowserUtils.sleep(3);
            WebElement fleetTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
            fleetTab.click();
            BrowserUtils.sleep(3);
            WebElement vehiclesTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));
            vehiclesTab.click();
            BrowserUtils.sleep(7);
            WebElement refreshButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-repeat']"));
            boolean refreshButtonDisplayed = refreshButton.isDisplayed();
            Assert.assertTrue(refreshButtonDisplayed);
            refreshButton.click();
            BrowserUtils.sleep(3);
            WebElement dropdownToLogout=Driver.getDriver().findElement(By.xpath("//i[@class='fa-caret-down']"));
            dropdownToLogout.click();
            WebElement logOutButton=Driver.getDriver().findElement(By.xpath("//a[@href='/user/logout']"));
            logOutButton.click();
        }


        @Test
        public void Test2() {
            Driver.getDriver().get("https://qa3.vytrack.com/user/login");
            WebElement username = Driver.getDriver().findElement(By.xpath("//input[@type='text']"));
            username.sendKeys("storemanager65");
            WebElement password = Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
            password.sendKeys("UserUser123" + Keys.ENTER);
            BrowserUtils.sleep(5);
            WebElement fleetTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
            fleetTab.click();
            BrowserUtils.sleep(3);
            WebElement vehiclesTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[3]"));
            vehiclesTab.click();
            BrowserUtils.sleep(7);
            WebElement refreshButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-repeat']"));
            boolean refreshButtonDisplayed = refreshButton.isDisplayed();
            Assert.assertTrue(refreshButtonDisplayed);
            refreshButton.click();
            BrowserUtils.sleep(3);
            WebElement dropdownToLogout=Driver.getDriver().findElement(By.xpath("//i[@class='fa-caret-down']"));
            dropdownToLogout.click();
            WebElement logOutButton=Driver.getDriver().findElement(By.xpath("//a[@href='/user/logout']"));
            logOutButton.click();
        }

        @Test
        public void Test3() {
            Driver.getDriver().get("https://qa3.vytrack.com/user/login");
            WebElement username = Driver.getDriver().findElement(By.xpath("//input[@type='text']"));
            username.sendKeys("salesmanager122");
            WebElement password = Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
            password.sendKeys("UserUser123" + Keys.ENTER);
            BrowserUtils.sleep(3);
            WebElement fleetTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
            fleetTab.click();
            BrowserUtils.sleep(3);
            WebElement vehiclesTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[3]"));
            vehiclesTab.click();
            BrowserUtils.sleep(7);
            WebElement refreshButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-repeat']"));
            boolean refreshButtonDisplayed = refreshButton.isDisplayed();
            Assert.assertTrue(refreshButtonDisplayed);
            refreshButton.click();
            BrowserUtils.sleep(3);
            WebElement dropdownToLogout=Driver.getDriver().findElement(By.xpath("//i[@class='fa-caret-down']"));
            dropdownToLogout.click();
            WebElement logOutButton=Driver.getDriver().findElement(By.xpath("//a[@href='/user/logout']"));
            logOutButton.click();
        }
        @AfterMethod
        public void afterMethod(){
            Driver.getDriver().close();
        }

    }