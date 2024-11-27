package PageClass;

import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    final By UserNameField = By.xpath("//div[@class='login-box']/descendant::input[@id='user-name']");
    final By PasswordField = By.xpath("//div[@class='login-box']/descendant::input[@id='password']");
    final By LogInButton = By.xpath("//div[@class='login-box']/descendant::input[@id='login-button']");
    final By OpenMenu = By.xpath("//button[contains(text(),'Open Menu')]");
    final By LogOutButton = By.xpath("//a[@id='logout_sidebar_link']");
    final By AddToCartButton = By.xpath("(//button[@class='btn_primary btn_inventory'])[1]");
    final By CartButton = By.xpath("//div[contains(@class,'shopping_cart_container')]");
    final By CheckOutButton = By.xpath("//a[contains(@class,'btn_action checkout_button')]");
    final By FirstNameField = By.xpath("(//div[contains(@class,'checkout_info')]/child::input)[1]");
    final By LastNameField = By.xpath("(//div[contains(@class,'checkout_info')]/child::input)[2]");
    final By ZipCodeField = By.xpath("(//div[contains(@class,'checkout_info')]/child::input)[3]");
    final By ContinueButton = By.xpath("//div[@class='checkout_buttons']/input");
    final By CancelButton = By.xpath("//div[@class='checkout_buttons']/a");
    final By FinishButton = By.xpath("//div[@class='cart_footer']/child::a[@class='btn_action cart_button']");
    final By SuccessfulOrder = By.xpath("//div[@id='checkout_complete_container']/h2[contains(text(),'THANK')]");



        @Epic("Enter the user name")
        public void EnterUserName(String username) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(UserNameField));
            driver.findElement(UserNameField).sendKeys(username);
        }
        @Epic("Enter the Password")
        public void EnterPassword(String password) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordField));
            driver.findElement(PasswordField).sendKeys(password);
        }
        @Epic("Enter the Password")
        public void ClickLogInButton() {
            wait.until(ExpectedConditions.visibilityOfElementLocated(LogInButton));
            driver.findElement(LogInButton).click();
        }
        @Epic("Open the side menu")
        public void ClickOpenMenu() {
            wait.until(ExpectedConditions.presenceOfElementLocated(OpenMenu));
            driver.findElement(OpenMenu).click();
        }
        @Epic("Click Log out")
        public void ClickLogoutButton() {
            wait.until(ExpectedConditions.elementToBeClickable(LogOutButton));
            driver.findElement(LogOutButton).click();
        }
        @Epic("add product to cart")
        public void ClickAddToCart() {
            wait.until(ExpectedConditions.presenceOfElementLocated(AddToCartButton));
            driver.findElement(AddToCartButton).click();
        }
        @Epic("click on cart button")
        public void ClickOnCartButton() {
            wait.until(ExpectedConditions.presenceOfElementLocated(CartButton));
            driver.findElement(CartButton).click();
        }
        @Epic("click on checkout button")
        public void ClickOnCheckoutButton() {
            wait.until(ExpectedConditions.presenceOfElementLocated(CheckOutButton));
            driver.findElement(CheckOutButton).click();
        }
        @Epic("Entering desiredFirst Name")
        public void EnteringFirstname(String FirstName) {
            wait.until(ExpectedConditions.presenceOfElementLocated(FirstNameField));
            driver.findElement(FirstNameField).sendKeys(FirstName);
        }
        @Epic("Entering desired Last Name")
        public void EnteringLastname(String Lastname) {
            wait.until(ExpectedConditions.presenceOfElementLocated(LastNameField));
            driver.findElement(LastNameField).sendKeys(Lastname);
        }
        @Epic("Entering desired ZIP Code")
        public void EnteringZipCode(String ZipCode) {
            wait.until(ExpectedConditions.presenceOfElementLocated(ZipCodeField));
            driver.findElement(ZipCodeField).sendKeys(ZipCode);
        }
        @Epic("Click continue Button")
        public void ClickingContinueButton() {
            wait.until(ExpectedConditions.presenceOfElementLocated(ContinueButton));
            driver.findElement(ContinueButton).click();
        }
        @Epic("Click Finish Button")
        public void ClickingFinishButton() {
            wait.until(ExpectedConditions.presenceOfElementLocated(FinishButton));
            driver.findElement(FinishButton).click();
        }
        @Epic("Validate order status")
        public boolean ValidateOrderStatus() {
            wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessfulOrder));
            return driver.findElement(SuccessfulOrder).isDisplayed();

        }


    }

