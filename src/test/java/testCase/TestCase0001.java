package testCase;

import org.testng.annotations.Test;

import baseDriver.MainDriver;
import dataObject.Dataset;

import pageObject.CreateAccounts;
import pageObject.HomePage;
import pageObject.SignInPage;

public class TestCase0001 extends MainDriver {
	@Test(description = "Perform registration process for new users and Sign Out", dataProvider = "registrationdata", dataProviderClass = Dataset.class)
	public void registration(String email,String firstName, String lastName, String Password, String day, String month, String year,
			String AfirstName, String AlastName, String AddOne, String AddTwo, String Icountry, String Others,
			String pNum, String mpNum, String Alias, String s, String b,String k, String p) throws InterruptedException {
		HomePage homepage = new HomePage();
		SignInPage signinpage = new SignInPage();
		CreateAccounts registrar = new CreateAccounts();
		// Sign in page
		homepage.clickSigninButton();
		// wait for loading sign in page fully
//		signinpage.waitForPageLoad();
//
		signinpage.EnterEmailtoRegister(email);
		
        registrar.waitForPageLoad();

		// registration.RegistrationPartOne(baseurl, baseurl, baseurl, baseurl, baseurl,
		// baseurl);
//	homepage.ClickCasualbutton();
//	homepage.ClickTshirtbutton();
	}
}
