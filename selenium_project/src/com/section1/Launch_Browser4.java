package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("");
		System.out.println(driver.getTitle());
		
		WebElement search_textField = driver.findElement(By.id("twotabsearchtextbox"));
		search_textField.sendKeys("laptops");
		
		WebElement search_button = driver.findElement(By.id("nav-search-submit-button"));
		search_button.click();
		System.out.println(driver.getTitle());
		
	}
}