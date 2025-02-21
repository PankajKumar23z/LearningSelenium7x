package com.thetestingpractise.Project01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium32 {
    // Locators - find the Web Elements

    // TC ( Negative) - Invalid username, pass - Error message
    // Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
    // Find the Email id** and enter the email as admin@admin.com
    //Find the pass inputbox** and enter passwrod as admin.
    // Find and Click on the submit button
    //Verify that the error message is shown "Your email, password, IP address or location did not match"

    @Test
    public void testVwoLoginNegative()  {

        // How to find the elements
        // Selenium
        // ID , NAME , CLASS NAME, TAGName,

        //We can find the input box below by inspecting the element

       // <input type="email"
        // class="text-input W(80%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi">

        // **reference Rule**  ->
        //
        //- unique ID -> name -> class Name -> TagName -> Link Text/ Partial  - CSS Selector -> XPath.
        // - If it dynamic or changes( we try to avoid the Locator ) or multiple classes.
        // - If it is not unique we will avoid it.
        //- Try to find the shortest Locator and easy to remember, which doesn't change much.

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        // Findelement -> 1 element first web element
        // Findelements -> which can find multiple web elements

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(),"Login - VWO");// It will give the title
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");// It will give the title

     //   # Find the email inputbox and enter the email
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("password@321");

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

       // try {
       //     Thread.sleep(3000);
       // } catch (InterruptedException e) {
       //     throw new RuntimeException(e);
       // }

        WebElement error_message = driver.findElement(By.className("notification-box-description"));


        // Condition


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.textToBePresentInElement(error_message,"Your email, password, IP address or location did not match"));

        // after 3 seconds the error message comes

        Assert.assertEquals(error_message .getText(),"Your email, password, IP address or location did not match");



        driver.quit();

    }




}
