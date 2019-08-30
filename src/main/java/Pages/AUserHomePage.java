package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;


public class AUserHomePage extends PagesBase{

	public AUserHomePage(WebDriver Driver) {
		super(Driver);

	}
	@FindAll({
		@FindBy(linkText = "Register"),
		@FindBy(className = "ico-register")
	})
	WebElement RegisterLink;

	@FindAll({
		@FindBy(linkText = "Log in"),
		@FindBy(className = "ico-login")
	})
	
	WebElement LogInLink;

	public void OpenRegistrationPage() {

		ClickButton(RegisterLink);
	}
	public void OpenLogInPage() {

		ClickButton(LogInLink);
	}

}
