package assignment.thirdday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountUsingSelectClass {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("SubburajSanju");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("(//select[@name='industryEnumId']/option)[4]")).click();
		WebElement os = driver.findElement(By.name("ownershipEnumId"));
		Select id = new Select(os);
		id.selectByVisibleText("Corporation");
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select sc = new Select(source);
		sc.selectByValue("LEAD_EMPLOYEE");
		WebElement market = driver.findElement(By.id("marketingCampaignId"));
		Select mt = new Select(market);
		mt.selectByIndex(4);
	    driver.findElement(By.xpath("(//select[@name='generalStateProvinceGeoId']/option)[51]")).click();
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		
	}
}
