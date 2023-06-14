package com.StepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;
import com.POMClass.FaceBookWebElements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FB_StepDefinition extends BaseClass{
	
	@Given("Open Chrome Browser")
	public void open_chrome_browser() throws IOException {
		browserLaunch();
		FileInputStream fis =
		new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\CucumberKandha\\src\\main\\java\\FBCredentials.properties");
		Properties p = new Properties();
		p.load(fis);
		getUrl(p.getProperty("URL"));
	}

	@When("Pass the Valid username")
	public void pass_the_valid_username() throws IOException {
		PageFactory.initElements(driver, FaceBookWebElements.class);
		FileInputStream fis =
				new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\CucumberKandha\\src\\main\\java\\FBCredentials.properties");
				Properties p = new Properties();
				p.load(fis);
	    FaceBookWebElements.username.sendKeys(p.getProperty("Username"));
	}

	@When("Pass the valid password")
	public void pass_the_valid_password() throws IOException {
		FileInputStream fis =
				new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\CucumberKandha\\src\\main\\java\\FBCredentials.properties");
				Properties p = new Properties();
				p.load(fis);
	   FaceBookWebElements.password.sendKeys(p.getProperty("Password"));
	}

	@When("click the login button")
	public void click_the_login_button() {
	    FaceBookWebElements.login.click();
	}

	@Then("User has to go home page")
	public void user_has_to_go_home_page() {
	//  assertEquals(driver.getTitle(), "Facebook Homepage");
	}

}
