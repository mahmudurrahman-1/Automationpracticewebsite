package pageObject;

import baseDriver.PageDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;
/*************
 * This part belongs to Payment
 * ************/
public class Payment extends Common {
    /*************
     * This part belongs to object Creation
     * ************/
    public Payment(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }
    /*************
     * This part belongs Locators for payment
     * ************/
    @FindBy(className = "primary_block")
    public WebElement centerScroll;
    @FindBy(css = "a[title='Proceed to checkout']")
    public WebElement proceedShop;
    @FindBy(css = "button[name='Submit']")
    public WebElement submit;
    /*************
     * This part belongs to Scrolling and further payment process
     * ************/

    @Step("proceed continue")
    public void proceedClick(){
        scrollToElement(centerScroll);
        submit.click();
    }
    @Step("Click to continue proceed")
    public void Cproceed(){
        proceedShop.click();
    }
}
