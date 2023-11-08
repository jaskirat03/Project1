package com.section1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_B32 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[@class=\"_30XB9F\"]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 15",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Blue, 128 GB)']")).click();
		
		String window_id = driver.getWindowHandle();
		//System.out.println(window_id);
		
		 Set<String> all_id = driver.getWindowHandles();
		//System.out.println(all_id);
		for(String id:all_id) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains("APPLE iPhone 15 (Blue, 128 GB) | Flipkart")) {
				break;
			}
			
		}
		
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
		driver.switchTo().window(window_id);
		driver.findElement(By.className("_3SkBxJ")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
		
		
		
	}

	

}  
