package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		Thread.sleep(2000);
	}

//	@When("user enters username and passwords")
//	public void user_enters_username_and_passwords() {
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//	    
//	}
	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_passwords_as(String un, String pass) {
		driver.findElement(By.name("username")).sendKeys("un");
		driver.findElement(By.name("password")).sendKeys("pass");
	    
	}
	

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

	@Then("user should navigate to homepage")
	public void user_should_navigate_to_homepage() {
		
		System.out.println("user is on homepage");
//		WebElement dash= driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
//	    if(dash.isDisplayed()== true) {
//	    	System.out.println("pass");
//	    }
//	    else {
//	    	System.out.println("Fail");
//	    }
	}
}
