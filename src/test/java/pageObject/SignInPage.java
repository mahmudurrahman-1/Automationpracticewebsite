package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseDriver.PageDriver;
import io.qameta.allure.Step;
import utilities.Common;
/*************
 * This part belongs to Signing into account
 * ************/
public class SignInPage extends Common {
public SignInPage() {
	PageFactory.initElements(PageDriver.getCurrentDriver(), this);
}
	/*************
	 * This part belongs to Sign in locator
	 * ************/
//for registration page
@FindBy(id = "email_create")
public WebElement emailfield;

@FindBy(id = "SubmitCreate")
public WebElement SubmitCreateButton;
//For Sign in Page
@FindBy(id = "email")
public WebElement emailR;
	@FindBy(id = "passwd")
	public WebElement passwordR;
	@FindBy(id = "SubmitLogin")
	public WebElement signinRbutton;
	/*************
	 * This part belongs to Signing into profile
	 * ************/
@Step("Input Email and Click Register button")
public void EnterEmailtoRegister(String email) {
	sendText(emailfield, email);
	SubmitCreateButton.click();
}
	@Step("Input Email and Click Sign in button")
	public void SigningIn(String email,String password) {
		sendText(emailR, email);
		sendText(passwordR, password);

		signinRbutton.click();
	}
}
