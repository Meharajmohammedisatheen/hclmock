package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage login = new LoginPage(driver);

        login.login("john", "demo");

        Assert.assertTrue(driver.getTitle().contains("ParaBank"));
    }
}