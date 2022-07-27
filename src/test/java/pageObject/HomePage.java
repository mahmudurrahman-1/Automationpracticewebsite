package pageObject;

import org.apache.hc.client5.http.ssl.DefaultHostnameVerifier;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseDriver.PageDriver;
import io.qameta.allure.Step;
import utilities.Common;
/*************
 * This part belongs to Homepage driver
 * ************/

public class HomePage extends Common {

	/*************
	 * This part belongs to create instance
	 * ************/
	public HomePage() {
	//this class is provided by selenium webdriver to support page object design patterns
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	/*************
	 * This part belongs to all the Locators
	 * ************/
	@FindBy(css = "a[title='Log in to your customer account']")
	public WebElement SigninButton;
	@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
	public WebElement Dressbutton;
	@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	public WebElement Casualbutton;
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
	public WebElement Tshirtsbutton;

	/*************
	 * This part belongs to Sign in and Dress navigation pages
	 * ************/
	//signing in to my account
	@Step("Click on Sign in button")
	public void clickSigninButton() {
		SigninButton.click();
	}
	// Casual Dress
	@Step("Click on Casual Dressbuttton")
	public void ClickCasualbutton() {
		hover(Dressbutton);
		Casualbutton.click();
	}

	//Choose T-Shirts
	@Step("Click on T-shirt button")
	public void ClickTshirtbutton() {
		
		Tshirtsbutton.click();
	}
	
}
