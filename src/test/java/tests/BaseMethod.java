package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class BaseMethod {
    protected WebDriver driver;

    @BeforeMethod
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
        public void clearUsernameFieldd() {

            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chrome.exe");


            driver = new ChromeDriver();


            driver.get("https://www.example.com");


            WebElement inputField = driver.findElement(By.name("username"));


            inputField.clear();
            inputField.sendKeys("admin");


            driver.quit();
        }


    @AfterMethod
    public void cleanup() {
        driver.quit();

    }
}
