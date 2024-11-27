package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public static WebDriver driver;
    public String Url = "https://www.saucedemo.com/v1/";
    public String UserName = "standard_user";
    public String Password = "secret_sauce";


    public void Setup() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(Url);
    }
}
