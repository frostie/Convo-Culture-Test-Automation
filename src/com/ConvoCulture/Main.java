package com.ConvoCulture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Main
{

    public static void main(String[] args) throws InterruptedException

    {

    // ***HOME PAGE TEST***

        HomePage.GoToHomePage();

    // ***CONTACT PAGE TESTS***

        ContactForm.GoToContactPage();

        ContactForm.SubmitEnquiry();

    // ***FORUM PAGE TESTS***

        Forum.GoToForumPage();

        Forum.LoginForum();

        Forum.CreateForumPost();

    }

}