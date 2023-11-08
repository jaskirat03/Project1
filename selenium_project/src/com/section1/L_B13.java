package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_B13 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		 
		
		WebElement username = driver.findElement(By.name("username"));	
		WebElement password = driver.findElement(By.name("pwd"));	
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		checkbox.click();
		
		if (username.isEnabled()) {
			username.sendKeys("admin");
		}
		else {
			System.out.println("Webelement is disabled");
		}
		if(password.isEnabled()) {
			password.sendKeys("manager");
		}
		else {
			System.out.println("password is not enabled");
		}
		
		if (checkbox.isSelected()) {
			System.out.println("checkbox is selected");
		}
		else {
			System.out.println("checkbox is not selected");
		}
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		
		WebElement logo = driver.findElement(By.className("atLogoImg"));
		if(logo.isDisplayed()) {
			System.out.println("logo is displayed");
		}
		else {
			System.out.println("logo is not displayed");
		}
		
		 String place_holder = driver.findElement(By.name("username")).getAttribute("placeholder");
		System.out.println(place_holder);
		
	
	}

}