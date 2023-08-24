package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Home;
import pages.Login;


public class TestCase01 extends BaseMethod {
    @DataProvider(name = "getLogin")
    public Object[][] getLogin() {
        return new Object[][]{{"admin", "123456"}};
    }

    @Test(dataProvider = "getLogin")
    public void loginTest(String userName, String pass) {
        System.out.println("1. Open Web Site to Library");
        Home homePage = new Home(driver);
        homePage.openSite();

        System.out.println("2. Click to Username Field");
        Login loginPage = new Login(driver);
        loginPage.goToUserName();
        Login loginPage1 = new Login(driver);
        loginPage1.clearUsernameField();

        System.out.println("3. Enter user name");
        loginPage.usernameText(userName);

        System.out.println("4. Enter pass");
        loginPage.passwortText(pass);

        System.out.println("5. Click sign in btn");
        loginPage.signIn();
    }
}
