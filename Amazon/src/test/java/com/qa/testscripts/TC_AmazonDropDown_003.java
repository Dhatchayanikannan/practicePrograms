package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazPages;

public class TC_AmazonDropDown_003 extends TestBase {
	AmazPages register;
	@Parameters({"Browser","Url"})
	@Test
	public void amazonSearch(String Browser,String Url) throws InterruptedException {
		register=new AmazPages(Driver);
		
		register.SearchBox().sendKeys("Realme mobiles");
		List<WebElement> AllItems =register.getAllItems();
		Thread.sleep(2000);
		System.out.println("Total no. of items loaded are : " + AllItems.size());
		 Thread.sleep(3000);
		for(WebElement item: AllItems) {
			System.out.println(item.getText());
		}
		
		
		
	}

}
