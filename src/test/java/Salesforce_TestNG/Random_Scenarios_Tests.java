package Salesforce_TestNG;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Random_Scenarios_Tests extends Base_Salesforce{
	@Test
	public static void TC33()throws InterruptedException {
		Login();
		home();
		WebElement name = driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a"));
		clickElement(name, "Name");
	}
	@Test
	public static void TC34()throws InterruptedException {
		Login();
		home();
		WebElement name = driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a"));
		clickElement(name, "Name");
		WebElement edit = driver.findElement(By.xpath("//img[@title='Edit Profile']"));
		clickElement(edit,"Edit");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"contactInfoContentId\"]")));
		WebElement about = driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
		clickElement(about,"About");
		WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lname.clear();
		enterText(lname,"abcd");
		WebElement save = driver.findElement(By.xpath("//input[@value='Save All']"));
		clickElement(save, "Save");
		closeDriver();
	}
	@Test
	public static void TC35()throws InterruptedException {
		Login();
		WebElement extend = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]/a/img"));
		clickElement(extend, "Extend");
		WebElement customize = driver.findElement(By.xpath("//input[@value='Customize My Tabs']"));
		clickElement(customize, "Customize Tabs");
		WebElement tabs = driver.findElement(By.xpath("//*[@id=\"duel_select_1\"]"));
		List<WebElement> tabs1 = tabs.findElements(By.tagName("option"));
		for(int i = 1; i < tabs1.size(); i++) {
			clickElement(tabs1.get(i), "Tab 1");
			WebElement delete = driver.findElement(By.xpath("//*[@id=\"duel_select_0_left\"]/img"));
			clickElement(delete, "Delete");
		}
		WebElement save = driver.findElement(By.xpath("//input[@title='Save']"));
		clickElement(save, "Save");
		Logout();
		Login();
	}
	@Test
	public static void TC36()throws InterruptedException {
		Login();
		home();
		WebElement today = driver.findElement(By.xpath("//td[@class='calToday']"));
		clickElement(today, "Today");
		WebElement eightpm = driver.findElement(By.xpath("//a[contains(text(), '8:00 PM')]"));
		clickElement(eightpm, "8pm");
		WebElement icon = driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a"));
		clickElement(icon, "Icon");
		String original = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for(String h: handles) {
			if(!h.equals(original)) {
				driver.switchTo().window(h);
			}
		}
		WebElement other = driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a"));
		clickElement(other,"Other");
		driver.switchTo().window(original);
		WebElement endtime = driver.findElement(By.xpath("//*[@id=\"EndDateTime_time\"]"));
		clickElement(endtime, "End Time");
		WebElement ninepm = driver.findElement(By.xpath("//*[@id=\"timePickerItem_42\"]"));
		clickElement(ninepm, "9pm");
		WebElement save = driver.findElement(By.xpath("//input[@value=' Save ']"));
		clickElement(save, "Save");
	}
	@Test
	public static void TC37()throws InterruptedException {
		Login();
		home();
		WebElement today = driver.findElement(By.xpath("//td[@class='calToday']"));
		clickElement(today, "Today");
		WebElement fourpm = driver.findElement(By.xpath("//a[contains(text(), '4:00 PM')]"));
		clickElement(fourpm, "4pm");
		String original = driver.getWindowHandle();
		WebElement icon = driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a"));
		clickElement(icon, "Icon");
		Set<String> handles = driver.getWindowHandles();
		for(String handle: handles) {
			if(!handle.equals(original)) {
				driver.switchTo().window(handle);
			}
		}
		WebElement other = driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a"));
		clickElement(other, "Other");
		driver.switchTo().window(original);
		WebElement endtime = driver.findElement(By.xpath("//*[@id=\"EndDateTime_time\"]"));
		clickElement(endtime, "End Time");
		WebElement sevenpm = driver.findElement(By.xpath("//*[@id=\"timePickerItem_38\"]"));
		clickElement(sevenpm, "7pm");
		WebElement recurrence = driver.findElement(By.xpath("//input[@id = 'IsRecurrence']"));
		clickElement(recurrence, "Recurrence");
		WebElement weekly = driver.findElement(By.xpath("//*[@id=\"rectypeftw\"]"));
		clickElement(weekly, "Weekly");
		WebElement recurs = driver.findElement(By.xpath("//*[@id=\"wi\"]"));
		recurs.clear();
		enterText(recurs,"1");
		WebElement week = driver.findElement(By.xpath("//*[@id=\"w\"]/div[2]"));
		List<WebElement> days = week.findElements(By.tagName("input"));
		for(int i = 1; i < days.size(); i++) {
			clickElement(days.get(i), "Day "+i);
		}
		WebElement enddate = driver.findElement(By.xpath("//*[@id=\"RecurrenceEndDateOnly\"]"));
		clickElement(enddate, "End Date");
		WebElement twoweeks = driver.findElement(By.xpath("//*[@id=\"calRow5\"]/td[1]"));
		clickElement(twoweeks, "2 Weeks");
		WebElement save = driver.findElement(By.xpath("//input[@value=' Save ']"));
		clickElement(save, "Save");
		WebElement month = driver.findElement(By.xpath("//*[@id=\"bCalDiv\"]/div/div[2]/span[2]/a[3]/img"));
		clickElement(month, "Month");
	}
}
