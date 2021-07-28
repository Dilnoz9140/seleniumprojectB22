package com.cybertek.tests.StocksUtil;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void toAnalyze(String marketCap){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        Driver.getDriver().get("https://finance.yahoo.com/screener/new/");
        if(marketCap.equalsIgnoreCase("small")){
            Driver.getDriver().findElement(By.xpath("(//button[@class='Py(8px) Px(15px) Bdc($seperatorColor) Bgc($hoverBgColor):h Cur(p) Fz(s) Bgc($lv3BgColor) C($tertiaryColor)  BdEnd'])[1]")).click();
            Driver.getDriver().findElement(By.xpath("//button[@data-test=\"find-stock\"]"));
        }else if(marketCap.equalsIgnoreCase("medium")) {
            Driver.getDriver().findElement(By.xpath("(//button[@class='Py(8px) Px(15px) Bdc($seperatorColor) Bgc($hoverBgColor):h Cur(p) Fz(s) Bgc($lv3BgColor) C($tertiaryColor)  BdEnd'])[2]")).click();
            Driver.getDriver().findElement(By.xpath("//button[@class='Bgc($linkColor) C(white) Fw(500) Px(20px) Py(9px) Bdrs(3px) Bd(0) Fz(s) D(ib) Whs(nw) Miw(110px) Bgc($linkActiveColor):h']"));
        }else if(marketCap.equalsIgnoreCase("large")){
            Driver.getDriver().findElement(By.xpath("(//button[@class='Py(8px) Px(15px) Bdc($seperatorColor) Bgc($hoverBgColor):h Cur(p) Fz(s) Bgc($lv3BgColor) C($tertiaryColor)  BdEnd'])[3]")).click();
            Driver.getDriver().findElement(By.xpath("//button[@class='Bgc($linkColor) C(white) Fw(500) Px(20px) Py(9px) Bdrs(3px) Bd(0) Fz(s) D(ib) Whs(nw) Miw(110px) Bgc($linkActiveColor):h']"));
        }else{
            System.out.println("Please choose a valid market cap");
            Driver.getDriver().quit();
        }
        BrowserUtils.sleep(3);
        List<WebElement> stocks = Driver.getDriver().findElements(By.xpath("//a[@data-test='quoteLink']"));
        String amountOfStocks=Driver.getDriver().findElement(By.xpath("//div[@class=\"Fw(b) Fz(36px)\"]")).getText();
        int amountOfPages=Integer.parseInt(amountOfStocks)/25;
        for (int i = 2; i <amountOfPages; i++) {
            WebElement page=Driver.getDriver().findElement(By.xpath("(//span[@class=\"Va(m)\"])[3]"));
            page.click();
        }
        for (int j = 1; j <=25; j++) {
            WebElement stocksOnThePage= Driver.getDriver().findElement(By.xpath("(//a[@data-test='quoteLink'])["+j+"]"));
            stocks.add(stocksOnThePage);
        }
    }
}
