package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionPage extends BasePage {

    WebDriver driver;

    public TransactionPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // Locators
    By findTransactionsLink = By.linkText("Find Transactions");
    By amountField = By.id("amount");
    By searchButton = By.xpath("//button[@type='submit']");

    // Navigate
    public void navigateToFindTransactions() {
        click(findTransactionsLink);
    }

    // Search by amount
    public void searchByAmount(String amount) {

        // IMPORTANT: wait after navigation
        navigateToFindTransactions();

        waitForVisible(amountField);
        type(amountField, amount);

        click(searchButton);

    }
}