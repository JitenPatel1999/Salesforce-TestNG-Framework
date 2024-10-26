package Salesforce_TestNG;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class User_Dropdown_Tests extends Base_Salesforce{
	@Test
	public static void TC5()throws InterruptedException{
		Login();
		WebElement dropdown = driver.findElement(By.className("menuButton"));
		clickElement(dropdown, "User Dropdown");
	}
	@Test
	public static void TC6()throws InterruptedException, AWTException {
		Login();
		WebElement nav = driver.findElement(By.xpath("//*[@id=\"userNav\"]"));
		clickElement(nav, "User Navigation");
		WebElement profile = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
		clickElement(profile, "Profile");
		WebElement edit = driver.findElement(By.xpath("//img[@title='Edit Profile']"));
		clickElement(edit, "Edit");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"contactInfoContentId\"]")));
		WebElement about = driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
		clickElement(about, "About");
		WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lname.clear();
		enterText(lname, "<Lastname>");
		WebElement save = driver.findElement(By.xpath("//input[@value='Save All']"));
		clickElement(save, "Save");
		driver.switchTo().defaultContent();
		WebElement post = driver.findElement(By.xpath("//*[@id=\"publisherAttachTextPost\"]/span[1]"));
		clickElement(post, "Post");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"cke_43_contents\"]/iframe")));
		WebElement textbox = driver.findElement(By.xpath("/html/body"));
		enterText(textbox, "<text>");
		driver.switchTo().defaultContent();
		WebElement share = driver.findElement(By.xpath("//*[@id=\"publishersharebutton\"]"));
		clickElement(share, "Share");
		WebElement file = driver.findElement(By.xpath("//*[@id=\"publisherAttachContentPost\"]/span[1]"));
		clickElement(file, "File");
		WebElement upload = driver.findElement(By.xpath("//*[@id=\"chatterUploadFileAction\"]"));
		clickElement(upload, "Upload");
		WebElement browseButton = driver.findElement(By.xpath("//*[@id=\"chatterFile\"]"));
		enterText(browseButton, "C:\\\\Users\\\\jiten\\\\Downloads\\\\image.jpg");
		clickElement(share, "Share");
		WebElement moderator = driver.findElement(By.xpath("//*[@id=\"displayBadge\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(moderator).build().perform();
		WebElement pfp = driver.findElement(By.xpath("//*[@id=\"uploadLink\"]"));
		clickElement(pfp, "Profile Picture");
		WebElement box = driver.findElement(By.xpath("//*[@id=\"uploadPhoto\"]"));
		driver.switchTo().frame(box.findElement(By.xpath("//*[@id=\"uploadPhotoContentId\"]")));
		WebElement browse = driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"]"));
		enterText(browse, "C:\\\\\\\\Users\\\\\\\\jiten\\\\\\\\Downloads\\\\\\\\image.jpg");
		WebElement panel = driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm\"]/div[3]"));
		WebElement save2 = driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadBtn\"]"));
		clickElement(save2, "Save");
		WebElement save3 = driver.findElement(By.xpath("//*[@id=\"j_id0:j_id7:save\"]"));
		clickElement(save3, "Save");
		driver.switchTo().defaultContent();
	}
	@Test
	public static void TC7()throws InterruptedException {
		WebElement usernav = driver.findElement(By.className("menuButton"));
		clickElement(usernav, "User Navigation");
		WebElement settings = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]"));
		clickElement(settings, "Settings");
		WebElement display = driver.findElement(By.id("DisplayAndLayout"));
		clickElement(display, "Display");
		WebElement customize = driver.findElement(By.id("CustomizeTabs_font"));
		clickElement(customize, "Customize Tabs");
		WebElement customapp = driver.findElement(By.xpath("//*[@id=\"p4\"]"));
		Select(customapp, "Salesforce Chatter");
		WebElement tabs = driver.findElement(By.xpath("//*[@id=\"duel_select_0\"]"));
		Select(tabs, "Reports");
		WebElement add = driver.findElement(By.xpath("//*[@id=\"duel_select_0_right\"]/img"));
		clickElement(add, "Add");
		WebElement save = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		clickElement(save, "Save");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"EmailSetup\"]/a"));
		clickElement(email, "Email");
		WebElement emailsettings = driver.findElement(By.xpath("//*[@id=\"EmailSettings_font\"]"));
		clickElement(emailsettings, "Email Settings");
		WebElement yes = driver.findElement(By.xpath("//*[@id=\"auto_bcc1\"]"));
		clickElement(yes, "Yes");
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		clickElement(submit, "Submit");
	}
	@Test
	public static void TC8()throws InterruptedException {
		Login();
		WebElement dropdown = driver.findElement(By.className("menuButton"));
		clickElement(dropdown, "User Dropdown");
		WebElement console = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[3]"));
		clickElement(console, "Developer Console");
		driver.quit();
	}
	@Test
	public static void TC9()throws InterruptedException {
		Login();
		Logout();
	}
}
