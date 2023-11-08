package BasicOfTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void Login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@class=\"password\"]")).sendKeys("sdfghjk");
		
	}
	@Test
	public void register() {
		System.out.println("Registed test case successful");
		
	}
}
