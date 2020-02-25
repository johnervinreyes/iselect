package com.amazon.pages;

import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageWebElements {

    WebDriver driver = null;

    @FindBy(how = How.LINK_TEXT,using = "Today\'s Deals") WebElement todaysDealsLink;
    @FindBy(how = How.ID,using = "twotabsearchtextbox") WebElement searchItem;
    @FindBy(how = How.CLASS_NAME,using = "a-size-medium a-color-base a-text-normal") WebElement firstItem;
    @FindBy(how = How.ID,using = "add-to-cart-button") WebElement addToCartBtn;
    @FindBy(how = How.ID,using = "attach-close_sideSheet-link") WebElement closeSideSheetBtn;
    public HomePageWebElements(WebDriver driver){
        this.driver=driver;
    }

    public void addItem() throws InterruptedException {
        todaysDealsLink.click();
        driver.findElement(By.cssSelector("#\\31 00_dealView_0 #dealImage .a-row:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".a-list-normal:nth-child(1) .a-truncate-cut")).click();
        addToCartBtn.click();
        Thread.sleep(30000);
        if (closeSideSheetBtn.isDisplayed())
            closeSideSheetBtn.click();
    }
}
