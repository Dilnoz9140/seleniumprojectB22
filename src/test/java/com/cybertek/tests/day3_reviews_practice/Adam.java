package com.cybertek.tests.day3_reviews_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Adam {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan=new Scanner(System.in);
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        System.out.println("Type a ticker in UpperCase, only stocks in NASDAQ are available");
        String ticker=scan.next();
        driver.get("https://nasdaq.com/");
        WebElement searchBar=driver.findElement(By.id("find-symbol-input"));
        searchBar.sendKeys(ticker+Keys.ENTER);
        WebElement click= driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[4]/div/section/div/div[3]/ul/li[9]/a"));
        String link=click.getAttribute("href");
        driver.get(link);
        WebElement institutionalOwnership= driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[4]/div[3]/div/div[1]/div/div[1]/div[1]/div/div[2]/div/table/tbody/tr[1]/td[2]"));
        System.out.println("Institutional Ownership: "+institutionalOwnership.getText());
        WebElement holder1= driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[4]/div[3]/div/div[1]/div/div[1]/div[4]/div[2]/div[4]/div/table/tbody/tr[1]/td[1]"));
        WebElement holder1Value= driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[4]/div[3]/div/div[1]/div/div[1]/div[4]/div[2]/div[4]/div/table/tbody/tr[1]/td[6]"));
        WebElement holder1Change=driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[4]/div[3]/div/div[1]/div/div[1]/div[4]/div[2]/div[4]/div/table/tbody/tr[1]/td[5]"));
        WebElement holder2=driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[4]/div[3]/div/div[1]/div/div[1]/div[4]/div[2]/div[4]/div/table/tbody/tr[2]/td[1]"));
        WebElement holder2Value= driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[4]/div[3]/div/div[1]/div/div[1]/div[4]/div[2]/div[4]/div/table/tbody/tr[2]/td[6]"));
        WebElement holder2Change=driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[4]/div[3]/div/div[1]/div/div[1]/div[4]/div[2]/div[4]/div/table/tbody/tr[2]/td[5]"));
        WebElement holder3=driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[4]/div[3]/div/div[1]/div/div[1]/div[4]/div[2]/div[4]/div/table/tbody/tr[3]/td[1]/a"));
        WebElement holder3Value=driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[4]/div[3]/div/div[1]/div/div[1]/div[4]/div[2]/div[4]/div/table/tbody/tr[3]/td[6]"));
        WebElement holder3Change=driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[4]/div[3]/div/div[1]/div/div[1]/div[4]/div[2]/div[4]/div/table/tbody/tr[3]/td[5]"));
        System.out.println("Top Three Holders: \n"+holder1.getText()+" | "+holder1Change.getText()+" |  "+
                holder1Value.getText()+"\n"+holder2.getText()+" | " +holder2Change.getText()+" | "
                +holder2Value.getText()+"\n"+holder3.getText()+" | "
                +holder3Change.getText()+" | "+holder3Value.getText());
        driver.get("https://marketbeat.com/");
        WebElement searchBar2=driver.findElement(By.id("headerSearch"));
        searchBar2.sendKeys(ticker+ Keys.ENTER);
        driver.findElement(By.className("ticker-area")).click();
        Thread.sleep(2000);

        //WebElement insiderOwnership= driver.findElement(By.xpath("//*[@id=\"cphPrimaryContent_tabInsiderTrades\"]/div[1]/table/tbody/tr[1]/td[2]"));
        //  System.out.println("Insider ownership: "+insiderOwnership.getText());
        driver.findElement(By.id("tabShortInterest")).click();
        WebElement shortInterest= driver.findElement(By.xpath("//*[@id=\"cphPrimaryContent_tabShortInterest\"]/div[1]/div[1]/table/tbody/tr[4]/td"));
        System.out.println("Short Interest: "+shortInterest.getText());
        WebElement shortInterestChange= driver.findElement(By.xpath("//*[@id=\"cphPrimaryContent_tabShortInterest\"]/div[1]/div[1]/table/tbody/tr[3]/td"));
        System.out.println("Short Interest Change over a month: "+shortInterestChange.getText());
        driver.get("https://seekingalpha.com/");
        WebElement searchBar3=driver.findElement(By.className("__1bf4b-3VrhH __1bf4b-8_QFK __1bf4b-2M59r __1bf4b-3QGcK __1bf4b-3YRQn __1bf4b-1cZBx __1bf4b-3IAyn __1bf4b-303EE __1bf4b-1qE-_ __1bf4b-3DOuR __1bf4b-2mMGD __1bf4b-2S5bj __1bf4b-2ehr- __1bf4b-325w7 __1bf4b-2cU_s __1bf4b-SUzAb __1bf4b-1su23 __1bf4b-1LIRl"));
        searchBar3.sendKeys(ticker+Keys.ENTER);
        WebElement insiderOwnership= driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div[2]/div/div[4]/div/div/div[1]/div[20]/section/div/div[2]/div/div/table/tbody/tr[4]/td[2]/div"));
        System.out.println("Insider ownership: "+insiderOwnership.getText());




    }
}


