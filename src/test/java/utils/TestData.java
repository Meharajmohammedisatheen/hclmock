package utils;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return new Object[][]{

                {"john", "demo"},
                {"wrong", "wrong"}
        };
    }
}