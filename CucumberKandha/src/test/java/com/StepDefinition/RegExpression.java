package com.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegExpression {

	@Given("My name is {string}")
	public void my_name_is(String name) {
	   System.out.println("My name is: "+name);
	}

	@When("My age is {int}")
	public void my_age_is(Integer age) {
	 System.out.println("My age is: "+age);  
	}

	@When("My number is {long}")
	public void my_number_is(Long num) {
	    System.out.println("My number is: "+num);
	}

	@When("My CGPA is {double}")
	public void my_cgpa_is(Double cgpa) {
	 System.out.println("My cgpa is: "+cgpa);  
	}
}
