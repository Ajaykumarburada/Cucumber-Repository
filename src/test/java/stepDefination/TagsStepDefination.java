package stepDefination;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefination {
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		System.out.println("user is on login pag");
	}
	
	@When("user enters valid data")
	public void user_enters_valid_data() {
		System.out.println("user enters valid data");
	    
	}

	@When("click on login")
	public void click_on_login() {
		System.out.println("click on login");
	    
	}

	@Then("user login successfully")
	public void user_login_successfully() {
		System.out.println("user login successfully");
	    
	}


}
