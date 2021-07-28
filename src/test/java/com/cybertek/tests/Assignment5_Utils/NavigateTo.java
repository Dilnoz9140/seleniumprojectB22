package com.cybertek.tests.Assignment5_Utils;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NavigateTo {
    public static void FleetTabAndClickVehicle(WebElement FleetTab, WebElement Vehicles){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(FleetTab).perform();
        BrowserUtils.sleep(1);
        Vehicles.click();
    }
}
