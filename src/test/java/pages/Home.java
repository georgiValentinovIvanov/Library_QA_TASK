package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends Base{
    @FindBy(linkText = "Books")
    WebElement booksLink;
    @FindBy(linkText = "Create New")
    WebElement CreateBook;


    public Home(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void goToBooks() {
        clickElement(booksLink);
    }
    public void goToCreate(){
        clickElement(CreateBook);
    }
    private final String URL="https://qa-task.immedis.com/";

    public void openSite(){
        driver.get(URL);
    }
    public void verifyUrl(String URL){
        verifyUrl(this.URL);
    }
}
