package Salesforce_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Oppurtunities_Tests extends Base_Salesforce {
	@Test
	public static void TC15()throws InterruptedException {
		Login();
		oppurtunities();
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
		clickElement(dropdown, "User Dropdown");
	}
	@Test
	public static void TC16() throws InterruptedException{
		Login();
		oppurtunities();
		WebElement newopp = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
		clickElement(newopp, "New Oppurtunity");
		WebElement name = driver.findElement(By.xpath("//*[@id=\"opp3\"]"));
		enterText(name, "<Oppurtunity>");
		WebElement search = driver.findElement(By.xpath("//*[@id=\"opp4_lkwgt\"]"));
		clickElement(search,"Search");
		WebElement account = driver.findElement(By.xpath("//*[@id=\"opp4\"]"));
		enterText(account,"<Account Name>");
		WebElement endDate = driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[3]/table/tbody/tr[2]/td[4]/div/span/span/a"));
		clickElement(endDate, "End Date");
		WebElement stage = driver.findElement(By.xpath("//*[@id=\"opp11\"]"));
		Select(stage,"Prospecting");
		WebElement prob = driver.findElement(By.xpath("//*[@id=\"opp12\"]"));
		enterText(prob, "0");
		WebElement source = driver.findElement(By.xpath("//*[@id=\"opp6\"]"));
		Select(source, "Web");
		WebElement source2 = driver.findElement(By.xpath("//*[@id=\"opp17\"]"));
		enterText(source2, "source");
		WebElement save = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		clickElement(save, "Save");
	}
	@Test
	public static void TC17() throws InterruptedException{
		Login();
		oppurtunities();
		WebElement pipeline = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a"));
		clickElement(pipeline, "Pipeline");
	}
	@Test
	public static void TC18() throws InterruptedException{
		Login();
		oppurtunities();
		WebElement stuck = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a"));
		clickElement(stuck, "Stuck");
	}
	@Test
	public static void TC19() throws InterruptedException{
		Login();
		oppurtunities();
		WebElement interval = driver.findElement(By.xpath("//select[@id='quarter_q']"));
		Select select = new Select(interval);
		List<WebElement> options = select.getOptions();
		System.out.println(options.size());
		WebElement include = driver.findElement(By.xpath("//select[@id='open']"));
		Select select2 = new Select(include);
		List<WebElement> options2 = select2.getOptions();
		WebElement run = driver.findElement(By.xpath("//input[@value='Run Report']"));
		for(int i = 0; i < options.size(); i++) {
			for(int j= 0; j < options2.size(); j++) {
				clickElement(options.get(i), "Option");
				clickElement(options2.get(j), "Option");
				clickElement(run, "Run");
				driver.navigate().back();
				WebDriverWait wait = new WebDriverWait(driver, 10);
				interval = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id='quarter_q']")));
				select = new Select(interval);
				options = select.getOptions();
				include = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id='open']")));
				select2 = new Select(include);
				options2 = select2.getOptions();
				run = driver.findElement(By.xpath("//input[@value='Run Report']"));
			}
		}
	}
}
