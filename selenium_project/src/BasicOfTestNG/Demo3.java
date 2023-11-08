package BasicOfTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo3 {
	
	@Test(invocationCount=1,priority=1)
	public void Register() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Jaskirat");
		driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("0310.jaskiratsingh@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("asdfgh");
		driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("asdfgh");
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
	}
	
	@Test(priority=2)
	public void Login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("0310.jaskiratsingh@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("asdfgh");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	}
	@Test(dependsOnMethods = "Login",priority=3)
	public void AddToCakt() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("0310.jaskiratsingh@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("asdfgh");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		
		driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[1]")).click();
		//driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[2]")).click();
		//driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[3]")).click();
		driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-2\"]")).click();
	}
}


//test report
