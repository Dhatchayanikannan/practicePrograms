//package com.qa.testscripts;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//public class AmazonHomePage {
//
//	public static void main(String[] args) {
//		//  TODO Auto-generated method stub
////System.setProperty("webdriver.chrome.driver","C:\\Webdriver\\chromedriver.exe");
////		
////		WebDriver driver = new ChromeDriver();
////		driver.get("http://www.amazon.com");
////		
////		System.out.println(driver.getTitle());
//////		
////System.setProperty("webdriver.edge.driver","C:\\Webdriver\\msedgedriver.exe");
////		
////		//WebDriver driver1 = new edgeDriver();
////		WebDriver driver1 = new EdgeDriver();
////		driver1.get("http://www.amazon.com");
////		
////		System.out.println(driver1.getTitle());
//		
////System.setProperty("webdriver.gecko.driver","C:\\Webdriver\\geckodriver.exe");
////		
////		WebDriver driver2 = new FirefoxDriver();
////		driver2.get("http://www.amazon.in");
////		
////		System.out.println(driver2.getTitle());
//		//driver2.close();
//		
////		String browser="Chrome";
////		ChromeDriver driver =null;
////		if(browser.equalsIgnoreCase("Chrome")) {
////			System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe");
////			driver=new ChromeDriver();
////		}
////		driver.get("http://www.flipkart.in");
////		driver.close();
//		
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\\\Webdriver\\\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://www.amazon.in");
//		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")).click();
//		driver.findElement(By.id("ap_email")).sendKeys("dhatchayanikannan@gmail.com");
//		driver.findElement(By.id("continue")).click();
//		driver.findElement(By.id("ap_password")).sendKeys("amazon@123");
//		driver.findElement(By.id("signInSubmit")).click();
//		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("home appliances");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		//System.out.println(driver.getTitle());
//		//driver.close();
//		WebElement f1=driver.findElement(By.id("n/976442031"));
//		f1.click();
//		WebElement f2=driver.findElement(By.id("p_90-title"));
//		f2.click();
//		WebElement lp=driver.findElement(By.id("low-price"));
//		lp.sendKeys("500");
//		WebElement hp=driver.findElement(By.id("high-price"));
//		hp.sendKeys("1500");
//		driver.findElement(By.xpath("1")).click();
//		
//				
//	}
//
//	
//
//}
