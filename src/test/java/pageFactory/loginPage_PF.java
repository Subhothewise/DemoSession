package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage_PF {
	
	@FindBy(id="name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login")
	WebElement txt_login;
	
	WebDriver driver;
	
	public loginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String id) {
		txt_username.sendKeys(id);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	
	}
	
	public void clickOnLogin() {
		txt_login.click();
	}
}
