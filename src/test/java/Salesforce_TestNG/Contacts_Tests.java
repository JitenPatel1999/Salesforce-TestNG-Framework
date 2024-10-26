package Salesforce_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Contacts_Tests extends Base_Salesforce{
	@Test
	public static void TC25()throws InterruptedException {
		Login();
		contacts();
		WebElement new_button = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
		clickElement(new_button, "New");
		WebElement lname = driver.findElement(By.xpath("//*[@id=\"name_lastcon2\"]"));
		enterText(lname,"<LastName>");
		WebElement account = driver.findElement(By.xpath("//*[@id=\"con4\"]"));
		enterText(account, "<AccountName>");
		WebElement save = driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[1]"));
		clickElement(save, "Save");
	}
	@Test
	public static void TC26()throws InterruptedException {
		Login();
		contacts();
		WebElement view = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
		clickElement(view, "View");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
		enterText(name, "<View Name>");
		WebElement unique = driver.findElement(By.xpath("//*[@id=\"devname\"]"));
		clickElement(unique, "Unique");
		WebElement save = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]"));
		clickElement(save, "Save");
	}
	@Test
	public static void TC27()throws InterruptedException {
		Login();
		contacts();
		WebElement created = driver.findElement(By.xpath("//*[@id=\"hotlist_mode\"]"));
		Select(created, "Recently Created");
	}
	@Test
	public static void TC28()throws InterruptedException {
		Login();
		contacts();
		WebElement view = driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
		Select(view, "My Contacts");
	}
	@Test
	public static void TC29()throws InterruptedException {
		Login();
		contacts();
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr[4]/th/a"));
		clickElement(lastName, "Last Name");
	}
	@Test
	public static void TC30()throws InterruptedException {
		Login();
		contacts();
		WebElement newview = driver.findElement(By.xpath("//a[text()='Create New View']"));
		clickElement(newview, "New View");
		WebElement unique = driver.findElement(By.xpath("//*[@id=\"devname\"]"));
		enterText(unique, "EFGH");
		WebElement save = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]"));
		clickElement(save, "Save");
	}
	@Test
	public static void TC31()throws InterruptedException {
		Login();
		contacts();
		WebElement newview = driver.findElement(By.xpath("//a[text()='Create New View']"));
		clickElement(newview, "New View");
		WebElement unique = driver.findElement(By.xpath("//*[@id=\"devname\"]"));
		enterText(unique, "EFGH");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
		enterText(name, "ABCD");
		WebElement cancel = driver.findElement(By.xpath("//input[@value='Cancel']"));
		clickElement(cancel, "Cancel");
	}
	@Test
	public static void TC32()throws InterruptedException {
		Login();
		contacts();
		WebElement newButton = driver.findElement(By.xpath("//input[@value=' New ']"));
		clickElement(newButton, "New");
		WebElement lname = driver.findElement(By.xpath("//*[@id=\"name_lastcon2\"]"));
		enterText(lname, "Indian");
		WebElement accountname = driver.findElement(By.xpath("//*[@id=\"con4\"]"));
		enterText(accountname, "Global Media");
		WebElement save = driver.findElement(By.xpath("//input[@value='Save & New']"));
		clickElement(save, "Save");
	}
}
