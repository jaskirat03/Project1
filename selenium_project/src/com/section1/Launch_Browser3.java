package com.section1;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser3 {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.get("https://www.amazon.in/");
		
		//System.out.println(driver.getPageSource());// getPageSource();
	
//		Options man = driver.manage();
//		Window win = man.window();
//		 
//		win.maximize();
		
		//Dimension dim=new Dimension(1500,800);
		//driver.manage().window().setSize(dim);
		//driver.quit();
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.navigate().to("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		WebElement button = driver.findElement(By.id("nav-search-submit-button"));
		button.click();
		
		
	}
}
