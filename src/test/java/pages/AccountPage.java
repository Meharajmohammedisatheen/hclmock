package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage {

    WebDriver driver;
    WebDriverWait wait;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By accountOverview = By.linkText("Accounts Overview");

    public boolean isAccountDisplayed() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(accountOverview));
            return driver.findElement(accountOverview).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}