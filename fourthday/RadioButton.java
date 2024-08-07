package assignment.fourthday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement Browser =driver.findElement(By.xpath("(//table[@class='ui-selectoneradio ui-widget']//label[text()='Chrome'])[1]"));
		Browser.click();
		driver.findElement(By.xpath("(//table[@class='ui-selectoneradio ui-widget']//label[text()='Safari'])[1]"))
		.click();
		if (Browser.isSelected()) {
			System.out.println("Chrome is selected");
		} else {
			System.out.println("Chrome is not selected");
		}
	WebElement age=driver.findElement(By.xpath("//div[@class='ui-g']//label[text()='21-40 Years']"));
		if(age.isEnabled()){
			System.out.println("already selected");
		}else {
			age.click();
		}
	}

}
