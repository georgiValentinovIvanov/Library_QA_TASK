package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newBook extends Base{
    private final String URL = "https://qa-task.immedis.com/";
    @FindBy(name = "Name")
    WebElement NameField;
    @FindBy(name = "Author")
    WebElement AuthorField;
    @FindBy(name = "Genre")
    WebElement GenreField;
    @FindBy(id = "Quontity")
    WebElement QuontityField;
    @FindBy(css = ".btn.btn-default")
    WebElement createBtn;
    public newBook(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void verifyUrl(String URL) {
        verifyUrl(this.URL);
    }
    public void goToName(){
        clickElement(NameField);
    }
    public void goToAuthor(){
        clickElement(AuthorField);
    }
    public void goToGenre(){
        clickElement(GenreField);
    }
    public void goToQuontity(String text){
        enterText(QuontityField, text);
    }

    private void enterText(WebElement QuontityField, String text) {
    }

    public void goToCreate(){
        clickElement(createBtn);
    }
}
