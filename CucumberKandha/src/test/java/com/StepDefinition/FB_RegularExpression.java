package com.StepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;
import com.POMClass.FaceBookWebElements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FB_RegularExpression extends BaseClass {

	@Given("Open Chrome Browser and login page")
	public void open_chrome_browser_and_login_page() throws IOException {
		browserLaunch();
		FileInputStream fis =
		new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\CucumberKandha\\src\\main\\java\\FBCredentials.properties");
		Properties p = new Properties();
		p.load(fis);
		getUrl(p.getProperty("URL"));
	}

	@When("The username is {string}")
	public void the_username_is(String uname) {
		PageFactory.initElements(driver, FaceBookWebElements.class);
	    FaceBookWebElements.username.sendKeys(uname);
	}

	@When("The password is {string}")
	public void the_password_is(String pass) {
	    FaceBookWebElements.password.sendKeys(pass);
	}

	@When("press the login button")
	public void press_the_login_button() {
		 FaceBookWebElements.login.click();
	}
}
