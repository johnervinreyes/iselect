package com.amazon.pages;

import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogoutWebElements {

    WebDriver driver = null;

    @FindBy(how = How.CSS,using = "#nav-link-accountList > .nav-line-2") WebElement signInStart;
    @FindBy(how = How.CSS,using = "#nav-item-signout > .nav-text") WebElement signOutLink;

    public LogoutWebElements(WebDriver driver){
        this.driver=driver;
    }

    public void logoutMethod(){
        signInStart.click();
        signOutLink.click();
    }
}
