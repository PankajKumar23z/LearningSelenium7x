package com.thetestingpractise.Project01;

import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium42_JS_DEMO1 {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser()  {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("---guest");
        driver = new EdgeDriver(options);
    }

    @Description("Verify Shadow DOM")
    @Test
    public void test_JS_DEMO() {

        driver.manage().window().maximize();
        String URL = "https://selectorshub.com/xpath-practice-page/";
        driver.get(URL);
        driver.manage().window().maximize();
        // local-name() , name() - Xpath (built in )
        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("window.scrollBy(0, 500);");

        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);





    }

    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }








}
