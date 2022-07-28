package testCase;

import org.testng.annotations.Test;

import baseDriver.MainDriver;
import dataObject.Dataset;

import pageObject.CreateAccounts;
import pageObject.HomePage;
import pageObject.SignInPage;
import pageObject.SignoutPage;
import utilities.ScreenShots;

/*************
 * This TestCase0001 belongs to registation using data from datasets and create profile
 * ************/
/*************
 * This Class inherits maindriver
 * ************/
public class TestCase0001 extends MainDriver {
    @Test(description = "Perform registration process for new users and Sign Out", dataProvider = "registrationdata", dataProviderClass = Dataset.class)
    public void registration(String email, String firstName, String lastName, String Password, String day, String month, String year,
                             String AfirstName, String AlastName, String Company, String AddOne, String AddTwo, String City, String State, String Zip, String Icountry, String Others,
                             String pNum, String mpNum, String Alias)  {
        /*************
         * This part belongs to All the instance of classes
         * ************/
        HomePage homepage = new HomePage();
        SignInPage signinpage = new SignInPage();
        CreateAccounts register = new CreateAccounts();
        SignoutPage profile = new SignoutPage();
        // Sign in page
        homepage.clickSigninButton();
        //wait for loading sign in page fully
        signinpage.waitForPageLoad();
        //Enter email to navigate registration
        signinpage.EnterEmailtoRegister(email);
        register.waitForPageLoad();
        //Registration for Personal information
        register.RegistrationPartOne(firstName, lastName, Password, day, month, year);
        //Registration for Contact information
        register.RegistrationPartTwo(AfirstName, AlastName, Company, AddOne, AddTwo, City, State, Zip, Icountry, Others, pNum, mpNum, Alias);
        //Click submit
        register.SubmitClick();
        //wait for profile page loading
        profile.waitForPageLoad();

        //Take screenshot for profile
        ScreenShots.screenshotForAllure("Account is created");
        //Signout from account
        profile.signoutbutton();


    }
}
