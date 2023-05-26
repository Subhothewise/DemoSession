package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("Browser Opened");
	    
	    System.setProperty("webdriver.chrome.driver", "C:/Users/asus/eclipse-workspace/Cucumber_Java/src/test/resources/drivers/chromedriver.exe");
	    driver= new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
	    
	    driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		
	   System.out.println("Google home page appears");
	   driver.navigate().to("https://www.google.com/");
	   
	}

	@When("user enters something in search")
	public void user_enters_something_in_search() throws InterruptedException {
	    
		System.out.println("Enters some text in search bar");
		driver.findElement(By.name("q")).sendKeys("Automation");
		Thread.sleep(1000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
	   
		System.out.println("Entering text and hitting Enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	    
		System.out.println("Navigated to search result page");
		driver.getPageSource().contains("Online Courses");
		
		driver.close();
		
	}


}
