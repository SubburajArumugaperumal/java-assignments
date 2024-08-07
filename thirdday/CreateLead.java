package assignment.thirdday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText(	"CRM/SFA")).click();	
	driver.findElement(By.linkText("Leads")).click();
	//create lead
	driver.findElement(By.xpath("(//div[@class='frameSectionBody']//a)[2]")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subburaj");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arumugaperumal");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SubburajTestleaf");
	Thread.sleep(2000);
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8344421727");
	driver.findElement(By.className("smallSubmit")).click();
    driver.close();
		}
}
	