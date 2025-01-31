package com.thetestingpractise.ex_selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium08 {

    @Test
    public void testMethod01() {
        // EdgeOptions -> It will help you set the Browser
        // options to browsers
        // window - size
        // headless mode - there is not UI - > advantage - Fast Execution
        // InCognito mode - switch
        // start Max
        // add extensions - browsers
        // 100+ others , https, http
        // localstorage , download ?
        // All the above can given through the edge options class

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("---start-maximized");
        edgeOptions.addArguments("---window-size=800,600");
    // Browser functions will be common amoung all of them

      //(https://peter.sh/experiments/chromium-command-line-switches/) we can set line 23 24



        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://google.com");


    }
}
