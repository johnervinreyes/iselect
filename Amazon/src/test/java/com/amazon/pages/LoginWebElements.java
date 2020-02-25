package com.amazon.pages;

import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginWebElements {

    WebDriver driver = null;

    @FindBy(how = How.CSS,using = "#nav-link-accountList > .nav-line-2") WebElement signInStart;
    @FindBy(how = How.ID,using = "ap_email") WebElement userName;
    @FindBy(how = How.ID,using = "continue") WebElement continueBtn;
    @FindBy(how = How.ID,using = "ap_password") WebElement passWord;
    @FindBy(how = How.ID,using = "signInSubmit") WebElement signInSubmitBtn;

    public LoginWebElements(WebDriver driver){
        this.driver=driver;
    }

    public void loginMethod(String uid, String upwd){
        signInStart.click();
        userName.sendKeys(uid);
        continueBtn.click();
        passWord.sendKeys(upwd);
        signInSubmitBtn.click();
        if (driver.findElement(By.id("auth-mfa-otpcode")).isDisplayed()){
            String otpKeyStr = "CZBNLUCJNXIC5XU7F3JOCLUNBKXNMG3HRFNVCGGJUTUNTMZERBGQ"; // <- this 2FA secret key.
            Totp totp = new Totp(otpKeyStr);
            String twoFactorCode = totp.now(); // <- got 2FA coed at this time!
            System.out.println(twoFactorCode);
            driver.findElement(By.id("auth-mfa-otpcode")).sendKeys(twoFactorCode);
            driver.findElement(By.id("auth-signin-button")).click();
        }

    }
}
