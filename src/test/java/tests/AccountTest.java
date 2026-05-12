package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.LoginPage;

public class AccountTest extends BaseTest {

    @Test
    public void verifyAccount() {

        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);

        loginPage.login("john", "demo");

        Assert.assertTrue(accountPage.isAccountOverviewDisplayed());
    }
}