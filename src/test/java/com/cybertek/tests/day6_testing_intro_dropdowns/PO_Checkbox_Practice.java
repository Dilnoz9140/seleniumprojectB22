package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class PO_Checkbox_Practice {
    public static void main(String[] args) throws InterruptedException {
        //Practice:Cybertek Checkbox
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //1. Go to http://practice.cybertekschool.com/checkboxes
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        //2. Confirm checkbox #1 is Not Selected by default
        if(!checkbox1.isSelected()){
            System.out.println("Checkbox 1 is not selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox 1 is selected.Verification FAILED!");
        }
        //3. Confirm checkbox #2 is  Selected by default
        if (checkbox2.isSelected()) {
            System.out.println("Checkbox 2 is Selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox 2 is not selected.Verification FAILED!");
        }

        //4. Click checkbox #1 to Select it
        Thread.sleep(2000);
        checkbox1.click();

        //5. Click checkbox #2 to Deselect it
        Thread.sleep(2000);
        checkbox2.click();

        //6. Confirm checkbox #1 is Selected
        if (checkbox1.isSelected()) {
            System.out.println("Checkbox 1 is Selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox 1 is not selected.Verification FAILED!");
        }

        //7. Confirm checkbox #2 is Not Selected
        if(!checkbox2.isSelected()){
            System.out.println("Checkbox 2 is not selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox 2 is selected.Verification FAILED!");
        }
         driver.close();
    }

}
