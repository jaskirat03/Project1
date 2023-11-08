package BasicOfTestNG;

import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(priority=2)
	public void Login() {
		System.out.println("Login test case executed successfully");
	}
	@Test(priority=1)
	public void Register() {
		System.out.println("Register test case executed successfully");
	}
	@Test(priority=3)
	public void AddToCart() {
		System.out.println("AddToCart test case executed successfully");
	}
}
