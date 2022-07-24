package pageObject;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseDriver.PageDriver;
import io.qameta.allure.Step;
import utilities.Common;
import utilities.ScreenShots;

public class CreateAccounts extends Common{
	public CreateAccounts() {
		// initiating this class using "this" method
		// into the getcurrentdriver
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}

	@FindBy(id = "id_gender1")
	public WebElement mrTitle;
	@FindBy(id = "id_gender2")
	public WebElement mrsTitle;
	@FindBy(id = "customer_firstname")
	public WebElement cfirstName;
	@FindBy(id = "customer_lastname")
	public WebElement clastName;
	
	@FindBy(id = "passwd")
	public WebElement passwordfield;
	@FindBy(id = "days")
	public WebElement days;
	@FindBy(id = "months")
	public WebElement months;
	@FindBy(id = "years")
	public WebElement years;
	@FindBy(css = "label[for='newsletter']")
	public WebElement checkboxOne;
	@FindBy(css = "label[for='optin']")
	public WebElement checkboxTwo;
	//Your Address
	@FindBy(id = "firstname")
	public WebElement firstName;

	@FindBy(id = "lastname")
	public WebElement lastName;
	@FindBy(id="address1")
	public WebElement addressFirst;
	
	@FindBy(id="address2")
	public WebElement addressSecond;
	
	@FindBy(id="id_country")
	public WebElement countryId;
	@FindBy(id="other")
	public WebElement Other;
	@FindBy(id="phone")
	public WebElement phone;
	@FindBy(id="phone_mobile")
	public WebElement phoneMobile;
	@FindBy(id="alias")
	public WebElement alias;
	
	@FindBy(id="submitAccount")
	public WebElement submitButton;
	@Step("Fill all the inputs using valid personal information")
	public void RegistrationPartOne(String firstName,String lastName,String Password,
			String day, String month,String year ) {
		mrTitle.click();
		sendText(cfirstName,firstName);
		sendText(clastName,lastName);
		sendText(passwordfield, Password);
		selectitem(days, day);
		selectitem(months, month);
		selectitem(years, year);
		checkboxOne.click();
		checkboxTwo.click();
		ScreenShots.screenshotForAllure("Personal Info");

	}
	@Step("Fill all the inputs using valid Address Information")
	public void  RegistrationPartTwo(String AfirstName,String AlastName, String AddOne,String AddTwo
			,String Icountry,String Others,String pNum, String mpNum,String Alias) {
		sendText(firstName,AfirstName);
		sendText(lastName,AlastName);
		sendText(addressFirst,AddOne);
		sendText(addressSecond,AddTwo);
		sendText(countryId,Icountry);
		sendText(Other,Others);
		sendText(phone,pNum);
		sendText(phoneMobile,mpNum);
		sendText(alias, Alias);
		ScreenShots.screenshotForAllure("Address Info");


	}
	@Step("submit")
	public void SubmitClick() {
		submitButton.click();
	}
	
}
