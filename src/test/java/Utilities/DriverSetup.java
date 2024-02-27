package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class DriverSetup {

    private static String browserName = System.getProperty("browser", "chrome");
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
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        setDriver(driver);


    }

    public static synchronized void quitBrowser(){
        getDriver().quit();
    }

}



