package com.cydeo.tests.day7_webtables_utilities;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase {




    //TC #3: Login scenario
    @Test
    public void crm_login_test() {

        ////2. Go to : http://login1.nextbasecrm.com/

        driver.get("http://login1.nextbasecrm.com/");

        ////3. Enter valid username
        BrowserUtils.sleep(3);
        WebElement usernameBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameBox.sendKeys("helpdesk1@cybertekschool.com");

        ////4. Enter valid password
        BrowserUtils.sleep(3);
        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordBox.sendKeys("UserUser");

        ////5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        ////6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver, "Portal");

        ////Expected: Portal


    }

    @Test
    public void crm_login_test_2() {

        ////2. Go to : http://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");

        //calling my utility method to log in helpdesk1
        CRM_Utilities.crm_login(driver);

        ////6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver, "Portal");

        ////Expected: Portal


    }

    @Test
    public void crm_login_test_3() {

        ////2. Go to : http://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");

        //calling my utility method to log in helpdesk1
        CRM_Utilities.crm_login(driver,"helpdesk2@cybertekschool.com","UserUser");

        ////6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver, "Portal");

        ////Expected: Portal


    }

@AfterMethod
    public void teardown(){
        driver.close();
}
}
//USERNAME PASSWORD


//helpdesk1@cybertekschool.com UserUser
//Helpdesk2@cybertekschool.com UserUser