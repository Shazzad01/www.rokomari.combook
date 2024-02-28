package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class DriverSetup {

    private static String browserName = System.getProperty("browser", "edge");
    private static final ThreadLocal<WebDriver> LOCAL_Driver = new ThreadLocal<>();

    public static void setDriver(WebDriver driver) {
        DriverSetup.LOCAL_Driver.set(driver);

    }

    public static WebDriver getDriver() {
        return LOCAL_Driver.get();
    }

    public static WebDriver getBrowser(String browserName) {
        switch (browserName.toLowerCase()) {
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            case "edge":
                return new EdgeDriver();
            default:
                throw new RuntimeException("Browser not found! using the given browser name: " + browserName);

        }

    }
    @BeforeSuite

    public static synchronized void setBrowser () {
        WebDriver driver = getBrowser(browserName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        setDriver(driver);
    }
@AfterSuite
    public static synchronized void quitBrowser() throws InterruptedException {
        Thread.sleep(5000);
        getDriver().quit();
    }

}



