package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.AUserHomePage;
import Pages.BUserRegistrationPage;
import Pages.CUserLoginPage;

public class AUserRegisteandLogInOutWorkFlowTest extends TestBase{

	AUserHomePage HomeObject;
	BUserRegistrationPage RegistrationObject;
	CUserLoginPage LogInObject;
	


	@Test(priority = 1, alwaysRun =true )
	public void UserRegisteSuc() {

		HomeObject = new AUserHomePage(driver);
		HomeObject.OpenRegistrationPage();
		RegistrationObject = new BUserRegistrationPage(driver);
		RegistrationObject.UserRegistrationPage("Mustafa","Shalaan","mshaalan800@gmail.com","123456");
		Assert.assertTrue(RegistrationObject.SucMessage.getText().contains("Your registration completed"));
		RegistrationObject.UserLogOut();
		HomeObject.OpenLogInPage();	
		LogInObject = new CUserLoginPage(driver);
		LogInObject.UserLogInPag("mshaalan800@gmail.com","123456");
		Assert.assertTrue(RegistrationObject.LogOutCHK.getText().contains("Log out"));
		RegistrationObject.UserLogOut();
		
	}
	
//	@Test (dependsOnMethods = "UserRegisteSuc")
//	public void UserLogOut() {
//		
//	}
//	
//	@Test (dependsOnMethods ="UserLogOut", enabled = false )
//		public void UserLogIn() {
//		
//		}
//	
}
