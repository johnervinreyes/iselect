package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddPaymentMethodWebElements {

    WebDriver driver = null;
    @FindBy(how = How.NAME,using = "ppw-accountHolderName") WebElement nameOnCardText;
    @FindBy(how = How.NAME,using = "addCreditCardNumber") WebElement creditCardNumberText;
    @FindBy(how = How.CSS,using = "#pp-YAUKFK-70 .a-button-text") WebElement monthDropdown;
    @FindBy(how = How.LINK_TEXT,using = "05") WebElement cardExpiryMonth;
    @FindBy(how = How.CSS,using = "#pp-YAUKFK-71 .a-button-text") WebElement yearDropDown;
    @FindBy(how = How.LINK_TEXT,using = "2025") WebElement cardExpiryYear;
    @FindBy(how = How.NAME,using = "ppw-widgetEvent:AddCreditCardEvent") WebElement addYourCardBtn;

    public AddPaymentMethodWebElements(WebDriver driver){
        this.driver=driver;
    }

    public void addPayentMethod(){
        nameOnCardText.sendKeys("Ervin Reyes");
        creditCardNumberText.sendKeys("12345678");
        monthDropdown.click();
        cardExpiryMonth.click();
        yearDropDown.click();
        cardExpiryYear.click();
        addYourCardBtn.click();
    }
}
