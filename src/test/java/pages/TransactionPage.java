package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionPage extends BasePage {

    public TransactionPage(WebDriver driver) {
        super(driver);
    }

    By findTransactionsLink = By.linkText("Find Transactions");
    By amountField = By.id("criteria.amount");
    By searchBtn = By.xpath("//button[@type='submit']");
    By resultTable = By.id("transactionTable");
    By noResultMsg = By.xpath("//*[contains(text(),'No results')]");

    // navigate
    public void goToFindTransactions() {
        click(findTransactionsLink);
    }

    // REQUIRED METHOD (FIX ERROR)
    public void searchByAmount(String amount) {
        type(amountField, amount);
        click(searchBtn);
    }

    // REQUIRED METHOD (FIX ERROR)
    public boolean isTransactionDisplayed() {
        return driver.findElements(resultTable).size() > 0;
    }

    public boolean isNoResultMessageDisplayed() {
        return driver.findElements(noResultMsg).size() > 0;
    }
}