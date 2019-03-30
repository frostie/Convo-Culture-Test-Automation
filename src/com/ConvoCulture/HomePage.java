package com.ConvoCulture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class HomePage

{

    public static void GoToHomePage() throws InterruptedException

    {

        WebDriver driver = new SafariDriver();
        driver.get("http://www.convoculture.ca");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"post-215\"]/div[2]/p[9]/a/strong")).click();
        Thread.sleep(3000);
        driver.quit();
        System.out.println("GoToHomePage Test passed!");

    }
}