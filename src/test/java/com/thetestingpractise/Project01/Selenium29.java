package com.thetestingpractise.Project01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium29 {

    @Test
    public void test_verify_expire_message() throws InterruptedException {

      //  EdgeOptions edgeOptions = new EdgeOptions();
     //   edgeOptions.addArguments("--start_maximized
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");
        driver.manage().window().maximize();

        Thread.sleep(2000);

     //   <input
        //   _ngcontent-bvr-c4=""
        //   autofocus=""
        //   class="id-form-ctrl ng-pristine ng-valid ng-touched"
        //   id="username"
        //   name="username"
        //   type="email">

       // WebElement username_input = driver.findElement(By.id("username"));
        //      WebElement username_input_xpath = driver.findElement(By.xpath("//input[@id= 'username']"));
 //       WebElement username_input_css_1 = driver.findElement(By.cssSelector("input#username"));
  //      WebElement username_input_css_2= driver.findElement(By.cssSelector("#username"));
       WebElement username_input_1= driver.findElement(By.name("username"));


        username_input_1.sendKeys("augtest_040823@idrive.com");

         WebElement password_input_xpath = driver.findElement(By.xpath("//input[@id='password']"));
        password_input_xpath.sendKeys("123456");


        WebElement span_checkbox = driver.findElement(By.className("id-checkmark"));
        span_checkbox.click();



        WebElement button_submit = driver.findElement(By.cssSelector("div.id-frm-btnblk > button"));
        button_submit.click();


        Thread.sleep(5000);

       // WebElement button_submit = driver.findElement(By.cssSelector("div.id-card-cont h5.id-card-title"));
        WebElement error_message_freetrial = driver.findElement(By.xpath("//h5[@class=\'id-card-title\']"));
        Assert.assertEquals(error_message_freetrial.getText(),"Your free trial has expired");

        Thread.sleep(2000);
        driver.quit();

    }
}
