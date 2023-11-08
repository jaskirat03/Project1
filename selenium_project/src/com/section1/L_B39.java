package com.section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_B39 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Jaskirat%20Singh/Desktop/iframe.html");
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("iphone");
		driver.findElement(By.xpath("(//input[@value=\"Search\"])[1]")).click();
		
		//driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		//driver.findElement(By.xpath("//span[@class=\"bars\"]")).click();
		
		
	}

}
//handling frames
//index will start from 0