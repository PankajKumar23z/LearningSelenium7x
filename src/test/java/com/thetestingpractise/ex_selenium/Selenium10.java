package com.thetestingpractise.ex_selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium10 {

    @Test

    public void testQuitVsClose() {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");

     //   driver.close();
        // Close the Current Browser Window - not the full Browser
        // It will only close the current tab and not all the multiple tabs
        // Closed the Window, Session id ! = null(not deleted , Error - Invalid session ID

         driver.quit();
         // Close all the windows/sessions and session = null and stop the browser
        // It will only close the browser and all  tabs
        //


    }


}
