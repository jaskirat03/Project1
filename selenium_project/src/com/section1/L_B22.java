package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L_B22 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
		
		WebElement fashion = driver.findElement(By.xpath("//div[@aria-label=\"Fashion\"]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(fashion).perform();
		
		WebElement men = driver.findElement(By.linkText("Men's T-Shirts"));
		act.moveToElement(men).click().perform();
	}

}