package com.helloowen;

import com.helloowen.spring.AppConfiguration;
import cucumber.api.CucumberOptions;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber-json-report.json" })
@ContextConfiguration(classes= AppConfiguration.class)
public class RunCucumberTest {
}
