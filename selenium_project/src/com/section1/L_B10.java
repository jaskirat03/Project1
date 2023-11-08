package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_B10 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone 15", Keys.ENTER);
		
		WebElement iphone_name = driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Blue, 128 GB)']"));
		
		String name = iphone_name.getText();
		System.out.println(name);
		String price = driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Blue, 128 GB)']//..//..//div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(price);
	}
	
}