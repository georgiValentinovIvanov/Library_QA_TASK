package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Home;
import pages.Login;
import pages.newBook;

import static io.netty.handler.codec.rtsp.RtspHeaders.Values.URL;


public class TestCase04 extends BaseMethod {
    @DataProvider(name = "addBook")
    public Object[][] addBook() {
        return new Object[][]{{"admin", "123456", "Harry Potter", "Georgi Ivanov", "Adventurous", "22"}};
    }
    @Test(dataProvider = "addBook")
    public void AddNewBook(String username, String password , String Name , String Author , String Genre , String Quontity){
        System.out.println("1. Open WebSite to Library.");
        Home homePage = new Home(driver);
        homePage.openSite();

        System.out.println("2. Login.");
        Login loginPage = new Login(driver);
        loginPage.goToUserName();
        Login login = new Login(driver);
        Login loginPage1 = new Login(driver);
        loginPage1.clearUsernameField();

        System.out.println("3.Go to Books Page and create new book");
        Home homePage1 = new Home(driver);
        homePage1.goToBooks();
        Home homePage2 = new Home(driver);
        homePage2.goToCreate();

        System.out.println("4.We fill in the blanks to add the book's data to the library system.");
        newBook newBookPage=new newBook(driver);
        newBookPage.goToName();
        newBook newBook=new newBook(driver);
        newBook.goToAuthor();
        newBook newBook1=new newBook(driver);
        newBook1.goToGenre();
        newBook newBook2=new newBook(driver);
        newBook2.goToQuontity("22");

        System.out.println("5. Click create book Btn");
        newBook newBook3=new newBook(driver);
        newBook3.goToCreate();
    }
}
