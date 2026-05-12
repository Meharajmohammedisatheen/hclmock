package tests;

import base.BaseTest;
import pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void emptyRegistrationTest() {
        RegisterPage rp = new RegisterPage(driver);
        rp.openRegister();
        rp.submitEmptyForm();
    }
}