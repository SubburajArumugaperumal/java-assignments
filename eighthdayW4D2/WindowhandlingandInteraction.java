package assignment.eighthdayW4D2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlingandInteraction {
		public static void main(String args[]) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
			Thread.sleep(500);
			
			Set<String> allWindowHandles = driver.getWindowHandles();
			List<String> windows = new ArrayList<>(allWindowHandles);
			
			driver.switchTo().window(windows.get(1));
			WebElement fromContact = driver.findElement(By.linkText("DemoCustomer"));
			fromContact.click();	
			
			Thread.sleep(2000);
			driver.switchTo().window(windows.get(0));
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
			
			allWindowHandles = driver.getWindowHandles();
			windows = new ArrayList<>(allWindowHandles);
			
			driver.switchTo().window(windows.get(1));
			Thread.sleep(2000);
			WebElement ToContact = driver.findElement(By.linkText("DemoLBCust"));
			ToContact.click();	
			
			driver.switchTo().window(windows.get(0));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Merge']")).click();
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
			System.out.println("Title : " + driver.getTitle());		
	}
}
