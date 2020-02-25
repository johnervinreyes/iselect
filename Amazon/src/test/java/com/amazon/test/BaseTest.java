package com.amazon.test;

import com.amazon.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

    WebDriver driver = null;

    @BeforeTest
    public void setUpTest(){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath+"/driver/chromedriver/chromedriver");
        driver = new ChromeDriver();

        //maximize window
        driver.manage().window().maximize();

    }

    @Test(description = "Successful login")
    public void loginTest() throws InterruptedException {

        //go to Amazon main page
        driver.get("https://www.amazon.com/");

        //input credentials with 2FA setup
        LoginWebElements loginElements = PageFactory.initElements(driver, LoginWebElements.class);
        loginElements.loginMethod("john.ervin.reyes@gmail.com", "123456");
    }

    @Test(description = "Place order successfully")
    public void placeOrderTest() throws InterruptedException {

        HomePageWebElements addItemElements = PageFactory.initElements(driver, HomePageWebElements.class);
        addItemElements.addItem();

    }

    @Test(description = "Checkout item")
    public void checkoutItemTest() throws InterruptedException {
        //checkout
        CheckoutPageWebElements checkout = PageFactory.initElements(driver, CheckoutPageWebElements.class);
        checkout.checkoutItems();
    }

    @Test(description = "Add credit card details")
    public void addCreditCardDetailsTest() throws InterruptedException {

        //add payment method
        AddPaymentMethodWebElements paymentMethod = PageFactory.initElements(driver,AddPaymentMethodWebElements.class);
        paymentMethod.addPayentMethod();

    }

    @Test(description = "Logout")
    public void logoutTest() throws InterruptedException {

        //add payment method
        LogoutWebElements logout = PageFactory.initElements(driver,LogoutWebElements.class);
        logout.logoutMethod();

    }

    @Test(description = "Failed test due to invalid credentials")
    public void loginFailedTest() throws InterruptedException {

        //go to Amazon main page
        driver.get("https://www.amazon.com/");

        //input credentials with 2FA setup
        LoginWebElements loginElements = PageFactory.initElements(driver, LoginWebElements.class);
        loginElements.loginMethod("john.ervin.reyes@gmail.com", "123458");
    }


    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(30000);
        driver.close();
    }



}
