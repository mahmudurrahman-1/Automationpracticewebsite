package testCase;

import baseDriver.MainDriver;
import dataObject.Dataset;
import org.testng.annotations.Test;
import pageObject.*;
import utilities.ScreenShots;

/*************
 * This TestCase0002 belongs to Sign in using data from datasets and adding dress and payment
 * ************/
/*************
 * This Class inherits maindriver
 * ************/
public class TestCase0002 extends MainDriver {
    @Test(description = "Sign in into account and take necessary actions",dataProvider = "signingdata",dataProviderClass = Dataset.class)
    public void SignIn(String email,String password){
        /*************
         * This part belongs to All the instance of classes
         * ************/
        //all the instances
        HomePage homePage=new HomePage();
        SignInPage login =new SignInPage();
        SignoutPage profile = new SignoutPage();
        CartPage cart=new CartPage();
        Payment payment = new Payment();
        //all the actions

        //login in page
        homePage.clickSigninButton();

        login.waitForPageLoad();
        //log in with email and password
        login.SigningIn(email,password);
        //Waiting to Sign out
        profile.waitForPageLoad();
        //Taking screenshot of the profile
        ScreenShots.screenshotForAllure("Login Profile");
        //Click Casual dress button
        homePage.ClickCasualbutton();
        //waiting for dress page
        cart.waitForPageLoad();
        //Adding dress to cart
        cart.addingToCart();
        //Continue shopping
        cart.Cshopping();
        //Tshirt section
        homePage.ClickTshirtbutton();
        cart.waitForPageLoad();
        //filter dress by blue
        cart.FilteringBlue();
        /*************
         * This part belongs to payment
         * ************/
        payment.proceedClick();
        payment.Cproceed();
        cart.waitForPageLoad();
        cart.Pshopping();




    }
}
