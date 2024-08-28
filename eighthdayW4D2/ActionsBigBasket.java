package assignment.eighthdayW4D2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsBigBasket {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--disable-notifications");	
		ChromeDriver driver=new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.bigbasket.com/");
		
		Actions action = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath("(//span[text()='Shop by'])[2]"));
		action.click(element1).perform();
		Thread.sleep(1000);
		
		//Mouse over "Foodgrains, Oil & Masala".
		WebElement element2 = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		action.moveToElement(element2).perform();
		
		//Mouse over "Rice & Rice Products"
		WebElement element3 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		action.moveToElement(element3).perform();
		
		//Click on "Boiled & Steam Rice".
	    WebElement element4 = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		action.click(element4).perform();
		
		//Filter the results by selecting the brand "bb Royal".
		WebElement element5 = driver.findElement(By.id("i-BBRoyal"));
		action.click(element5).perform();
		Thread.sleep(3000);
		
		//Click on "Tamil Ponni Boiled Rice".
		WebElement element6 = driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']"));
		action.scrollToElement(element6).perform();
		element6.click();
		
		//to handle windows
		Set<String> parentwindow = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(parentwindow);
		driver.switchTo().window(window.get(1));
		Thread.sleep(2000);
		
		//Select the 5 Kg bag.
		WebElement element7 = driver.findElement(By.xpath("//span[text()='5 kg']"));
		action.click(element7).perform();
		
		//Check and note the price of the rice.
		WebElement element8 = driver.findElement(By.xpath("(//span[contains(@class,'5 gJxZPQ bvikaK')])[5]"));
		String price = element8.getText();
		System.out.println("Rate for 5KG  "+price);
		Thread.sleep(2000);
		
		//Click "Add" to add the bag to your cart.
		WebElement element10 = driver.findElement(By.xpath("//button[text()='Add to basket']"));
		action.click(element10).perform();
		Thread.sleep(2000);
		
		//Verify the success message that confirms the item was added to your cart.
		WebElement element11 = driver.findElement(By.xpath("//p[contains(@class,'mx-4 flex-1')]"));
		String message = element11.getText();
		System.out.println("Message  "+message);
		
		//to Take a snapshot of the current page
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snapshot/BigBasket.png");
		FileUtils.copyFile(scr, dest);
		
		driver.close();
		
		driver.switchTo().window(window.get(0));
		
		driver.quit();
	}

}
