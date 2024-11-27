package TestClass;


import BaseClass.BaseTest;

import PageClass.LoginPage;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogIn extends BaseTest {
    private LoginPage loginPage;

    @BeforeClass
    public void SetUpTests() {
        super.Setup();
        loginPage = new LoginPage(driver);
    }
    @BeforeMethod
    public void ResetPage() {
        driver.navigate().to(Url);
    }
    @AfterClass
    public void BrowserClose(){
        driver.quit();
    }

    @Test
    public void LogIn(){
        loginPage.EnterUserName("standard_user");
        loginPage.EnterPassword("secret_sauce");
        loginPage.ClickLogInButton();
        loginPage.ClickOpenMenu();
        loginPage.ClickLogoutButton();

    }
    @Test
    public void AddingProductToCart(){
        loginPage.EnterUserName("standard_user");
        loginPage.EnterPassword("secret_sauce");
        loginPage.ClickLogInButton();
        loginPage.ClickAddToCart();
        loginPage.ClickOnCartButton();
        loginPage.ClickOnCheckoutButton();
        loginPage.EnteringFirstname("Prasanna");
        loginPage.EnteringLastname("Panda");
        loginPage.EnteringZipCode("753001");
        loginPage.ClickingContinueButton();
//        loginPage.ClickingFinishButton();
        if(!loginPage.ValidateOrderStatus())
            Assert.fail("Order is incomplete");


    }


}
