package com.section1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_B35 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 15", Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Blue, 128 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Black, 128 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 Pro (Black Titanium, 128 GB)']")).click();
		
		String Flipkart_id = driver.getWindowHandle();
		
		Set<String> all_id = driver.getWindowHandles();
		
		
		for(String id : all_id) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains("APPLE iPhone 15 (Blue, 128 GB) | Flipkart")){
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			}
			else if(driver.getTitle().contains("APPLE iPhone 15 | Flipkart")){
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			}
			else if(driver.getTitle().contains("APPLE iPhone 15 Pro | Flipkart")){
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			}
		}
		

	}
}

//flipkart add 3 productss