package Salesforce_TestNG;

import java.util.concurrent.TimeUnit;
import UtilityPackage.PropertiesUtility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import UtilityPackage.Salesforce_Listener;
public class Base_Salesforce extends Base_Functions{
	protected static Logger myLog = LogManager.getLogger(Base_Salesforce.class);
	@BeforeMethod
	public void setUpBeforeMethod() {
		browser("edge");
		goToUrl("https://login.salesforce.com");
	}
	@AfterMethod
	public void tearDownAfterMethod() {
		closeDriver();
	}
	public static void Login() throws InterruptedException{
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		enterText(username, "jiten@tekarch.com");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, "Nami0506");
		WebElement login = driver.findElement(By.id("Login"));
		clickElement(login, "Login");
		myLog.info("You have successfully logged in.");
}
	public static void Logout() {
		WebElement user = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		clickElement(user, "User");
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		clickElement(logout, "Logout");
		myLog.info("You have successfully logged out.");
	}
	public static void accounts() {
		WebElement extend = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]/a/img"));
		clickElement(extend, "Extended");
		WebElement accounts = driver.findElement(By.xpath("//a[text()= 'Accounts']"));
		clickElement(accounts, "Accounts");
		myLog.info("You have extented to all tabs.");
	}
	public static void oppurtunities() {
		WebElement extend = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]/a/img"));
		clickElement(extend, "Extended");
		WebElement opp = driver.findElement(By.xpath("//a[text()= 'Opportunities']"));
		clickElement(opp, "Oppurtunities");
		myLog.info("You have went to the oppurtunities page.");
	}
	public static void leads() {
		WebElement extend = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]/a/img"));
		clickElement(extend, "Extended");
		WebElement leads = driver.findElement(By.xpath("//a[text()= 'Leads']"));
		clickElement(leads, "Leads");
		myLog.info("You have went to the leads page.");
	}
	public static void contacts() {
		WebElement extend = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]/a/img"));
		clickElement(extend, "Extended");
		WebElement contacts = driver.findElement(By.xpath("//a[text()= 'Contacts']"));
		clickElement(contacts, "Contacts");
		myLog.info("You have went to the contacts page.");
	}
	public static void home() {
		WebElement home = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		clickElement(home, "Home");
		myLog.info("You have went to the home page.");
	}
}
