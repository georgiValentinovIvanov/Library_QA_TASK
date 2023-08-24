package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Home;
import pages.Login;

public class TestCase02 extends BaseMethod{
    @DataProvider(name = "goRegistration")
    public Object[][] goRegistration() {
        return new Object[][]{{"admin", "123456"}};
    }
    @Test(dataProvider = "goRegistration")
    public void userРegistration(String username, String password) {
        System.out.println("1. Open web site.");
        Home homePage = new Home(driver);
        homePage.openSite();

        System.out.println("2.Go to Register Btn.");
        Login loginPage = new Login(driver);
        loginPage.RegisterBtn();
    }
}
