package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignUp {
 WebDriver driver;
 @FindBy(xpath="//a[@id='nav-link-accountList']")
 WebElement signin;
 public WebElement signIn() {
	 return signin;
 }
 @FindBy(xpath="//input[@id='ap_email']")
 WebElement Email;
 public WebElement eMail()
 {
	 return Email;
 }
 @FindBy(xpath="//input[@id='continue']")
 WebElement Ebtn;
 public WebElement eBtn()
 {
	 return Ebtn;
 }
 @FindBy(xpath="//input[@id='ap_password']")
 WebElement Password;
 public WebElement passWord() {
	 return Password;
 }
 @FindBy(xpath="//input[@id='signInSubmit']")
 WebElement ctn;
 public WebElement continueBtn(){
	 return ctn;
 }
 public AmazonSignUp(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
}
