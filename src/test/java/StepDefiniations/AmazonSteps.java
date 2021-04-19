package StepDefiniations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AmazonSteps {

	@Given("User is on Amazon login page")
	public void user_is_on_amazon_login_page() {
	    System.out.println("First step");
	}

	@Given("Sign in button is avaliable on page")
	public void sign_in_button_is_avaliable_on_page() {
		System.out.println("Second step");
	}

	@When("User click on sign in button")
	public void user_click_on_sign_in_button() {
		System.out.println("Thrd step");
	}

	@Then("User can see login page")
	public void user_can_see_login_page() {
		System.out.println("Forth step");
	}

	@When("User can Enter {string} in username field")
	public void user_can_enter_in_username_field(String string) {
		System.out.println("Fifth step");
	}

	@When("User can Enter {string} in password field")
	public void user_can_enter_in_password_field(String string) {
		System.out.println("Sixth step");
	}

	@When("User click Sign in button")
	public void user_click_sign_in_button() {
		System.out.println("Seventh step");
	}

	@Then("User is on Home Page")
	public void user_is_on_home_page() {
		System.out.println("Eight step");
	}

	@Then("Title of home page is {string}")
	public void title_of_home_page_is(String string) {
		System.out.println("Nine step");
	}

	@Then("Sign is button is not present")
	public void sign_is_button_is_not_present() {
		System.out.println("Ten step");
	}
}
