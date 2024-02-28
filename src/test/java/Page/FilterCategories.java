package Page;

import org.openqa.selenium.By;

public class FilterCategories extends BasePage {
    public By Categorie01 = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
    public By Categorie02 = By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]");

    public By Previous = By.xpath("//span[contains(text(),'Previous')]");

    public By nextBtn = By.xpath("//a[contains(text(),'Next')]");
    public By bookName = By.xpath("//h4[contains(text(),'হিমু মিসির আলি যুগলবন্দি')]");
    public By bookToCart = By.xpath("//body[1]/div[7]/div[1]/div[1]/div[1]/section[3]/div[2]/div[1]/div[6]/div[1]/a[1]/div[1]/div[3]/button[1]");


}
