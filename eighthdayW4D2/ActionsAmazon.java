package assignment.eighthdayW4D2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.amazon.in/");

		Actions action = new Actions(driver);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		action.click(search).perform();
		search.sendKeys("One Plus 9 Pro", Keys.ENTER);

		WebElement firstproduct = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String Price = firstproduct.getText();
		System.out.println("Price of 1st product " + Price);

		WebElement rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
		String customerrating = rating.getText();
		System.out.println("1st product customer rating is  " + customerrating);

		WebElement firstimage = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		action.click(firstimage).perform();

		Set<String> pw = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(pw);
		driver.switchTo().window(window.get(1));

		WebElement snap = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']"));
		File source = snap.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snapshot/IMAGE.png");
		FileUtils.copyFile(source, destination);
		Thread.sleep(3000);

		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		action.click(addtocart).perform();
		Thread.sleep(3000);

		WebElement cartsubtotal = driver
				.findElement(By.xpath("//span[contains(@class,'a-size-base-plus a-color-price')]//span[1]"));
		String subtotal = cartsubtotal.getText();
		System.out.println("The cart subtotal is " + subtotal);
		
		if(subtotal.contains(Price))
		{
			System.out.println("Price and Subtotal are same");
		}
		else
		{
			System.out.println("Price and Subtotal are not same");
		}
		
		driver.close();
		driver.switchTo().window(window.get(0));
		driver.quit();

	}

}
