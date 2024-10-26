package Salesforce_TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Create_Account_Tests extends Base_Salesforce{
	@Test
	public static void TC10()throws InterruptedException {
		Login();
		accounts();
		WebElement newaccount = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
		clickElement(newaccount, "New Account");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"acc2\"]"));
		enterText(name, "<Account name>");
		WebElement type = driver.findElement(By.xpath("//*[@id=\"acc6\"]"));
		Select(type, "Technology Partner");
		WebElement priority = driver.findElement(By.xpath("//*[@id=\"00Naj000005Nk2U\"]"));
		Select(priority, "High");
		WebElement save = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		clickElement(save, "Save");
	}
	@Test
	public static void TC11()throws InterruptedException {
		Login();
		accounts();
		WebElement create = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
		clickElement(create, "Create");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
		enterText(name, "<View Name>");
		WebElement save = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]"));
		clickElement(save, "Save");
	}
	@Test
	public static void TC12() throws InterruptedException{
		Login();
		accounts();
		WebElement view = driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
		Select(view, "<View Name>");
		WebElement edit = driver.findElement(By.xpath("//a[text()='Edit']"));
		clickElement(edit, "Edit");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
		enterText(name, "<new view name>");
		WebElement filter = driver.findElement(By.xpath("//*[@id=\"fcol1\"]"));
		Select(filter, "Account Name");
		WebElement operator = driver.findElement(By.xpath("//select[@id='fop1']"));
		Select(operator,"contains");
		WebElement value = driver.findElement(By.xpath("//input[@id='fval1']"));
		enterText(value, "<a>");
		WebElement save = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]"));
		clickElement(save, "Save");
	}
	@Test
	public static void TC13() throws InterruptedException{
		Login();
		accounts();
		WebElement merge = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
		clickElement(merge, "Merge");
		WebElement search = driver.findElement(By.xpath("//*[@id=\"srch\"]"));
		enterText(search, "<Account name>");
		WebElement find = driver.findElement(By.xpath("//input[@value = 'Find Accounts']"));
		clickElement(find, "Find");
		WebElement next = driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]"));
		clickElement(next, "Next");
		WebElement mergebutton = driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[2]"));
		clickElement(mergebutton, "Merge");
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	@Test
	public static void TC14() throws InterruptedException{
		Login();
		accounts();
		WebElement activity = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a"));
		clickElement(activity, "Activity");
		WebElement datefield = driver.findElement(By.xpath("//*[@id=\"ext-gen20\"]"));
		clickElement(datefield, "Date");
		WebElement created = driver.findElement(By.xpath("/html/body/div[15]/div/div[3]"));
		clickElement(created, "Created");
		WebElement date = driver.findElement(By.xpath("//*[@id=\"ext-gen152\"]"));
		clickElement(date, "Date");
		WebElement today = driver.findElement(By.xpath("//*[@id=\"ext-comp-1112\"]/tbody/tr[2]/td[2]/em"));
		clickElement(today, "Today");
		WebElement to = driver.findElement(By.xpath("//*[@id=\"ext-gen154\"]"));
		clickElement(to, "TO");
		WebElement today2 = driver.findElement(By.xpath("//*[@id=\"ext-comp-1114\"]/tbody"));
		clickElement(today2, "Today");
		WebElement save = driver.findElement(By.xpath("//*[@id=\"saveReportBtn\"]/tbody/tr[2]/td[2]/em"));
		clickElement(save, "Save");
		WebElement reportname = driver.findElement(By.xpath("//*[@id=\"saveReportDlg_reportNameField\"]"));
		enterText(reportname,"<report name>");
		WebElement unique = driver.findElement(By.xpath("//*[@id=\"saveReportDlg_DeveloperName\"]"));
		clickElement(unique, "Unique");
		WebElement saveandrun = driver.findElement(By.xpath("//*[@id=\"dlgSaveAndRun\"]/tbody/tr[2]/td[2]/em"));
		clickElement(saveandrun, "Save and Run");
	}
}
