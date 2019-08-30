package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DUserMyAccountPage extends AUserHomePage{

	public DUserMyAccountPage(WebDriver Driver) {
		super(Driver);

	}
	@FindBy (linkText = "Change password")
	WebElement ChangePasswordLink;

	@FindBy (id="OldPassword")
	WebElement OldPassTXT;

	@FindBy (id = "NewPassword")
	WebElement NewPassTXT;

	@FindBy (id="ConfirmNewPassword")
	WebElement ConfirmPassTXT;

	@FindBy (xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/input")
	WebElement ChangePassBTN;

	@FindBy (className ="result")
	public WebElement ChangePassResultMsg;


	public void OpenChangePasswordPage() {

		ClickButton(ChangePasswordLink);
	}

	public void ChangePasswordFllow(String OldPass, String NewPass) {
		SendKey(OldPassTXT, OldPass);
		SendKey(NewPassTXT, NewPass);
		SendKey(ConfirmPassTXT, NewPass);
		ClickButton(ChangePassBTN);
	}
}
