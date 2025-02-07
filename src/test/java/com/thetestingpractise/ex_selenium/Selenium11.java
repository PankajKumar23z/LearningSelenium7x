package com.thetestingpractise.ex_selenium;

import org.openqa.selenium.edge.EdgeDriver;

import java.net.URL;

public class Selenium11 {

    // get vs navigate.to()

    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://bing.com");
        // No back, forward allowed in case of get

        driver.navigate().to("https://app.vwo.com");
       // driver.navigate().to( new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
      // using navigate().to we can go back , forward

    }


}
