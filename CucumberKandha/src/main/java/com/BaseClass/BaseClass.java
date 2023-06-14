package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	public static WebDriver driver;
	
	public static void browserLaunch() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
	}
	
	public static void getUrl(String url) {
     driver.get(url);   
	}
	
	public static void getTitle() {
        String title = driver.getTitle();
        System.out.println(title);
	}
	
	public static void getCurrentUrl() {
         String url = driver.getCurrentUrl();
         System.out.println(url);
	}
	
	public static void sleep(long sec) throws InterruptedException {
         Thread.sleep(sec);
	}
	
	public static void navigateTo(String url) {
         driver.navigate().to(url);
	}
	
	public static void navigateBack() {
         driver.navigate().back();
	}
	
	public static void navigateForward() {
          driver.navigate().forward();
	}
	
	public static void close() {
          driver.close();
	}
}
