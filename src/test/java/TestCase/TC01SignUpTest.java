package TestCase;

import Page.SignUpPage;
import Utilities.DataSet;
import Utilities.DriverSetup;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC01SignUpTest extends DriverSetup {

    SignUpPage signUpPage = new SignUpPage();

    @Test(priority = 0)
    public void testsigninbuttonisvisibleandclickable() {
        getDriver().get(signUpPage.signUpPageUrl);
        signUpPage.clickOnElement(signUpPage.signInButton);
        signUpPage.assertwithTitle("Login To Rokomari | Rokomari.com");
        signUpPage.takeScreenShot("Sign up Page");

    }

    @Test(priority = 1)
    public void signinWithGoogleAccount() {
        signUpPage.clickOnElement(signUpPage.googleButton);
        signUpPage.assertwithTitle("Sign in - Google Accounts");
        signUpPage.takeScreenShot("Enter email address ");

    }
    @Test(priority = 2, dataProvider = "email", dataProviderClass = DataSet.class)
    public void writeanemailaddress(String email) {
        getDriver().get("https://accounts.google.com/v3/signin/identifier?opparams=%253F&dsh=S-1475767749%3A1709122199086592&client_id=248662726591-ienbqf43uj9jpk754p6pfmfssl83s6n9.apps.googleusercontent.com&nonce=QQKjhOb7uYt1bT230MlK3EDSc8uU6Z-IEF8HtSEBDrs&o2v=2&redirect_uri=https%3A%2F%2Fwww.rokomari.com%2Fauth%2Flogin%2Foauth2%2Fcode%2Fgoogle&response_type=code&scope=openid+profile+email&service=lso&state=7hsWLJ6veQH6NbJAi1JNJ-rk0ur5r_Ju2MTGjdHIqZ0%3D&theme=glif&flowName=GeneralOAuthFlow&continue=https%3A%2F%2Faccounts.google.com%2Fsignin%2Foauth%2Fconsent%3Fauthuser%3Dunknown%26part%3DAJi8hAPecfkNubXxlFZjdKCRRQSZwaRcBd1Vqzt2R25uwlCMNeK-Y3vPeZvybxSesO_KTnF8qK7yCkHJrnr405o1xe2YxQtr1KXnVa3uqFxU2FmdYavevdC0Ww6HoqKHsbz_nbaTjQs7S_W1kclRJaDpa3m9S4dmELvdnUpCtZ1Nu5ZafJA1UmSLDT11Nn8ZNtecx2ivneYyAItCY-jRPQ-5rwh6LYvUutl7W5YNWCeE4chKve3PXTQisgnTEc3p1WnIfmycWKO-upyd-qUBwoNusTQuogw3m4pEGZF75b0Y1sDbsGAdNiR4820PAelbadzkDFq17Z-VBgtdPcg6luNYTs4g9wib2vhU2UvF_kjMPzSpd7vuBfGeVw-FnjnxfNDSI7iPUkrc4TdaTq3SCFKT0iSSEeG9l53ychvD3YHzR5_nnPHIK8zLxxSWOxprOqaT-_kDEaERB_EV3Yw5mhWZ7ZAmiZckww%26flowName%3DGeneralOAuthFlow%26as%3DS-1475767749%253A1709122199086592%26client_id%3D248662726591-ienbqf43uj9jpk754p6pfmfssl83s6n9.apps.googleusercontent.com%26theme%3Dglif%23&app_domain=https%3A%2F%2Fwww.rokomari.com&rart=ANgoxcdzVRNXCZyKNrnaB_r-qlhYpVGrvnkoQVEXZCbp2w-mYg4iXZcbSKkNfmGYyaeyALrBb5fHDtAJ2uSeQ7TXGWelyVnomR1rmBl5QoSJMdYAK39HLh4");
        signUpPage.writeOnElement(signUpPage.emailField, email);
        signUpPage.clickOnElement(signUpPage.emailNextBtn);
//        signUpPage.assertwithTitle("Sign in - Google Accounts");
        signUpPage.takeScreenShot("Enter password");



    }

//    @Test(priority = 3, dataProvider = "Password", dataProviderClass = DataSet.class)
//    public void writeaPassword(String Password) throws InterruptedException {
//
//        signUpPage.writeOnElement(signUpPage.passwordField, Password);
//        signUpPage.clickOnElement(signUpPage.passwordNextBtn);
//        signUpPage.assertwithTitle(" Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com ");
//        signUpPage.takeScreenShot("Home Page");
//
//
//    }
}
