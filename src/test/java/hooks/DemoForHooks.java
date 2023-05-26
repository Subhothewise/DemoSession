package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class DemoForHooks {
	
	
	WebDriver driver;
	
	@Before
	public void browserSetup() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
	
	@After
	public void teardown() {
		
		driver.close();
		driver.quit();
	}
	
	@BeforeStep
	public void beforeSteps() {
		
		System.out.println(" I am inside before Steps ");
	}
	
	@AfterStep
	public void afterSteps() {
		
		System.out.println(" I am inside after Steps");
	}
	
	@Given("user goes to the login page")
	public void user_goes_to_the_login_page() {
	   
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	  
	}

	@And("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	   
	}

	@Then("user is directed to the homepage")
	public void user_is_directed_to_the_homepage() {
	    
	}

}
