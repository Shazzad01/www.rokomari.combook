package Page;

import org.openqa.selenium.By;

public class CartPage extends BasePage {
    public By cartIcon = By.xpath("//a[@id='js-cart-menu']");
    public By placeOrderBtn = By.xpath("//a[@id='js-continue-to-shipping']");
    public By nameField = By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
    public By phoneField = By.xpath("//fieldset[@class='group']//input[@id='phone']");
    public By alterPhoneField = By.xpath("//fieldset[@class='group']//input[@id='phone2']");

    public By selectCountry =By.xpath("//select[@id='js--country']");

    public By selectCity = By.xpath("//select[@id='js--city']");

    public By selectArea = By.xpath("//select[@id='js--area']");

    public By writeAddress = By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");

    public By codBtn = By.xpath("//label[@for='COD']");
    public By checkBox = By.xpath("//label[contains(text(),'এই শর্তগুলো মেনে অর্ডার প্রদান করছি।')]");

    public By dropDown = By.cssSelector("#dropdownMenu2");

    public By signOut = By.xpath("//a[normalize-space()='Sign Out']");

}
