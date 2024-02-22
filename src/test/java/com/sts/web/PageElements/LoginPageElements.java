package com.sts.web.PageElements;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import WebApp.FluentClass;
import WebApp.XPathHelper;


public class LoginPageElements {

    private WebDriver driver;
    private XPathHelper xPathHelper;

    // Constructor
    public LoginPageElements(WebDriver driver) throws IOException, InterruptedException {
        this.driver = driver;
        this.xPathHelper = new XPathHelper(driver);
    }

    protected FluentClass getUserNameElement() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByname("email"), driver, "Username Textbox");
    }

    protected FluentClass getPasswordElement() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByname("password"), driver, "Password Textbox");
    }

    protected FluentClass getNextButtonElement() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByXPath("//button[@type='submit']"), driver, "Next Button");
    }
    
    
    protected FluentClass getLoginElement() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByXPath("//button[@type='submit']"), driver, "Login Button");
    }
}
