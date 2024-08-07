package assignment.fourthday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
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
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("subbu");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("sanju");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("susa");
	driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("mech");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("susa@gmail.com");
	WebElement country=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select opt=new Select(country);
	opt.selectByVisibleText("New York");
	driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	Thread.sleep(1000);
	//Edit lead
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("asr");
	driver.findElement(By.xpath("//input[@value='Update']")).click();
	System.out.println(driver.getTitle());
	driver.close();
}
}
