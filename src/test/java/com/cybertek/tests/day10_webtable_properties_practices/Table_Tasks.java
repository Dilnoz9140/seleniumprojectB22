package com.cybertek.tests.day10_webtable_properties_practices;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Table_Tasks extends TestBase {

 @Test
  public void task3_return_tims_due_amount(){
     String url = ConfigurationReader.getProperty("dataTablesUrl");
     driver.get(url);
     // below code is same as above
     //driver.get(ConfigurationReader.getProperty("dataTablesUrl"))


 //      1.Open browser and go to: http://practice.cybertekschool.com/tables#edit

//       //table[@id='table1']//td[.='Tim'] ---> this locator Tim's cell regardless of which row he is

//       2.	Locate first table and verify Tim has due amount of “$50”

//       1st way: //table[@id='table1']//td[.='Tim']/../td[4]
//       2nd way: //table[@id='table1']//td[.='Tim']/following-sibling::td[2]

     WebElement timsDueAmountCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));

     System.out.println("timsDueAmountCell = " + timsDueAmountCell.getText());

     String actualTimResult = timsDueAmountCell.getText();

     String expectedTimResult ="$50.00";

     Assert.assertEquals(actualTimResult,expectedTimResult,"Tim's cell is not returning as expected");


//   Note: Create locator for Tim that will be dynamic and does not care in which row Tim is.



  }


  @Test
    public void tasks4_verify_order_method(){
      String url = ConfigurationReader.getProperty("dataTablesUrl");
      driver.get(url);
      TableUtils.verifyOrder(driver,"Tim");
  }

    @Test
    public void tasks5_print_all_names_and_email(){
        String url = ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(url);
        TableUtils.printNamesAndEmails(driver);
    }

}
