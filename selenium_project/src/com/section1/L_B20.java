package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L_B20 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel=\"async\"]")).click();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(dropdown);
		s.selectByVisibleText("3");
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select m = new Select(month);
		m.selectByVisibleText("Oct3 ");
		
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select y = new Select(year);
		y.selectByVisibleText("2001");
	}

}
