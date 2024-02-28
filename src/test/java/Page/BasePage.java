package Page;

import Utilities.DriverSetup;
import com.github.javafaker.Faker;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import java.io.ByteArrayInputStream;
import java.util.Locale;

public class BasePage extends DriverSetup {
    public WebElement getElement(By locator) {
        return getDriver().findElement(locator);

    }

    public void clickOnElement(By locator) {
        getElement(locator).click();

    }

    public void writeOnElement(By locator, String text) {
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    public void hover(By locator) {
        Actions actions = new Actions(getDriver());
        actions.clickAndHold(getElement(locator)).build().perform();


    }

    public void scroll(By locator) {
        Actions actions = new Actions(getDriver());
        actions.scrollToElement(getElement(locator)).build().perform();

    }
      public void selectItemByIndex(By locator, int index) {
        WebElement element = getDriver().findElement(locator);
        Select selectItems = new Select(element);
        selectItems.selectByIndex(index);
    }
    static Faker faker = new Faker(new Locale("en-US"));

    public String fullNameGenerate() {
        return faker.name().fullName();
    }

    public String phoneNumberGenerate() {
        return faker.numerify("+880##########");
    }

    public String fullAddress() {
        return faker.address().fullAddress();
    }


    public void takeScreenShot(String name) {
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot) (getDriver())).getScreenshotAs(OutputType.BYTES)));
    }



}
