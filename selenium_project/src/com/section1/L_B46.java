package com.section1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_B46 {
	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("C:\\Users\\Jaskirat Singh\\Desktop\\college\\Test data.properties");
		Properties pobj=new Properties();
		pobj.load(fs);
		String url = pobj.getProperty("url");
		//System.out.println(url);
		
		String username = pobj.getProperty("username");
		String password = pobj.getProperty("password");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		WorkbookFactory.create(false);
		
		
	}
}
//FETCH DATA FROM PROPERTIES