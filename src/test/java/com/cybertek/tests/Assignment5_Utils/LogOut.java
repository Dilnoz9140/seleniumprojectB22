package com.cybertek.tests.Assignment5_Utils;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogOut {
    public static void ofVytrack(){
        WebElement dropdownToLogout= Driver.getDriver().findElement(By.xpath("//i[@class='fa-caret-down']"));
        dropdownToLogout.click();
        WebElement logOutButton=Driver.getDriver().findElement(By.xpath("//a[@href='/user/logout']"));
        logOutButton.click();
    }
}
