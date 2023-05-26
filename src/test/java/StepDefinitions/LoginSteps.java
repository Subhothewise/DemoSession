package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {

		System.out.println("User is on login page");
	}

	@When("user enters the valid id and password")
	public void user_enters_the_valid_id_and_password() {

		System.out.println("User enters valid id and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {

		System.out.println("Clicks on login button");
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {

		System.out.println("User navigates to homepage");
	}

}
