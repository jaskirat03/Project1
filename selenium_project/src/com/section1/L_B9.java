package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_B9 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone 15");
		//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@value='Go']")).click();

		String name = driver.findElement(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Blue'])[1]")).getText();
		
		
		
		String price = driver.findElement(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Blue'])[1]/../../../..//span[@class=\"a-price-whole\"]")).getText();
		
		System.out.println(name+"---> "+ price);
		
		
		
	}

}

//dynamic traversing 
//forward and backword traversing
