package pageObject;

import baseDriver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;
/*************
 * This part belongs to Signout
 * ************/
public class SignoutPage extends Common {
    public SignoutPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }
    /*************
     * This part belongs to Sign out locators
     * ************/
    @FindBy(css = "a[title='Log me out']")
    public WebElement signout;
    /*************
     * This part belongs to Sign out process
     * ************/
    public void signoutbutton(){
        signout.click();
    }
}
