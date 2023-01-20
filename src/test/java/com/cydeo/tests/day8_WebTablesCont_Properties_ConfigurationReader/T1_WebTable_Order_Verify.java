package com.cydeo.tests.day8_WebTablesCont_Properties_ConfigurationReader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");


    }

    @Test
    public void order_name_verify_test() {
        //Locate the cell that has Bob Martin text in it

        WebElement bobMartinCell = driver.findElement
                (By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());

        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”

        String expectedBobName = "Bob Martin";
        String actualBobName = bobMartinCell.getText();

        Assert.assertEquals(actualBobName, expectedBobName);


        //3. Verify Bob Martin’s order date is as expected
        WebElement bobsOrderDate =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        String expectedOrderDate = "12/31/2021";
        String actualBobDate = bobsOrderDate.getText();
        //if i use bobsOrderDate variable in the method, it gives me
        // ==>"[[ChromeDriver: chrome on WINDOWS (95fe3d560615b2a25a3f9684cfc6846d)] ->
        // xpath: //table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"))

        Assert.assertEquals(actualBobDate, expectedOrderDate);
        //Expected: 12/31/2021


    }


    //in this part(test2) we use the utility method we created
    @Test
    public void test2() {
        String customerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);

        String customerOrderDate2 = WebTableUtils.returnOrderDate(driver, "Stewart Dawidson");
        System.out.println("customerOrderDate2 = " + customerOrderDate2);
    }

    //using WebTableUtils.orderVerify(); method

    @Test
    public void test3() {
        WebTableUtils.orderVerify(driver, "Bart Fisher", "01/16/2021");


    }


}
