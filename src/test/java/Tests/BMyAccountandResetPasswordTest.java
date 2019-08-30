package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.AUserHomePage;
import Pages.BUserRegistrationPage;
import Pages.CUserLoginPage;
import Pages.DUserMyAccountPage;

public class BMyAccountandResetPasswordTest extends TestBase{

	AUserHomePage HomeObject;
	BUserRegistrationPage RegistrationObject;
	CUserLoginPage LogInObject;
	DUserMyAccountPage MyAccountObject;
	
	@Test(priority = 1, alwaysRun =true)
	public void UserRegisteSuc() {

		HomeObject = new AUserHomePage(driver);
		HomeObject.OpenRegistrationPage();
		RegistrationObject = new BUserRegistrationPage(driver);
		RegistrationObject.UserRegistrationPage("Muhammad", "Sultan", "selenuim@gmail.com", "Abc@123456789");
		Assert.assertTrue(RegistrationObject.SucMessage.getText().contains("Your registration completed"));
	}
	@Test(priority = 2)
	public void UserChangePassword() {
		MyAccountObject = new DUserMyAccountPage(driver);
		RegistrationObject.MyAccountPage();
		MyAccountObject.OpenChangePasswordPage();
		MyAccountObject.ChangePasswordFllow("Abc@123456789", "123456789");
		Assert.assertTrue(MyAccountObject.ChangePassResultMsg.getText().contains("Password was changed"));
	}
	@Test (priority = 3)
	public void UserLogOut() {
		RegistrationObject.UserLogOut();
	}
	
	@Test (priority = 4 )
		public void UserLogIn() {
		HomeObject.OpenLogInPage();	
		LogInObject = new CUserLoginPage(driver);
		LogInObject.UserLogInPag("selenuim@gmail.com", "123456789");
		Assert.assertTrue(RegistrationObject.LogOutCHK.getText().contains("Log out"));
		}
}
