package Salesforce_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SalesForce_Login_Tests extends Base_Salesforce {
	@Test
	public static void TC1()throws InterruptedException {
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		enterText(username, "<User@gmail.com>");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		WebElement login = driver.findElement(By.id("Login"));
		clickElement(login, "Login");
	}
	@Test
	public static void TC2()throws InterruptedException {
		Login();
	}
	@Test
	public static void TC3() {
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		enterText(username, "jiten@tekarch.com");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, "Nami0506");
		WebElement rememberme = driver.findElement(By.xpath("//*[@id=\"rememberUn\"]"));
		clickElement(rememberme, "Remember Me");
		WebElement login = driver.findElement(By.id("Login"));
		clickElement(login, "Login");
		Logout();
	}
	@Test
	public static void TC4A() {
		WebElement forgot = driver.findElement(By.id("forgot_password_link"));
		clickElement(forgot, "Forgot Password");
	}
	@Test
	public static void TC4B() {
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		enterText(username, "123");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		enterText(password, "22131");
		WebElement login = driver.findElement(By.id("Login"));
		clickElement(login, "Login");
	}
}
