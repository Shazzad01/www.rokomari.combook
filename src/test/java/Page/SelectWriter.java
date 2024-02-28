package Page;

import org.openqa.selenium.By;

public class SelectWriter extends BasePage {
    public String selectWriterPageUrl = "https://www.rokomari.com/book";
    public By  writer = By.xpath("//a[@id='js--authors']");
    public By writerName = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");


    }



