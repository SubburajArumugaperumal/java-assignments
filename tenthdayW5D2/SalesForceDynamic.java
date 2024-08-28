package assignment.tenthdayW5D2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesForceDynamic extends ProjectSpecificMethod {
	
	@DataProvider(name = "Legal Entity name")
	public String[][] createEntity() {
		String[][] data = new String[][] { { "SalesForce Automation by Subburaj" },
				{ "SalesForce Automation by Subburaj" } };
		return data;
	}
	
	@Test(dataProvider = "Legal Entity name")
	public void salesForce(String value) throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		WebElement legalEntities = driver.findElement(By.xpath("//p[contains(text(),'Legal E')]"));
		Actions action = new Actions(driver);
		action.scrollToElement(legalEntities).perform();
		legalEntities.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[14]")).click();
		Thread.sleep(2000);
		
		WebElement legalEntity = driver
				.findElement(By.xpath("(//one-app-nav-bar-menu-item[@class='slds-dropdown__item'])[1]"));
		legalEntity.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@name='Name']"));
		name.sendKeys(value);
	
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		save.click();
		
		WebElement text = driver.findElement(By.xpath(
				"//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']"));
		String LEN = text.getText();
		System.out.println(LEN);
		
	}

}
