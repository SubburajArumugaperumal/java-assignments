package assignment.eighthdayW4D2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsSnapdeal {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--disable-notifications");	
		ChromeDriver driver=new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.snapdeal.com/");
		
		//"Men's Fashion".
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='catText']"))).perform();
		
		//"Sports Shoes".
		action.click(driver.findElement(By.xpath("//span[text()='Sports Shoes']"))).perform();
		
		//Get the count of sports shoes. 
		WebElement element1 = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]"));
		String count = element1.getText();
		System.out.println("Total Count of Sports shoes = "+count);
		
		//"Training Shoes".
		action.click(driver.findElement(By.xpath("//div[text()='Training Shoes']"))).perform();		
		
		//Sort - "Low to High". 
		WebElement element2 = driver.findElement(By.xpath("//div[contains(text(),'Popularity')]"));
		action.click(element2).perform();
		Thread.sleep(2000);
		
		WebElement element3 = driver.findElement(By.xpath("(//li[@data-index='1'])[2]"));
		action.click(element3).perform();
		Thread.sleep(3000);
		
		//items are sorted correctly
		List<WebElement> element4 = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		
		System.out.println("List of Prices Are-");
		for(int i=0; i<element4.size(); i++)
		{
			String pricelist = element4.get(i).getText();
			System.out.println(pricelist);
		}
		
		
		//prange bw ex:(500-700). 
		WebElement element5 = driver.findElement(By.xpath("//input[@name='fromVal']"));
		element5.clear();
		element5.sendKeys("500",Keys.ENTER);
		WebElement element6 = driver.findElement(By.xpath("//input[@name='toVal']"));
		element6.clear();
		element6.sendKeys("700",Keys.ENTER);
		Thread.sleep(2000);
		
		//by any colour. 
		WebElement element7 = driver.findElement(By.xpath("//span[@class='filter-color-tile Black ']"));
		action.click(element7).perform();
		
		//Verify all the applied filters. 
		WebElement element8 = driver.findElement(By.xpath("//div[@class='navFiltersPill']"));
		String filter1 = element8.getText();
		System.out.println("Filter 1 - "+filter1);
		Thread.sleep(2000);
		
		WebElement element9 = driver.findElement(By.xpath("(//div[@class='navFiltersPill'])[2]"));
		String filter2 = element9.getText();
		System.out.println("Filter 2 - "+filter2);
		
		//first resulting "Training Shoes". 
		action.moveToElement(driver.findElement(By.xpath("//img[@class='product-image wooble']"))).perform();
				
		//"Quick View" button. 
		action.click(driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"))).perform();
				
		//Print the cost and the discount percentage. 
		WebElement element12 = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[1]"));
		String price = element12.getText();
		WebElement element13 = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[2]"));
		String discount = element13.getText();
		System.out.println("Price = "+price+ "   "+"Discount = "+discount);
				
		//Take a snapshot of the shoes. 
		File scr = driver.getScreenshotAs(OutputType.FILE);
        File dest=new File("./snapshot/snapdeal.png");
        FileUtils.copyFile(scr,dest);
			
        driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
        
        driver.close();
	}

}
