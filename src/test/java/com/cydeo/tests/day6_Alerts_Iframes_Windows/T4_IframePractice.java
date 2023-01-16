package com.cydeo.tests.day6_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {
    WebDriver driver;

   // @BeforeMethod
    @BeforeClass
    public void setupMethod(){
        //1. Create a new class called: T4_Iframes
        //2. Create new test and make setups

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //3. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
    }

    //@Ignore
    @Test
    public void iframe_test(){
        //we need to switch driver's focus to iframe
        //option number 1--> switching to iframe using id attribute value

        driver.switchTo().frame("mce_0_ifr");


        //locate the p tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        //4. Assert: “Your content goes here.” Text is displayed.

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());


        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        //to be able to verify the header, we must switch back to  "main HTML"

        driver.switchTo().parentFrame();

        WebElement headerText= driver.findElement(By.xpath("//h3"));

        //assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());

    }




}