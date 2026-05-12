package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TransferPage;

public class TransferTest extends BaseTest {

    @Test
    public void validTransferTest() {

        LoginPage loginPage = new LoginPage(driver);
        TransferPage transferPage = new TransferPage(driver);

        loginPage.login("john", "demo");

        transferPage.transfer("100");

        Assert.assertTrue(transferPage.isTransferSuccessful());
    }
}