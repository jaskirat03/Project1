package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L_B14 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='course']"));
		
		Select s=new Select(dropdown);
		
		//s.selectByIndex(3); //selectbyindex(); index starts from 0
		//s.selectByValue("net");//selectbyvalue(); in string write value
		s.selectByVisibleText("Dot Net");//selectbyvisibletext(); in string write visible text
		Thread.sleep(2000);
		s.selectByVisibleText("Java");
		
	}

}
//automate dropdown section
