package assignment.thirdday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Subburaj");
		driver.findElement(By.name("firstname")).sendKeys("Girija");
		driver.findElement(By.name("reg_email__")).sendKeys("8344421727");
		driver.findElement(By.id("password_step_input")).sendKeys("Subbu94$");
		// date
		WebElement day = driver.findElement(By.id("day"));
		Select dy = new Select(day);
		dy.selectByValue("24");
		// month
		WebElement month = driver.findElement(By.id("month"));
		Select mh = new Select(month);
		mh.selectByIndex(6);
		// year
		WebElement year = driver.findElement(By.id("year"));
		Select yr = new Select(year);
		yr.selectByValue("1994");
		Thread.sleep(2000);
		// gender radio button
		WebElement sex = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		sex.click();
	}

}
