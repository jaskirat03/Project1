package com.section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_B40 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.cssSelector("[onclick='pageController.submitForm(); return false;']")).click();
		
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("(//div[@class=\"img\"])[2]")).click();
		driver.findElement(By.xpath("//div[@class=\"delete button\"]")).click();
		Thread.sleep(2000);
			
		
		
		String text = driver.findElement(By.xpath("//div[contains(text(),'You are about to delete a task' )]")).getText();
		System.out.println(text);
	}
}


//WebDriverWait wait = new WebDriverWait(w1,Duration.ofSeconds(10));
//wait.until(ExpectedConditions.visibilityOf(w1.findElement(By.xpath("//div[contains(text(),'You are about to delete 68 tasks')]"))));
