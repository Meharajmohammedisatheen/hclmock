package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    By overviewTitle = By.xpath("//h1[text()='Accounts Overview']");

    public boolean isAccountOverviewDisplayed() {
        return waitForElement(overviewTitle).isDisplayed();
    }
}