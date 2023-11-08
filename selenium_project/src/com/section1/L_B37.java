package com.section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_B37 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.cssSelector("[onclick='pageController.submitForm(); return false;']")).click();

		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class=\"item_link\"])[5]")).click();
		
	}
}
//actitime setting typesofwork 