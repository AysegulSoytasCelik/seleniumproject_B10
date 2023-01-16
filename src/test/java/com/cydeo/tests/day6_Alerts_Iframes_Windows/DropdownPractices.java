package com.cydeo.tests.day6_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;




public class DropdownPractices {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC #5: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void dropdown_task5(){


        //we located the dropdown and it is ready to use
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois


        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia


        stateDropdown.selectByValue("VA");


        //5. Select California



        stateDropdown.selectByIndex(5);


        //6. Verify final selected option is California.

        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText);

    }




    @Test
    public void dropdown_task6() {


        //TC #6: Selecting date on dropdown and verifying
         //1. Open Chrome browser +
          //2. Go to https://practice.cydeo.com/dropdown +

          //3. Select “December 1st, 1923” and verify it is selected.

        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //    //Select year using : visible text

        yearDropdown.selectByVisibleText("1924");

        //    //Select month using : value attribute

        monthDropdown.selectByValue("11");

        //    //Select day using : index num
        dayDropdown.selectByIndex(0);

        //creating expected values

        String expectedYear= "1924";
        String expectedMonth="December";
        String expectedDay="1";

        //getting actual values from browser
        String actualYear= yearDropdown.getFirstSelectedOption().getText();
        String actualMonth= monthDropdown.getFirstSelectedOption().getText();
        String actualDay= dayDropdown.getFirstSelectedOption().getText();

        //create assertions

        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertTrue(actualMonth.equals(expectedMonth));
        Assert.assertTrue(actualDay.equals(expectedDay));


    }

    @AfterMethod
    public void teardownMethod(){
        driver.quit();
    }


}