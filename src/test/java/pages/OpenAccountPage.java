package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenAccountPage {

    WebDriver driver;

    public OpenAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    // example locator
    By successMsg = By.id("openAccountResult");

    // ❌ WRONG (you had getText(By))
    // public String getText(By locator)

    // ✅ CORRECT METHOD
    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public String getSuccessMessage() {
        return getText(successMsg);
    }
}