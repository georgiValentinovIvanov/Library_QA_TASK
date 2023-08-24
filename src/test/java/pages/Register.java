package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register extends Base{
    public final String REGISTER_URL = "https://qa-task.immedis.com/";
    @FindBy(linkText="Sign Up")
    WebElement SignUpBtn;
    public Register(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void signUpHeader() {
        clickElement(SignUpBtn);
    }
}
