package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Home;
import pages.Login;

import static io.netty.handler.codec.rtsp.RtspHeaders.Values.URL;

public class TestCase03 extends BaseMethod {
    @DataProvider(name = "goForgotPassword")
    public Object[][] goForgotPassword() {
        return new Object[][]{{"admin", "123456"}};
    }
    @Test(dataProvider = "goForgotPassword")

    public void ForgotPassword() {
        System.out.println("1.Open web site.");
        Home homePage = new Home(driver);
        homePage.openSite();

        System.out.println("2.Click forgot password");
        Login loginPage = new Login(driver);
        loginPage.goToForgot();

    }
}
