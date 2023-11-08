 package com.section1;
import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Browser {
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	
	switch(input) {
	case 1:{
		ChromeDriver driver1 =new ChromeDriver();
		break;
	}
	case 2:{
		EdgeDriver driver2=new EdgeDriver();
		break;
	}
	default: System.out.println("Invalid Input");	
	
	}
	
	}	

}
