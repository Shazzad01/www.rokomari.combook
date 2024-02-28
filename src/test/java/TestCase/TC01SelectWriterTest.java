package TestCase;


import Page.SelectWriter;
import Utilities.DriverSetup;
import org.testng.annotations.Test;


public class TC01SelectWriterTest extends DriverSetup {
    SelectWriter selectWriter = new SelectWriter();
    @Test

    public void clickWriterName() throws InterruptedException {
        getDriver().get(selectWriter.selectWriterPageUrl);
        selectWriter.hover(selectWriter.writer);
        selectWriter.clickOnElement(selectWriter.writerName);
        selectWriter.takeScreenShot("After select Writer: হুমায়ুন আহমেদ");

    }

}
