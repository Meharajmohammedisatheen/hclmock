package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TransferPage;

public class TransferTest extends BaseTest {

    LoginPage loginPage;
    TransferPage transferPage;

    @BeforeMethod
    public void setupTest() {
        setUp();

        loginPage = new LoginPage(driver);
        transferPage = new TransferPage(driver);

        loginPage.login("john", "demo");
    }

    @Test
    public void validTransferTest() {

        transferPage.transfer("100", "12345", "67890");

        Assert.assertTrue(
                driver.getPageSource().contains("Transfer Complete"),
                "Transfer failed"
        );
    }
}