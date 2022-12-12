package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazPages  {
	WebDriver Driver;
	 @FindBy(xpath="//input[@id='twotabsearchtextbox']")
 WebElement searchbox;
	 public WebElement SearchBox()
	 { 
		 return searchbox;
	 }
	 @FindBy(xpath="//div[@id='nav-flyout-searchAjax']")
	 List<WebElement> AllItems;
	  
	  public List<WebElement> getAllItems(){
	      return AllItems;
	  }
//	 @FindBy(xpath="//select[@id='searchDropdownBox']")
//	 WebElement Dropdown;
//	 public WebElement Dropdownbox()
//	 {
//		 return Dropdown;
//	 }
//	 @FindBy(xpath="//input[@id='nav-search-submit-button']")
//	 WebElement SearchBtn;
//	 public WebElement SearchButton() {
//			return SearchBtn;
//		}
	 
	 @FindBy(xpath="//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[13]/div[2]/div[1]/a[1]")
	 WebElement Clickhere;
	 public WebElement clickHere() {
		return Clickhere;
		 
	 }
	 
	 @FindBy(xpath="//*[@id=\"ap_customer_name\"]")
	 WebElement Fname;
	 public WebElement Fname() {
		return Fname;
	 }
	 
	 @FindBy(xpath="//*[@id=\"ap_phone_number\"]")
	 WebElement Mobileno;
	 public WebElement Mobileno() {
		return Mobileno;
	 }
		
	 @FindBy(xpath="//*[@id=\"ap_email\"]")
	 WebElement Email;
	 public WebElement Email() {
		return Email;
	 }
	 
	 @FindBy(xpath="//*[@id=\"ap_password\"]")
	 WebElement password;
	 public WebElement password() {
		return password;
	 }
		 
	 @FindBy(xpath="//*[@id=\"continue\"]")
	 WebElement continue1;
	 public WebElement continue1() {
		return continue1;
	 }
		 
	 public AmazPages(WebDriver Driver)
	 {
		 this.Driver=Driver;
		PageFactory.initElements(Driver,this); 
	 }

}
