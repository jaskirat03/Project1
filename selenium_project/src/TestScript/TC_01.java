package TestScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC_01 extends Baseclass{
	
	@Test
	public void AddToCart() {
		driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("IPhone 15",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Blue, 128 GB)']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Powerbank",Keys.ENTER);
		driver.findElement(By.xpath("(//a[@title=\"Ambrane 10000 mAh Power Bank (12 W, Fast Charging)\"])[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("macbook m1",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='APPLE 2020 Macbook Air M1 - (8 GB/256 GB SSD/Mac OS Big Sur) MGN93HN/A']")).click();

		driver.close();
		
		Set<String> all_id = driver.getWindowHandles();
		for(String id:all_id) {
			driver.switchTo().window(id);
			driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
		}
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
	}
	
}
