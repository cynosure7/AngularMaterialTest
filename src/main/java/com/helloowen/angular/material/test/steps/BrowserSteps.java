package com.helloowen.angular.material.test.steps;

import com.helloowen.freshwater.Browser;
import com.helloowen.freshwater.steps.SpringBootSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class BrowserSteps extends SpringBootSteps {

    @Autowired
    private Browser browser;

    private Class<?> getViewClass(String viewClassName) {
        String viewClassPath = this.getClass().getPackage().getName().replace(".steps", ".view.") + viewClassName;
        try {
            return Class.forName(viewClassPath);
        } catch (ClassNotFoundException e) {
            throw new StepException("Failed to find view class: " + viewClassName, e);
        }
    }

    @Given("^I visit url \"([^\"]*)\"$")
    public void I_visit_url(String url) throws Throwable {
        browser.visit(url);
    }

    @Then("^I should see a \"([^\"]*)\"$")
    public void I_should_see_a(String viewName) throws Throwable {
        Object view = browser.findView(getViewClass(viewName.replaceAll("\\s+", "")));
    }
}
