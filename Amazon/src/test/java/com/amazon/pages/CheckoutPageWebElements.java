package com.amazon.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutPageWebElements {

    WebDriver driver = null;
    @FindBy(how = How.ID,using = "nav-cart") WebElement navCartBtn;
    @FindBy(how = How.NAME,using = "proceedToRetailCheckout") WebElement proceedToCheckoutBtn;
    @FindBy(how = How.ID,using = "ap_password") WebElement passWord;
    @FindBy(how = How.CLASS_NAME,using = "a-declarative a-button-text") WebElement deliverToAddressBtn;
    @FindBy(how = How.CLASS_NAME,using = "a-button-text") WebElement continueBtn;

    public CheckoutPageWebElements(WebDriver driver){
        this.driver=driver;
    }

    public void checkoutItems(){
        navCartBtn.click();
        proceedToCheckoutBtn.click();
        passWord.sendKeys("123456");
        passWord.sendKeys(Keys.RETURN);
        deliverToAddressBtn.click();
        continueBtn.click();
    }
}
