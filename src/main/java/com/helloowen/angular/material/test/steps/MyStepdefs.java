package com.helloowen.angular.material.test.steps;

import com.helloowen.freshwater.Browser;
import com.helloowen.angular.material.test.spring.AppConfiguration;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes= AppConfiguration.class)
public class MyStepdefs {

    @Given("^I visit a page with url \"([^\"]*)\"$")
    public void I_visit_a_page_with_url(String url) throws Throwable {
//        Browser.getBrowser().get(url);
    }

    @When("^I click input field$")
    public void I_click_input_field() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^I can see the drop down list$")
    public void I_can_see_the_drop_down_list() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^I choose \"([^\"]*)\" in the drop down list$")
    public void I_choose_in_the_drop_down_list(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^I can see \"([^\"]*)\" is in the input field$")
    public void I_can_see_is_in_the_input_field(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

}
