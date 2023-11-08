package BasicOfTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo6 {
	
	@Test
	public void Logout() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("0310.jaskiratsingh@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("asdfgh");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		driver.findElement(By.xpath("//a[@class=\"ico-logout\"]")).click();
		
	}
}

