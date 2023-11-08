package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_B11 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		 String search = driver.findElement(By.name("q")).getTagName();
//		search.sendKeys("iphone");
//		search.clear();
//		search.sendKeys("laptop");
//		
//		search.submit();
		System.out.println(search);
		
		
	}

}
//submit();
//clear();