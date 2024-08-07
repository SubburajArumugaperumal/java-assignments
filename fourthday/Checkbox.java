package assignment.fourthday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-corner-all ')])[20]")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']")).click();
		// text
		WebElement msg = driver.findElement(By.xpath("//div[@class='ui-growl ui-widget']"));
		String m = msg.getText();
		System.out.println(m);
		WebElement checkbox = driver.findElement(By.name("j_idt87:j_idt102_input"));
		if (checkbox.isEnabled()) {
			System.out.println("Enabled");
		} else {
			System.out.println("Disabled");
		}
		driver.findElement(By.xpath("//div[@class=\"ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right\"]"))
				.click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-close\"]")).click();
		driver.close();
	}
}
