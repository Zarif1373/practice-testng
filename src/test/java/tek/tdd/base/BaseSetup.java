package tek.tdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseSetup {
    //Encapsulate Driver
    private static WebDriver driver;

    private final static String APP_URL = "https://qa.insurance.tekschool-students.com";
    public void openBrowser() {
        //Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get(APP_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    public void closeBrowser() {
        if (driver != null)
            driver.quit();

    }

    public WebDriver getDriver() {
        return driver;
    }
}