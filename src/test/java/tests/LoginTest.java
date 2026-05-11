package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.AccountPage;

public class LoginTest extends BaseTest {

    LoginPage loginPage;
    AccountPage accountPage;

    @BeforeMethod
    public void setupTest() {
        setUp();
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
    }

    @Test
    public void validLoginTest() {
        loginPage.login("john", "demo");

        Assert.assertTrue(accountPage.isAccountDisplayed(),
                "Login Failed!");
    }

    @AfterMethod
    public void close() {
        tearDown();
    }
}