package com.thetestingpractise.Project01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium25 {

    @Test
    public void testVwoLoginNegative() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        // Findelement -> 1 element first web element
        // Findelements -> which can find multiple web elements

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        // Link text - Full Match and
        // partial text only work - Contains - Partial Match



//<a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage" class="text-link" data-qa="bericafeqo"
// >Start a free trial</a>

        // WebElement link_webelement= driver.findElement(By.linkText("Start a free trial"));
        //link_webelement.click();

        WebElement Partial_link_webelement= driver.findElement(By.partialLinkText("Start a free trial"));
        Partial_link_webelement.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }




}


