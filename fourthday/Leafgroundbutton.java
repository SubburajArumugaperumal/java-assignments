package assignment.fourthday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafgroundbutton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println(driver.getTitle());
		driver.navigate().to("https://leafground.com/button.xhtml");
		WebElement confirm = driver.findElement(By.name("j_idt88:j_idt92"));
		if (confirm.isEnabled()) {
			System.out.println("Confirm button is Enabled");
		} else {
			System.out.println("Confirm button is disabled");
		}
		WebElement position = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		System.out.println(position.getLocation());
		WebElement save = driver.findElement(By.xpath("//span[text()='Save']"));
		System.out.println(save.getCssValue("background-color"));
		WebElement size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		System.out.println(size.getSize());
		driver.close();
	}

}
