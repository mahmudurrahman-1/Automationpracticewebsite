package pageObject;

import org.apache.hc.client5.http.ssl.DefaultHostnameVerifier;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseDriver.PageDriver;
import io.qameta.allure.Step;
import utilities.Common;

public class HomePage extends Common {

	
	public HomePage() {
	//this class is provided by selenium webdriver to support page object design patterns
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	
	@FindBy(css = "a[title='Log in to your customer account']")
	public WebElement SigninButton;
	@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
	public WebElement Dressbutton;
	@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	public WebElement Casualbutton;
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
	public WebElement Tshirtsbutton;
	
	
	
	@Step("Click on Sign in button")
	public void clickSigninButton() {
		SigninButton.click();
	}
	@Step("Click on Dressbuttton")
	public void ClickCasualbutton() {
		hover(Dressbutton);
		Casualbutton.click();
	}
	@Step("Click on T-shirt button")
	public void ClickTshirtbutton() {
		
		Tshirtsbutton.click();
	}
	
}
