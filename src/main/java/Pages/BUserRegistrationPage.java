package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class BUserRegistrationPage extends PagesBase{

	public BUserRegistrationPage(WebDriver Driver) {
		super(Driver);

	}

	@FindBy(id="gender-male")
	WebElement GetGender;

	@FindBy(id="FirstName")
	WebElement FirstNameTXT;

	@FindBy(id="LastName")
	WebElement LastNameTXT;

	@FindBy(id="Email")
	WebElement EmailTXT;

	@FindBy(id="Password")
	WebElement PasswordTXT;

	@FindBy(id="ConfirmPassword")
	WebElement ConfirmPasswordTXT;

	@FindBy(id="register-button")
	WebElement RegisterButton;
	
	@FindBy(className ="result")
	public WebElement SucMessage;
	
	@FindAll({
		@FindBy(linkText = "Log out"),
		@FindBy(className = "ico-logout"),
		@FindBy(css= "ico-logout"),
		@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	})
	 
	public WebElement LogOutCHK;
	
	@FindBy(linkText = "My account")
	public WebElement MyAccountLink;

	public void UserRegistrationPage(String FirstName,String LastName,String Email,String Password ) {
		ClickButton(GetGender);
		SendKey(FirstNameTXT,FirstName);
		SendKey(LastNameTXT, LastName);
		SendKey(EmailTXT, Email);
		SendKey(PasswordTXT, Password);
		SendKey(ConfirmPasswordTXT, Password);
		ClickButton(RegisterButton);
	}

	public void UserLogOut() {
		ClickButton(LogOutCHK);
	}
	
	public void MyAccountPage() {
		ClickButton(MyAccountLink);
	}
}
