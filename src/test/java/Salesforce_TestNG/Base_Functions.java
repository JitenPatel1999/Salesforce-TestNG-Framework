package Salesforce_TestNG;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;
import UtilityPackage.Salesforce_Listener;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Functions {
	static WebDriver driver = null;
	protected static Logger myLog = LogManager.getLogger(Base_Functions.class);
	public static void browser(String browser) {
		switch(browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			myLog.info("Browser has been setup.");
			break;
		
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			myLog.info("Browser has been setup.");
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			myLog.info("Browser has been setup.");
			break;
		case "opera":
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
			myLog.info("Browser has been setup.");
			break;
		default:
			myLog.info("Please enter a valid browser.");
			break;
		}
	}
	public static void goToUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		myLog.info("You have reached: "+url);
	}
	public static void closeDriver() {
		driver.quit();
		myLog.info("The browser is now closed.");
	}
	public static void enterText(WebElement wb, String data) {
		if(wb.isDisplayed()) {
			wb.sendKeys(data);
			myLog.info(data+" has been entered into the field.");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			myLog.error("Web element is not found");
		}
	}
	public static void clickElement(WebElement wb, String click) {
		if(wb.isDisplayed()) {
			wb.click();
			myLog.info(click+" has been clicked.");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			myLog.error("Web element is not found");
		}
	}
	public static void Select(WebElement wb, String data) {
		Select select = new Select(wb);
		select.selectByVisibleText(data);
		myLog.info(data+" has been selected.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
