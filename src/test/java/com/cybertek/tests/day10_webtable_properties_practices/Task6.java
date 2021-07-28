package com.cybertek.tests.day10_webtable_properties_practices;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task6 {
    WebDriver driver;
    @BeforeMethod
    public void beforeTask() throws InterruptedException {
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.manage().window().maximize();
        Thread.sleep(3);
    }
    @Test
    public void test(){
        Faker faker=new Faker();
        WebElement name= driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys(faker.name().firstName());
        WebElement lastname= driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys(faker.name().lastName());
        WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("adamRakhmanov");
        WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("adamrakhmanov1@gmail.com");
        WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("1234567890");
        WebElement phoneNumber= driver.findElement(By.xpath("//input[@type='tel']"));
        phoneNumber.sendKeys("615-707-2753");
        WebElement gender= driver.findElement(By.xpath("//input[@value='male']"));
        gender.click();
        WebElement birthday= driver.findElement(By.xpath("//input[@name='birthday']"));
        birthday.sendKeys("01/05/2008");
        WebElement dropdown= driver.findElement(By.xpath("//select[@name='department']"));
        Select select1=new Select(dropdown);
        select1.selectByVisibleText("Department of Engineering");
        WebElement job= driver.findElement(By.xpath("//select[@name='job_title']"));
        Select select2=new Select(job);
        select2.selectByVisibleText("SDET");
        WebElement checkBox1= driver.findElement(By.xpath("(//div[@class='form-check form-check-inline'])[1]"));
        checkBox1.click();
        WebElement checkBox2= driver.findElement(By.xpath("(//div[@class='form-check form-check-inline'])[2]"));
        checkBox2.click();
        WebElement checkBox3= driver.findElement(By.xpath("(//div[@class='form-check form-check-inline'])[3]"));
        checkBox3.click();
        WebElement submitButton= driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
    }
}
