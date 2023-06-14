package com.POMClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FaceBookWebElements {

	@FindBy(id = "email")
	public static WebElement username;
	
	@FindBy(name = "pass")
	public static WebElement password;
	
	@FindBy(name = "login")
	public static WebElement login;
	
//	public static WebElement username(WebDriver driver) {  //void --> nothing
//
//		return driver.findElement(By.id("email"));
//	}
//	
//	public static WebElement password(WebDriver driver) {
//
//		return driver.findElement(By.name("pass"));
//	}
//	
//	public static WebElement login(WebDriver driver) {
//
//    	return driver.findElement(By.name("login"));
//	}
	
	
}
