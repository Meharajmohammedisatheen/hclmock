package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferPage {

    WebDriver driver;
    WebDriverWait wait;

    public TransferPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void transfer(String amountValue) {

        WebElement amount = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("amount"))
        );
        amount.clear();
        amount.sendKeys(amountValue);

        WebElement transferBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Transfer']"))
        );
        transferBtn.click();
    }
}