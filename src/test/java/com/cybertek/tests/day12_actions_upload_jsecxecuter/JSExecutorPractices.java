package com.cybertek.tests.day12_actions_upload_jsecxecuter;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutorPractices {
    @Test
    public void scroll_using_jsExecutor_test1(){

        //Get the page: http://practice.cybertekschool.com/infinite_scroll

        Driver.getDriver().get(" http://practice.cybertekschool.com/infinite_scroll");

        //  ((JavascriptExecutor) Driver.getDriver()).executeScript("");

        // Down casting our driver type to JavascriptExecutor so we can reach methods in this interface

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //using js we reach executeScript method so we are allowed to pass JavaScript functions.
        //this method is capable of accepting JavaScript functions and apply that into our Java+Selenium code

        js.executeScript("window.scrollBy(0, 750)");

    }
    @Test
    public void scroll_using_jsExecutor_test2(){
        Driver.getDriver().get(" http://practice.cybertekschool.com/large");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //Locating the web elements so we can use in js.executeScript method
        WebElement cybertekSchoolLink= Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink= Driver.getDriver().findElement(By.linkText("Home"));

        //use js.executor with different scrolling JavaScript function
        //scroll down to cybertekSchool Link
        BrowserUtils.sleep(1);
        js.executeScript("arguments[0].scrollIntoView(true)", cybertekSchoolLink);

        //scroll up to home link
        BrowserUtils.sleep(1);
        js.executeScript("arguments[0].scrollIntoView(true)", cybertekSchoolLink);








    }

}
