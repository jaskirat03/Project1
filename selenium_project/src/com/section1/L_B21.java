package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L_B21 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
		
		WebElement fashion = driver.findElement(By.xpath("//div[@aria-label=\"Fashion\"]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(fashion).perform();
		
		driver.findElement(By.partialLinkText("Men's T-Shirts")).click();
		
	}

}
//movetoelement();