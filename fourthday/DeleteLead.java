package assignment.fourthday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		//createlead
		driver.findElement(By.xpath("(//div[@class='frameSectionBody']//a)[2]")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subburaj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arumugaperumal");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SubburajTestleaf");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8344421727");
		driver.findElement(By.className("smallSubmit")).click();
		// find lead by phone number
		driver.findElement(By.xpath("(//div[@class='frameSectionBody']//a)[3]")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("8344421727");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(500);
		WebElement leadid = driver.findElement(By.xpath("//div[contains(@class,'col-partyId')]/a"));
		String s = leadid.getText();
		System.out.println(s);
		leadid.click();
		//delete lead
		Thread.sleep(500);
		driver.findElement(By.linkText("Delete")).click();
		//find lead by ID
		driver.findElement(By.xpath("(//div[@class='frameSectionBody']//a)[3]")).click();
		driver.findElement(By.name("id")).sendKeys(s);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(500);
		WebElement result = driver.findElement(By.className("x-paging-info"));
		System.out.println(result.getText());
	}
}
