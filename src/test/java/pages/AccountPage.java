package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    WebDriver driver;
    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }
    By accountTable = By.id("accountTable");
    public boolean isAccountDisplayed() {
        return driver.findElement(accountTable).isDisplayed();
    }
}