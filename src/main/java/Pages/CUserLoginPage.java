package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CUserLoginPage extends PagesBase{

	public CUserLoginPage(WebDriver Driver) {
		super(Driver);
		
	}
	@FindBy (id="Email")
	WebElement EmailLoginTxt;

	@FindBy (id="Password")
	WebElement PasswordLoginTxt;
	
	@FindBy (id="RememberMe")
	WebElement RememberMeCB;
	
	@FindBy (xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input")
	WebElement LogInBTN;
	
	public void UserLogInPag (String Email,String Password) {
		SendKey(EmailLoginTxt, Email);
		SendKey(PasswordLoginTxt, Password);
		ClickButton(RememberMeCB);
		ClickButton(LogInBTN);
	}


}
