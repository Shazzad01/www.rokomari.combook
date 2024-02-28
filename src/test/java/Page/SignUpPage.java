package Page;

import org.openqa.selenium.By;

public class SignUpPage extends BasePage {
    public String signUpPageUrl = "https://www.rokomari.com/";
    public By signInButton = By.partialLinkText("Sign");
    public By googleButton = By.xpath("(//button[@class=\"btn btn-social-google\"])");
    public By emailField = By.id("identifierId");
    public By emailNextBtn = By.xpath("(//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b\"])");
    public By passwordField = By.xpath("(//input[@type=\"password\"])");
    public By passwordNextBtn = By.xpath("(//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b\"])");

    public String getLoginButtonText() {
        return getElementText(signInButton);

    }

}
