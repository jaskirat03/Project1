package com.section1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L_B49 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream("C:\\\\Users\\\\Jaskirat Singh\\\\Desktop\\\\college\\\\book3.xlsx");
		Workbook book= WorkbookFactory.create(fs);
		Sheet sheet = book.getSheet("sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		String url = cell.getStringCellValue();
		
		Cell cell1 = row.getCell(1);
		String first_name = cell1.getStringCellValue();
		
		Cell cell2 = row.getCell(2);
		String last_name = cell1.getStringCellValue();
		
		Cell cell3 = row.getCell(3);
		String email = cell3.getStringCellValue();
		
		Cell cell4 = row.getCell(4);
		String password = cell4.getStringCellValue();
		
		Cell cell5 = row.getCell(5);
		String date = cell5.getStringCellValue();
		
		Cell cell6 = row.getCell(6);
		String month = cell6.getStringCellValue();
		
		Cell cell7 = row.getCell(7);
		String year = cell7.getStringCellValue();
		
		Cell cell8 = row.getCell(8);
		String gender = cell8.getStringCellValue();
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys(first_name);
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys(last_name);
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys(password);
		
		
		WebElement date1 = driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));
		WebElement month1 = driver.findElement(By.xpath("//select[@aria-label=\"Month\"]"));
		WebElement year1 = driver.findElement(By.xpath("//select[@aria-label=\"Year\"]"));
		
		Select s=new Select(date1);
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
		
		
	}
}

