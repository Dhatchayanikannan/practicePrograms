package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.AmazPages;
import com.qa.pages.AmazonPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	AmazPages register;
	WebDriver Driver;
	@Parameters({"Browser","Url"})
  @BeforeClass
  public void Setup(String Browser,String Url)throws IOException
  {
	  if(Browser.equalsIgnoreCase("Chrome"))
	  {
		  WebDriverManager.chromedriver().setup();
		  Driver=new ChromeDriver();
	  }
	  else if(Browser.equalsIgnoreCase("firefox"))
	  {
		  WebDriverManager.firefoxdriver().setup();
		  Driver=new FirefoxDriver();
	  }
	  AmazPages register=new AmazPages(Driver);
	  Driver.manage().window().maximize();
	  Driver.get(Url);
	
  }
	@AfterClass
	public void TearDown() 
	{
		Driver.close();
	}
}