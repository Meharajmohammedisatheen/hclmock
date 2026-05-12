package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.TransactionPage;

public class TransactionTest extends BaseTest {

    TransactionPage transactionPage;

    @BeforeMethod
    public void setup() {
        setUp();
        transactionPage = new TransactionPage(driver);
    }

    @Test
    public void searchByAmountTest() {
        transactionPage.goToFindTransactions();
        transactionPage.searchByAmount("100");

        Assert.assertTrue(transactionPage.isTransactionDisplayed(),
                "Transaction not found for amount");
    }

    @Test
    public void emptySearchTest() {
        transactionPage.goToFindTransactions();
        transactionPage.searchByAmount("");

        Assert.assertTrue(transactionPage.isNoResultMessageDisplayed(),
                "No result message not shown");
    }
}