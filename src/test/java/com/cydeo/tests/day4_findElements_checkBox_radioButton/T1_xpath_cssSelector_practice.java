package com.cydeo.tests.day4_findElements_checkBox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

       //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //        TC #1: XPATH and cssSelector Practices
        //        1. Open Chrome browser
       WebDriver driver=  WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();


        //        2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");


        //        3. Locate all the WebElements on the page using XPATH and/or CSS
        //        locator only (total of 6)

        //        a. “Home” link
                //locate 'homeLink using cssSelector, class value (syntex #1)
        WebElement homeLink_ex1= driver.findElement(By.cssSelector("a[class='nav-link']"));

        //locate 'homeLink using cssSelector (syntex #2)
        WebElement homeLink_ex2= driver.findElement(By.cssSelector("a.nav-link"));

        //locate 'homeLink using cssSelector href value
        WebElement homeLink_ex3= driver.findElement(By.cssSelector("a[href='/']"));


        //        b. “Forgot password” header
                //locate header using cssSelector: locate the parent element and move down to h2

        WebElement forgotPasswordHeader = driver.findElement(By.cssSelector("div.example>h2"));

                //locate header using xpath and using web elements text "Forgot Password"
      //  WebElement forgotPasswordHeader1= driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        WebElement forgotPasswordHeader2= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //        c. “E-mail” text

        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));


        //        d. E-mail input box
        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));

        //locate inputBox, using xpath contains method

        //tagName [contains(@attribute,'value')]

        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));


        //        e. “Retrieve password” button
        WebElement retrievePasswordButton= driver.findElement(By.xpath("//button[@id='form_submit']"));


        //        f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        //        4. Verify all web elements are displayed.

        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());

        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());

        System.out.println("emailText.isDisplayed() = " + emailLabel.isDisplayed());

        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());

        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());

        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());


        //        First solve the task with using cssSelector only. Try to create 2 different
        //        cssSelector if possible
        //
        //        Then solve the task using XPATH only. Try to create 2 different
        //        XPATH locator if possible
        //



driver.quit();

    }


}
