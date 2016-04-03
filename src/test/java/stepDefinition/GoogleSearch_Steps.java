package stepDefinition;

import appModules.GoogleSearch_Action;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GoogleSearch_Steps {
	
	String website;

	@Given("^I want to go on \"([^\"]*)\"$")
	public void i_want_to_go_on(String website) throws Throwable {
		this.website = website;
	}

	@When("^(?:I|I have) search|searched on Google$")
	public void i_search_on_google() throws Throwable {
		String searchCriteria = website;
		GoogleSearch_Action.search(searchCriteria);
	}
	
	@Then("^I should see the search results for \"([^\"]*)\"$")
	public void i_should_see_the_search_results_for(String searchCriteria) throws Throwable {
	    assertThat(HomePage.searchResultsTitle(), containsString(searchCriteria));
	}

}
