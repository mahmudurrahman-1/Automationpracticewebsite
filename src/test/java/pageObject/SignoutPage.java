package pageObject;

import baseDriver.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class SignoutPage extends Common {
    public SignoutPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }
    @FindBy(css = "a[title='Log me out']")
    public WebElement signout;

    public void signoutbutton(){
        signout.click();
    }
}
