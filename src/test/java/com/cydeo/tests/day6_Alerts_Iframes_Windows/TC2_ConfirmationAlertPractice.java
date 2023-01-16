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

public class TC2_ConfirmationAlertPractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void JSConfirmButton() throws InterruptedException {
        WebElement confirmButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmButton.click();

        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //5. Verify “You clicked: Ok” text is displayed.

        WebElement resultTest = driver.findElement(By.xpath("//p[@id='result']"));
        String ecpectedtext = "You clicked: Ok";
        String actualTest =resultTest.getText();
        Assert.assertEquals(actualTest,ecpectedtext);


    }@Test
    public void promptAlertTest(){
        WebElement promptAlertButton= driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        promptAlertButton.click();
//4. Send “hello” text to alert

        Alert alert= driver.switchTo().alert();
        alert.sendKeys("hello");

        //5. Click to OK button from the alert
        alert.accept();


        ////6. Verify “You entered: hello” text is displayed.
      WebElement okButton= driver.findElement(By.xpath("//p[.='You entered: hello']"));
      String expectedEnteredText= "You entered: hello";
        String actualTest =okButton.getText();

        Assert.assertEquals(actualTest,expectedEnteredText);



    }


}
//TC #2: Confirmation alert practice
//1. Open browser
//2. Go to website: http://practice.cydeo.com/javascript_alerts
//3. Click to “Click for JS Confirm” button
//4. Click to OK button from the alert
//5. Verify “You clicked: Ok” text is displayed.
//TC #3: Prompt alert practice
//1. Open browser
//2. Go to website: http://practice.cydeo.com/javascript_alerts
//3. Click to “Click for JS Prompt” button
//4. Send “hello” text to alert
//5. Click to OK button from the alert
//6. Verify “You entered: hello” text is displayed.