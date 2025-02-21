package com.thetestingpractise.Project01;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

import static com.thetestingpractise.Project01.WaitHelpers.checkVisibilityByFluentWait;

public class Selenium35 {

    @Test
    public void testVwoLoginNegative()  {

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




        // Condition

//        FluentWait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                        .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
//
//
//        WebElement error_message = wait.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.className("notification-box-description"));
//            }
//        });
        // we yse above or below

        WebElement error_message = checkVisibilityByFluentWait(driver,By.className("notification-box-description"));



//        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(3000));
//        wait2.until(ExpectedConditions.visibilityOf(error_message));
//
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
//        wait.until(ExpectedConditions.textToBePresentInElement(error_message,"Your email, password, IP address or location did not match"));

        // We can delete the line no 78 also
        // after 3 seconds the error message comes

        Assert.assertEquals(error_message .getText(),"Your email, password, IP address or location did not match");



        driver.quit();

    }




}
