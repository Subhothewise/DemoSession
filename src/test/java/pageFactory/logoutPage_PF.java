package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutPage_PF {
	
	@FindBy(id="logout")
	WebElement txt_logout;
	
	WebDriver driver;
	
	public logoutPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, loginPage_PF.class);
	}
	
	public void checkLogout() {
		txt_logout.isDisplayed();
	}
	
}
