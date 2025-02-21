package com.thetestingpractise.Project01;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium36_InputBox_CheckBox_RadioBox {

     public static void main(String[] args) {

         EdgeDriver driver = new EdgeDriver();
         driver.get("https://awesomeqa.com/practice.html");

         driver.findElement(By.name("firstname")).sendKeys("the testing academy");

         // Radio Box
         driver.findElement(By.id("sex-1")).click();
         driver.findElement(By.id("exp-6")).click();

         // CheckBox

         driver.findElement(By.id("tool-1")).click();

         try {
             Thread.sleep(3000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         driver.quit();




     }
}
