package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFile/FBRegularExpression.feature",
glue = "com.StepDefinition", monochrome = true,
plugin = {"html: Report/FB_RegularExpression.html"})
public class RunnerClass {

}
