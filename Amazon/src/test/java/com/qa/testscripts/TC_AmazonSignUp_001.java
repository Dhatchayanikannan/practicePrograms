package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pages.AmazonSignUp;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_AmazonSignUp_001 {
@Test
public void Si() {
WebDriverManager.chromedriver().setup();

WebDriver driver=new ChromeDriver();
AmazonSignUp sign=new AmazonSignUp(driver);
driver.get("https://www.amazon.in/");
System.out.println("Page landed on "+driver.getTitle());

sign.signIn().click();
sign.eMail().sendKeys("dhatchayanikannan@gmail.com");
sign.eBtn().click();
sign.passWord().sendKeys("amazon@123"); 
sign.continueBtn().click();
//sign.Password().sendKeys("amazon@123");
//System.out.println(driver.getTitle());
//sign.Continue().click();
}
}
