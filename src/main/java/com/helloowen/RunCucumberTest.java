package com.helloowen;

import com.helloowen.angular.material.test.spring.AppConfiguration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber-report", "json:target/cucumber.json"}, features = "src/main/resources/features/")
@ContextConfiguration(classes = AppConfiguration.class)
public class RunCucumberTest {
}
