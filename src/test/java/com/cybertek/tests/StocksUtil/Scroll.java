package com.cybertek.tests.StocksUtil;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Scroll {
    public static void Down() {
                WebElement scrollDown = Driver.getDriver().findElement(By.xpath("//body[@onload='ScreenerInit();']"));
        for (int i = 0; i < 20; i++) {
            scrollDown.sendKeys(Keys.ARROW_DOWN);
        }
    }
}
