package com.cybertek.tests.Assignments;

import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.cybertek.utilities.Driver.getDriver;

public class ass2 {
    private WebDriver driver;

    @Test
    public void actions_refresh() {
        driver = getDriver();

        getDriver().get("https://qa3.vytrack.com/");

        WebElement userName = getDriver().findElement(By.xpath("//input[@placeholder='Username or Email']"));
        userName.sendKeys("user24");

        WebElement password = getDriver().findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("UserUser123");

        WebElement loginButton = getDriver().findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        BrowserUtils.sleep(2);
        WebElement fleet = getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]/.."));

        Actions actions = new Actions(driver);
        actions.moveToElement(fleet).perform();
        BrowserUtils.sleep(1);

        WebElement vehicles = getDriver().findElement(By.xpath("(//span[@class = 'title title-level-2'])[1]"));
        vehicles.click();

        WebElement refreshButton = getDriver().findElement(By.xpath("//a[@title = 'Refresh']"));
        BrowserUtils.sleep(2);
        refreshButton.click();
        Assert.assertTrue(refreshButton.isDisplayed());
    }
}
