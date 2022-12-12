package com.qa.testscripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;
import com.qa.pages.AmazPages;
//import com.qa.pages.AmazonSignIn;
//import com.qa.pages.AmazonSignUp;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Amazon_SignIn_002 extends TestBase{
	AmazPages register;
	@Parameters({"Browser","Url"})
	@Test
	public void signin(String Browser,String Url) throws InterruptedException{

		register=new AmazPages(Driver);
		//Driver.manage().window().maximize();
		System.out.println("Page landed on "+Driver.getTitle());
//		Thread.sleep(2000);
		register.clickHere().click();
		//Thread.sleep(2000);

		register.Fname().sendKeys("Dhatchu");
		register.Mobileno().sendKeys("8880687246");

		register.Email().sendKeys("19f210@kce.ac.in");
		register.password().sendKeys("amazon@123");
		Thread.sleep(2000);
		register.continue1().click();
		Thread.sleep(2000);



	}



}
