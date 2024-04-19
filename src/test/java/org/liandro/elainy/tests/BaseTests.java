package org.liandro.elainy.tests;

import org.liandro.elainy.pages.PageObjectFactory;
import org.liandro.elainy.pages.objects.*;
import org.liandro.elainy.utils.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.File;

import static org.liandro.elainy.listeners.Screenshots.log;
import static org.liandro.elainy.utils.Driver.getDriver;


public class BaseTests {

    protected WebDriver driver;
    protected WebDriverWait webDriverWait;

    protected PageObjectFactory pageObjectFactory;
    protected LoginPageObject loginPageObject;
    protected ProductsPageObejct productsPageObejct;
    protected ProductDetailsPageObject productDetailsPageObject;
    protected ShoppingCartPageObject shoppingCartPageObject;
    protected CheckoutPageObject checkoutPageObject;

    @BeforeMethod
    public void goTo() {
        Driver.startDriver();
        driver = getDriver();
        webDriverWait = Driver.getWaitDriver();
        this.pageObjectFactory = new PageObjectFactory(driver);
        this.loginPageObject = pageObjectFactory.getLoginPageObject();
        this.productsPageObejct = pageObjectFactory.getProductsPageObejct();
        this.productDetailsPageObject = pageObjectFactory.getProductDetailsPageObject();
        this.shoppingCartPageObject = pageObjectFactory.getShoppingCartPageObject();
        this.checkoutPageObject = pageObjectFactory.getCheckoutPageObject();
        driver.get("https://www.saucedemo.com/");
    }

    //@AfterMethod
    public void emitLog() {
        File evidence = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        log("evidence", evidence);
    }

    @AfterMethod
    public static void tearDown() {
        Driver.stopApp();
    }

}
