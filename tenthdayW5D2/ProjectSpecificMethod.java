package assignment.tenthdayW5D2;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProjectSpecificMethod {

	public ChromeOptions option;
	public ChromeDriver driver;
	
	@Parameters({ "url", "username", "password" })
	@BeforeMethod
	public void preCondition(String url, String Username, String Password) throws InterruptedException {
		option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void postCondition() {
		driver.close();

	}

}
