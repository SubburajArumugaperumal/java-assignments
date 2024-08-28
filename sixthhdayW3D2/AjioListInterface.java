package assignment.sixthhdayW3D2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioListInterface {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.ajio.com/");
	driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
	driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
	driver.findElement(By.xpath("//label[contains(@class,'linkname-Men')]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//label[contains(@class,'Fashion Bags')]")).click();
	Thread.sleep(600);
	
	WebElement item = driver.findElement(By.xpath("//*[@id=\"products\"]/div[3]/div/div[1]/strong"));
	String count=item.getText();
	System.out.println("Items Found: " +count);
	Thread.sleep(500);
	
	List<WebElement> Brandname=driver.findElements(By.xpath("//div[@class='brand']"));
	System.out.println("List of Brand of the Products displayed in the page:" + Brandname.size());
	Thread.sleep(500);
		for (int i = 0; i <Brandname.size(); i++) {
			System.out.println("Brand Names:" + Brandname.get(i).getText());
				}
		
		List<WebElement> Bagname = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("List of Names of the Bags displayed in the page :" +Bagname.size());
		Thread.sleep(500);
			for (int i = 0; i < Bagname.size(); i++) {
				System.out.println("Bag Names:" + Bagname.get(i).getText());
					}
}
}
