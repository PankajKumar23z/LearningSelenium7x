package com.thetestingpractise.Project01;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium27 {


    @Description("Verify that the error message will come for the wrong email at the free trail in the app.vwo.com signup page.")
    @Test
            public void test_error_free_trial() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");
     //   WebElement email =driver.findElement(By.id("page-v1-step1-email"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("90809342334wewwwrw");

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        buttonList.get(0).click();

        // tag name will find all the buttons in the page

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        WebElement error_Message = driver.findElement(By.className("invalid-reason"));
        System.out.println(error_Message.getText());

        Assert.assertEquals(error_Message.getText(),"The email address you entered is incorrect.");// It will give the title
        driver.quit();
    }
}
