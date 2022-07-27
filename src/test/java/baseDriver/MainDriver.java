package baseDriver;

import io.qameta.allure.Step;
import org.testng.annotations.AfterMethod;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainDriver {

	WebDriver driver = null;
	public String baseurl= "http://automationpractice.com/index.php";

	@BeforeSuite //it runs before all the test starts executing
	public void setup() {
		String browser = System.getProperty("Browser","chrome");
		if(browser.contains("opera")) {
			//setup operabrowser
			WebDriverManager.operadriver().setup();	
			driver = new OperaDriver();
			}
		else if(browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(baseurl);
		
		// implicit waits in selenium is used to tell the browser to wait
		//for a certain amount of time. After it throws 
		//"no such element exception"
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PageDriver.getInstance().setDriver(driver);
	}

	@Step("Quit Process")
	@AfterMethod
	@AfterSuite 
	public void tearDown() {
		PageDriver.getCurrentDriver().quit();
	}

}
