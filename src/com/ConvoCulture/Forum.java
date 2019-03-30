package com.ConvoCulture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Forum

{

    public static void GoToForumPage() throws InterruptedException

    {

        WebDriver driver = new SafariDriver();
        driver.get("http://www.convoculture.ca/forum");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.quit();
        System.out.println("GoToForumPage Test passed!");

    }

    public static void LoginForum() throws InterruptedException

    {

        WebDriver driver = new SafariDriver();
        driver.get("http://www.convoculture.ca/forum");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // ADD STEPS HERE
        driver.quit();
        System.out.println("SubmitForumPost Test passed!");

    }

    public static void CreateForumPost() throws InterruptedException

    {

        WebDriver driver = new SafariDriver();
        driver.get("http://www.convoculture.ca/forum");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // ADD STEPS HERE
        driver.quit();
        System.out.println("SubmitForumPost Test passed!");

    }
}
