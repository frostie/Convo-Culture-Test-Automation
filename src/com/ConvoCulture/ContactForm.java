package com.ConvoCulture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ContactForm
{

    public static void GoToContactPage() throws InterruptedException
    {

        WebDriver driver = new SafariDriver();
        driver.get("http://www.convoculture.ca/contact");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.quit();
        System.out.println("GoToContactPage Test passed!");
    }

    public static void SubmitEnquiry() throws InterruptedException

    {

        WebDriver driver = new SafariDriver();
        driver.get("http://www.convoculture.ca/contact");
        driver.findElement(By.name("your-name")).sendKeys("John Smith");
        driver.findElement(By.name("your-email")).sendKeys("johnsmith@gmail.com");
        driver.findElement(By.name("your-subject")).sendKeys("SubmitEnquiry Test");
        driver.findElement(By.name("your-message")).sendKeys("This is a test message.");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#wpcf7-f78-p16-o1 > form > p:nth-child(6) > input")).click();
        driver.quit();
        System.out.println("SubmitEnquiry Test passed!");

    }

}
