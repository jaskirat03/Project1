package com.section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L_B7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("[placeholder='Username']"))));
		
		System.out.println(driver.getTitle());
		WebElement username = driver.findElement(By.cssSelector("[placeholder='Username']"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.cssSelector("[placeholder='Password']"));
		password.sendKeys("manager");
		driver.findElement(By.cssSelector("[onclick='pageController.submitForm(); return false;']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("container_tasks"))));
		//Thread.sleep(4000);
		driver.findElement(By.id("container_tasks")).click();
		
		//Thread.sleep(3000);
		driver.findElement(By.className("addNewButton")).click();
		
		//Thread.sleep(3000);
		driver.findElement(By.className("createNewCustomer")).click();
		
		//Thread.sleep(3000);
		WebElement Enter_Name = driver.findElement(By.className("inputNameField"));
		Enter_Name.sendKeys("Jaskirat");
		
		//Thread.sleep(3000);
		driver.findElement(By.className("commitButtonPlaceHolder")).click();
		
		
	}
}
