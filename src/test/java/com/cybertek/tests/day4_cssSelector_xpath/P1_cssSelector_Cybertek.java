package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_Cybertek {
    public static void main(String [] args){
        //TC #1: Practice Cybertek.com_ForgotPassword WebElement verification
        //1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get(" http://practice.cybertekschool.com/forgot_password");

        //3. Locate all the Web Element on the page using XPATH and or CSS locator only
        //a. "Home" link
        //  WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //b."Forgot password" header
        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));

        //c. "E-mail" text
        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));

        //d. :"E-mail" input box
        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));

        //e."Retrieve password" button

        //f."Powered by Cybertek School
    }

}
