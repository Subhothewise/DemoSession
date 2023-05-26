package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.loginPage_PF;
import pageFactory.logoutPage_PF;

public class LoginDemoSteps_PF {
	
	WebDriver driver;
	loginPage_PF login;
	logoutPage_PF logout;
	
	@SuppressWarnings("deprecation")
	@Given("google browser is open")
	public void google_browser_is_open() {
		
		System.out.println("==== Inside PF ====");
		
		System.out.println("Browser Opened");
	    
	    System.setProperty("webdriver.chrome.driver", "C:/Users/asus/eclipse-workspace/Cucumber_Java/src/test/resources/drivers/chromedriver.exe");
	    driver= new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@And("user is on the login page")
	public void user_is_on_the_login_page() {		
		System.out.println("User goes to login page");
		
		driver.navigate().to("https://example.testproject.io/web/");
	   
	}

	@When("^user enters the (.*) and (.*)$")        //using regular expression since passing multiple parameters
	public void user_enters_the_id_and_password(String id, String password) throws Exception {
		
		System.out.println("Enters id and password");
		
		login = new loginPage_PF(driver);
		login.enterUsername(id);
		login.enterPassword(password);

	    Thread.sleep(2000);
	    
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() throws Exception {
		
		System.out.println("Clicks on login button");
		login.clickOnLogin();
		Thread.sleep(2000);
	  
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws Exception {
		
		System.out.println("Navigates to home page");
		
		logout.checkLogout();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	    
	}

}
