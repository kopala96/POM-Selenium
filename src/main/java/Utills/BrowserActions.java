package Utills;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserActions {
    @Attachment(value = "Screenshot",type = "image/png")
    public <takeScreenShot> byte [] takeScreenShot(){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    public static WebDriver driver = new ChromeDriver();

    @BeforeMethod(description = "ბრაუზერის გახსნა")
    public void openBrowser (){
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");

    }

    @AfterMethod (description = "ბრაუზერის დახურვა")
    public void closeBrowser (){
        takeScreenShot();
        driver.close();

    }
}
