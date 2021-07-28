package com.cybertek.tests.Assignments;


import com.cybertek.tests.Assignment5_Utils.LogIn;
import com.cybertek.tests.Assignment5_Utils.LogOut;
import com.cybertek.tests.Assignment5_Utils.NavigateTo;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass5Adam {

    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
    }
    @Test
    public void Test1() {
        LogIn.toVytrack("user24");
        WebElement fleetTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        WebElement vehiclesTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));
        NavigateTo.FleetTabAndClickVehicle(fleetTab,vehiclesTab);
        BrowserUtils.sleep(5);
        WebElement refreshButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-repeat']"));
        Assert.assertTrue(refreshButton.isDisplayed());
        refreshButton.click();
        BrowserUtils.sleep(3);
        Assert.assertTrue(refreshButton.isDisplayed());
        LogOut.ofVytrack();
    }


    @Test
    public void Test2() {
        LogIn.toVytrack("storemanager65");
        WebElement fleetTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        WebElement vehiclesTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[3]"));
        NavigateTo.FleetTabAndClickVehicle(fleetTab,vehiclesTab);
        BrowserUtils.sleep(5);
        WebElement refreshButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-repeat']"));
        Assert.assertTrue(refreshButton.isDisplayed());
        refreshButton.click();
        BrowserUtils.sleep(3);
        Assert.assertTrue(refreshButton.isDisplayed());
        LogOut.ofVytrack();
    }

    @Test
    public void Test3() {
        LogIn.toVytrack("salesmanager122");
        WebElement fleetTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        WebElement vehiclesTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[3]"));
        NavigateTo.FleetTabAndClickVehicle(fleetTab,vehiclesTab);
        BrowserUtils.sleep(5);
        WebElement refreshButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-repeat']"));
        Assert.assertTrue(refreshButton.isDisplayed());
        refreshButton.click();
        Assert.assertTrue(refreshButton.isDisplayed());
    }
    @AfterClass
    public void afterClass(){
        Driver.getDriver().close();
    }
}