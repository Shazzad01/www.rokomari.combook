package TestCase;

import Page.CartPage;
import Utilities.DriverSetup;
import org.testng.annotations.Test;

public class TC03TestCartPage extends DriverSetup {
    CartPage cartPage = new CartPage();
    @Test
    public void cartAndPlaceOrder(){
        cartPage.clickOnElement(cartPage.cartIcon);
        cartPage.takeScreenShot("After clicking cart icon button");
        cartPage.scroll(cartPage.placeOrderBtn);
        cartPage.clickOnElement(cartPage.placeOrderBtn);
        cartPage.takeScreenShot("After clicking cart Place order button");
        cartPage.scroll(cartPage.nameField);
        cartPage.writeOnElement(cartPage.nameField, cartPage.fullNameGenerate());
        cartPage.takeScreenShot("After write fullname");
        cartPage.scroll(cartPage.phoneField);
        cartPage.writeOnElement(cartPage.phoneField, cartPage.phoneNumberGenerate());
        cartPage.scroll(cartPage.alterPhoneField);
        cartPage.takeScreenShot("After write phone and alternative phone field");
        cartPage.writeOnElement(cartPage.alterPhoneField, cartPage.phoneNumberGenerate());
        cartPage.scroll(cartPage.selectCountry);
        cartPage.selectItemByIndex(cartPage.selectCountry,0);
        cartPage.scroll(cartPage.selectCity);
        cartPage.selectItemByIndex(cartPage.selectCity,1);
        cartPage.scroll(cartPage.selectArea);
        cartPage.selectItemByIndex(cartPage.selectArea,1);
        cartPage.takeScreenShot("After select country, city and area");
        cartPage.scroll(cartPage.writeAddress);
        cartPage.writeOnElement(cartPage.writeAddress, cartPage.fullAddress());
        cartPage.takeScreenShot("After write full address");
        cartPage.scroll(cartPage.codBtn);
        cartPage.clickOnElement(cartPage.codBtn);
        cartPage.takeScreenShot("After write cash on delivery");
        cartPage.scroll(cartPage.checkBox);
        cartPage.clickOnElement(cartPage.checkBox);
        cartPage.takeScreenShot("After select condition");
        cartPage.scroll(cartPage.dropDown);
        cartPage.clickOnElement(cartPage.dropDown);
        cartPage.takeScreenShot("After click dropdown");
        cartPage.clickOnElement(cartPage.signOut);


    }


}
