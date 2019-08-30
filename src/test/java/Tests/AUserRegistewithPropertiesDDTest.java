package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Data.LoadProperties;
import Pages.AUserHomePage;
import Pages.BUserRegistrationPage;
import Pages.CUserLoginPage;

public class AUserRegistewithPropertiesDDTest extends TestBase{

	AUserHomePage HomeObject;
	BUserRegistrationPage RegistrationObject;
	CUserLoginPage LogInObject;
	String FirstName = LoadProperties.UserData.getProperty("FirstName");
	String LastName =LoadProperties.UserData.getProperty("LaastName");
	String Email = LoadProperties.UserData.getProperty("Email");
	String Password = LoadProperties.UserData.getProperty("Password");

	@Test(priority=1,alwaysRun=true)
	public void UserRegisteSuc() 
	{
		HomeObject = new AUserHomePage(driver); 
		HomeObject.OpenRegistrationPage();
		RegistrationObject = new BUserRegistrationPage(driver); 
		RegistrationObject.UserRegistrationPage(FirstName,LastName,Email,Password);
		Assert.assertTrue(RegistrationObject.SucMessage.getText().contains("Your registration completed"));
	}
	@Test (dependsOnMethods = "UserRegisteSuc")
	public void UserLogOut() {
		RegistrationObject.UserLogOut();
	}

	@Test (dependsOnMethods ="UserLogOut", enabled = false )
	public void UserLogIn() {
		HomeObject.OpenLogInPage();	
		LogInObject = new CUserLoginPage(driver);
		LogInObject.UserLogInPag(Email,Password);
		Assert.assertTrue(RegistrationObject.LogOutCHK.getText().contains("Log out"));
	}
	
}
