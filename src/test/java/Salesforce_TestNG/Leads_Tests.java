package Salesforce_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Leads_Tests extends Base_Salesforce{
	@Test
	public static void TC20() throws InterruptedException{
		Login();
		leads();
	}
	@Test
	public static void TC21() throws InterruptedException{
		Login();
		leads();
		WebElement view = driver.findElement(By.xpath("//select[@id= 'fcf']"));
		clickElement(view, "View");
	}
	@Test
	public static void TC22() throws InterruptedException{
		Login();
		leads();
		WebElement view = driver.findElement(By.xpath("//select[@id= 'fcf']"));
		Select(view, "My Unread Leads");
		Logout();
		Login();
		WebElement extend2 = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]/a/img"));
		clickElement(extend2, "Extend");
		WebElement leads2 = driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[2]/table/tbody/tr[6]/td[2]/a"));
		clickElement(leads2, "Leads");
		WebElement go = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[1]/input"));
		clickElement(go, "Go");
	}
	@Test
	public static void TC23() throws InterruptedException{
		Login();
		leads();
		WebElement view = driver.findElement(By.xpath("//select[@id= 'fcf']"));
		Select(view, "Today's Leads");
	}
	@Test
	public static void TC24() throws InterruptedException{
		Login();
		leads();
		WebElement new_button = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
		clickElement(new_button, "New");
		WebElement lname = driver.findElement(By.xpath("//*[@id=\"name_lastlea2\"]"));
		enterText(lname, "ABCD");
		WebElement company = driver.findElement(By.xpath("//*[@id=\"lea3\"]"));
		enterText(company, "ABCD");
		WebElement save = driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[1]"));
		clickElement(save, "Save");
	}
}
