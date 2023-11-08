package com.section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser2 {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/");
		//driver.get("https://www.amazon.in/");
		//driver.get("www.google.com");//invalid argument exception because we did not give correct url.
		//driver.get("https://www.tradingview.com");
		//driver.get("https://www.youtube.com/watch?v=JPwm-tlY_i0&ab_channel=CARachanaPhadkeRanade");
		//System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
//		if(driver.getTitle().equals("Instagram")) {
//			
//			System.out.println("Passed");
//		}
//		else {
//			System.out.println("Fail");
//		}
	}
}
