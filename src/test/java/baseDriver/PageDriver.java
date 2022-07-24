package baseDriver;

import org.openqa.selenium.WebDriver;

public class PageDriver {
//when working on multiple page
//multiple drivers are needed
//if only one driver then it conflicts
//does not allow to initialize next page because one is '
	//already there
//page driver is because of generating specific page 
	//and when it finishes then we will quit
	
	//thread local class enables to create variables
	//that can only be read and write by the same thread
	//ThreadLocal<WebDriver> is WebDriver type
	//it allows to create webdriver variables
	
private static final ThreadLocal<WebDriver> webdriver = new ThreadLocal();

	private static PageDriver instance=null;
	
	//A private constructor does not allow to create instance of that class
	private PageDriver() {
	
}
	
	public static PageDriver getInstance() {
		if(instance==null) {
			instance=new PageDriver();
		}
		return instance;
	}
	//using webdriver variable here we write using set method
	public void setDriver(WebDriver driver) {
		webdriver.set(driver);
	}
	//here we read by using same thread(webdriver)
	public WebDriver getDriver() {
		return webdriver.get();
	}
	public static WebDriver getCurrentDriver() {
		return getInstance().getDriver();
	}
}
