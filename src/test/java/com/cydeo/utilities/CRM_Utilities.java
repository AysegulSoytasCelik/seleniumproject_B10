package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    /*
    this method will log in with helpdesk1@cybertekschool.com
    user when it is called
     */
    public static void crm_login(WebDriver driver) {
        ////3. Enter valid username

        WebElement usernameBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameBox.sendKeys("helpdesk1@cybertekschool.com");

        ////4. Enter valid password
        BrowserUtils.sleep(3);
        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordBox.sendKeys("UserUser");

        ////5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

    }

    public static void crm_login(WebDriver driver, String username, String password) {
        ////3. Enter valid username
        BrowserUtils.sleep(3);
        WebElement usernameBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameBox.sendKeys(username);

        ////4. Enter valid password
        BrowserUtils.sleep(3);
        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordBox.sendKeys(password);

        ////5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();


    }






//Method #2 info:
//• Name: login_crm()
//• Return type: void
//• Arg1: WebDriver
//• Arg2: String username
//• Arg3: String password


}