package com.ConvoCulture;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Main
{

    public static void main(String[] args) throws InterruptedException
    {
        GoToHomePage();
        GoToAboutPage();
        GoToLessonsPage();
        GoToResourcesPage();
        GoToJobsPage();
        GoToContactPage();
        GoToForum();
    }

    public static void GoToHomePage() throws InterruptedException
    {
        WebDriver driver = new SafariDriver();
        driver.get("http://www.convoculture.ca");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Test passed!");
    }

    public static void GoToAboutPage() throws InterruptedException
    {
        WebDriver driver = new SafariDriver();
        driver.get("http://www.convoculture.ca");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("menu-item-7")).click();
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Test passed!");
    }

    public static void GoToLessonsPage() throws InterruptedException
    {
        WebDriver driver = new SafariDriver();
        driver.get("http://www.convoculture.ca");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("menu-item-52")).click();
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Test passed!");
    }

    public static void GoToResourcesPage() throws InterruptedException
    {
        WebDriver driver = new SafariDriver();
        driver.get("http://www.convoculture.ca");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("menu-item-37")).click();
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Test passed!");
    }

    public static void GoToJobsPage() throws InterruptedException
    {
        WebDriver driver = new SafariDriver();
        driver.get("http://www.convoculture.ca");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("menu-item-199")).click();
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Test passed!");
    }

    public static void GoToContactPage() throws InterruptedException
    {
        WebDriver driver = new SafariDriver();
        driver.get("http://www.convoculture.ca");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("menu-item-18")).click();
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Test passed!");
    }

    public static void GoToForum() throws InterruptedException
    {
        WebDriver driver = new SafariDriver();
        driver.get("http://www.convoculture.ca");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("menu-item-220")).click();
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Test passed!");
    }
}