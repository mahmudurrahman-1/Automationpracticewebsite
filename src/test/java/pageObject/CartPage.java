package pageObject;

import baseDriver.PageDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;
/*************
 * This part belongs to CartPage
 * ************/

public class CartPage extends Common {
    public  CartPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }
    //Adding dress in to the cart
    /*************
     * This part belongs to Locators
     * ************/
    @FindBy(css = "div[class='product-container']")
    public WebElement product;
    @FindBy(css = "a[title='Add to cart']")
    public WebElement cartButton;
    @FindBy(xpath = "//span[@title='Continue shopping']//span[1]")
    public WebElement continueShop;
    @FindBy(css = "title=['Proceed to checkout']")
    public WebElement proceedShop;
    @FindBy(id = "color_2")
    public WebElement blueButton;
    /*************
     * This part belongs to all the cart process
     * ************/
    @Step("Hover product and click cart button to add dress")
    public void addingToCart(){
        scrollToElement(product);
        hover(product);
        cartButton.click();
    }
    @Step("keep shopping continue")
    public void Cshopping(){
        continueShop.click();
    }
    @Step("filter with blue button")
    public void FilteringBlue(){
        scrollToElement(product);
        hover(product);
        blueButton.click();
    }
    @Step("proceed continue")
    public void Pshopping(){
        proceedShop.click();
    }

}
