package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
;
import java.time.Duration;


public class Login extends Base {
    WebDriverWait wait;
    @FindBy(name = "username")
    WebElement userName;
    @FindBy(name = "password")
    WebElement pass;
    @FindBy(linkText = "Sign In")
    WebElement signInBtn;
    @FindBy(linkText = "Sign Up")
    WebElement registerBtn;
    @FindBy(linkText = "Here!")
    WebElement forgot;

    public Login(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clearUsernameField() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chrome.exe");
        WebDriver driver = new ChromeDriver() {
        };
        driver.get("https://qa-task.immedis.com/");
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.clear();
    }


    public void goToUserName() {
        clickElement(userName);
    }

    public void goToPassword() {
        clickElement(pass);
    }

    public void usernameText(String username) {
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys(username);
        ;
    }

    public void passwortText(String password) {
        enterText(pass, password);

    }

    private void enterText(WebElement pass, String password) {
    }

    public void goToForgot() {
        clickElement(forgot);
    }

    public void signIn() {
        clickElement(signInBtn);
    }

    public void RegisterBtn() {
        clickElement(registerBtn);
    }

    public void login(String username, String password) {
    }
}