package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop {

    @Test
    public void circle_drag_N_drop() {


        //TC #: Drag and drop
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement acceptButton = Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        acceptButton.click();

                //locate small and big circles to be able to drag them around
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement biggerCircle = Driver.getDriver().findElement(By.id("droptarget"));

        //2. Drag and drop the small circle to bigger circle.
        Actions actions = new Actions(Driver.getDriver());
       // actions.dragAndDrop(smallCircle,biggerCircle).perform();  -->  ???  why is this method didnt work in this code???
        actions.clickAndHold(smallCircle)
                .pause(2000)
                .moveToElement(biggerCircle)
                .pause(2000)
                .release()
                .perform();


//     //                       source         target

        //3. Assert:
        //-Text in big circle changed to: “You did great!”

        String actualBigCircleText = biggerCircle.getText();
        String expectedBigCircleText = "You did great!";
        Assert.assertEquals(actualBigCircleText,expectedBigCircleText);


    }


}
