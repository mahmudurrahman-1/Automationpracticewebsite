package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseDriver.PageDriver;
import io.qameta.allure.Step;
import utilities.Common;

public class SignInPage extends Common {
public SignInPage() {
	PageFactory.initElements(PageDriver.getCurrentDriver(), this);
}
@FindBy(id = "email_create")
public WebElement emailfield;

@FindBy(id = "SubmitCreate")
public WebElement SubmitCreateButton;

@Step("Here Input your Email and Click Registerbutton")
public void EnterEmailtoRegister(String email) {
	sendText(emailfield, email);
	SubmitCreateButton.click();
}
}
