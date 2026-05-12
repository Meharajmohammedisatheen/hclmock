package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferPage extends BasePage {

    public TransferPage(WebDriver driver) {
        super(driver);
    }

    By transferLink = By.linkText("Transfer Funds");
    By amount = By.id("amount");
    By transferBtn = By.xpath("//input[@value='Transfer']");
    By successMsg = By.xpath("//*[contains(text(),'Transfer Complete')]");

    public void transfer(String amt) {
        click(transferLink);
        type(amount, amt);
        click(transferBtn);
    }

    // REQUIRED METHOD (FIX ERROR)
    public boolean isTransferSuccessful() {
        return driver.findElements(successMsg).size() > 0;
    }
}