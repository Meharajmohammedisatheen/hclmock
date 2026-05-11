package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

    // Static driver variable
    public static WebDriver driver;

    // Screenshot method
    public static void capture(String name) {

        try {

            TakesScreenshot ts =
                    (TakesScreenshot) driver;

            File src =
                    ts.getScreenshotAs(OutputType.FILE);

            File dest =
                    new File(
                            "screenshots/"
                                    + name
                                    + ".png"
                    );

            FileHandler.copy(src, dest);

            System.out.println(
                    "Screenshot saved successfully"
            );

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}