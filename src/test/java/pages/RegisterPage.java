package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    By registerLink = By.linkText("Register");
    By firstName = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By address = By.id("customer.address.street");
    By city = By.id("customer.address.city");
    By state = By.id("customer.address.state");
    By zip = By.id("customer.address.zipCode");
    By phone = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By username = By.id("customer.username");
    By password = By.id("customer.password");
    By confirm = By.id("repeatedPassword");
    By registerBtn = By.xpath("//input[@value='Register']");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void openRegister() {
        click(registerLink);
    }

    public void register(String fn, String ln, String user, String pass) {
        type(firstName, fn);
        type(lastName, ln);
        type(address, "test");
        type(city, "test");
        type(state, "TN");
        type(zip, "600000");
        type(phone, "1234567890");
        type(ssn, "1234");
        type(username, user);
        type(password, pass);
        type(confirm, pass);
        click(registerBtn);
    }

    public void submitEmptyForm() {
        click(registerBtn);
    }
}