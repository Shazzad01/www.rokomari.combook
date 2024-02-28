package TestCase;

import Page.FilterCategories;
import Utilities.DriverSetup;
import org.testng.annotations.Test;

public class TC02FilterCategories extends DriverSetup {
    FilterCategories filterCategories = new FilterCategories();

    @Test
    public void doFilterandNextpageCategories() throws InterruptedException {
        filterCategories.scroll(filterCategories.Categorie02);
        filterCategories.clickOnElement(filterCategories.Categorie01);
        filterCategories.scroll(filterCategories.Categorie02);
        filterCategories.clickOnElement(filterCategories.Categorie02);
        filterCategories.takeScreenShot("After Filter  Categories");
        filterCategories.scroll(filterCategories.Previous);
        filterCategories.clickOnElement(filterCategories.nextBtn);
        filterCategories.takeScreenShot("After click next Page");
        filterCategories.scroll(filterCategories.bookName);
        filterCategories.hover(filterCategories.bookName);
        filterCategories.clickOnElement(filterCategories.bookToCart);
        filterCategories.takeScreenShot("After adding the book to the cart");
            }

    }



