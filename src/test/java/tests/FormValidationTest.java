package tests;

import base.BaseTest;
import pages.RegisterPage;
import org.testng.annotations.Test;

public class FormValidationTest extends BaseTest {

    @Test
    public void emptyFormTest() {
        RegisterPage rp = new RegisterPage(driver);
        rp.openRegister();
        rp.submitEmptyForm();
    }
}