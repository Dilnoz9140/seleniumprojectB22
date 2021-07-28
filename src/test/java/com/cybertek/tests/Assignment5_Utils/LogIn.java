package com.cybertek.tests.Assignment5_Utils;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LogIn {
        public static void toVytrack(String username){
            WebElement usernameTab = Driver.getDriver().findElement(By.xpath("//input[@type='text']"));
            usernameTab.sendKeys(username);
            WebElement passwordTab = Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
            passwordTab.sendKeys("UserUser123" + Keys.ENTER);
            BrowserUtils.sleep(3);
        }
    }

