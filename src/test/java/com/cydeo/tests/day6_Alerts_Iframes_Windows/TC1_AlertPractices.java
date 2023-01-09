package com.cydeo.tests.day6_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1_AlertPractices {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //TC #1: Information alert practice
        //1. Open browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }


    @Test
    public void alert_test1() throws InterruptedException {
        //3. Click to “Click for JS Alert” button

        WebElement informationAlertButton= driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        informationAlertButton.click();
        Thread.sleep(2000);

        //to be able to click to alert OK button we need to switch driver's focus to alert itself.
        Alert alert=driver.switchTo().alert();


        //4. Click to OK button from the alert

        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //Failure message will only be displayed is assertion fails: "Result text is NOT displayed."
        Assert.assertTrue(resultText.isDisplayed(),"Result text is NOT displayed.");


        String expectedTest="You successfully clicked an alert";
        String actualTExt =resultText.getText();

        Assert.assertEquals(actualTExt, expectedTest,"Actual result text is not expected!!");


        driver.close();
    }



}
