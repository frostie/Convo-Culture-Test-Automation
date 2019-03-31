package com.ConvoCulture;

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