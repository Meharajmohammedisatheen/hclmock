package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;

public class AccountTest extends BaseTest {

    @Test
    public void verifyAccount() {

        AccountPage accountPage = new AccountPage(driver);

        boolean result = accountPage.isAccountDisplayed();

        System.out.println("Account visible: " + result);

        Assert.assertTrue(result, "Account is NOT displayed");
    }
}