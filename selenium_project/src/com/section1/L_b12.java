package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_b12 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		 
		
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));	
		checkbox.click();
		if (checkbox.isSelected()) {
			System.out.println("checkbox is selected");
		}
		else {
			System.out.println("checkbox is not selected");
		}
	
	}

}