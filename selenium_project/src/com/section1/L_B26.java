package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L_B26 {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement button = driver.findElement(By.xpath("//li[text()='B']"));
		
		WebElement button1 = driver.findElement(By.xpath("//li[text()='A']"));
		Actions act=new Actions(driver);
		act.clickAndHold(button).perform();
		act.clickAndHold(button1).perform();
		
		
		
	}
}
