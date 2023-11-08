package com.section1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L_B47 {
	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("C:\\Users\\Jaskirat Singh\\Desktop\\college\\data test1.properties");
		Properties pobj=new Properties();
		pobj.load(fs);
		
		String url = pobj.getProperty("url");
		String first_name = pobj.getProperty("first_name");
		String last_name = pobj.getProperty("last_name");
		String mobile_no = pobj.getProperty("mobile_no");
		String password = pobj.getProperty("password");
		String date = pobj.getProperty("date");
		String month = pobj.getProperty("month");
		String year = pobj.getProperty("year");
		String gender = pobj.getProperty("gender");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys(first_name);
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys(last_name);
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys(mobile_no);
		driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys(mobile_no);
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys(password);
		
		
		WebElement date1 = driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));
		WebElement month1 = driver.findElement(By.xpath("//select[@aria-label=\"Month\"]"));
		WebElement year1 = driver.findElement(By.xpath("//select[@aria-label=\"Year\"]"));
		
		
		Select s = new Select(date1);
		s.selectByVisibleText(date);
		
		Select s1=new Select(month1);
		s1.selectByVisibleText(month);
		
		Select s2=new Select(year1);
		s2.selectByVisibleText(year);
		
		if(gender.equals("male")) {
			driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();			
		}
		else {
			driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
		}
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		
	}

}
