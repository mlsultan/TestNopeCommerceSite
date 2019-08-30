package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.AUserHomePage;
import Pages.BUserRegistrationPage;
import Pages.CUserLoginPage;

public class AUserRegistewithDDTest extends TestBase{

	AUserHomePage HomeObject;
	BUserRegistrationPage RegistrationObject;
	CUserLoginPage LogInObject;
	
	@DataProvider (name = "TestDataDriven")
	public static Object [][] UserData(){
		return new Object [][] {
			{"Mustafa","Shalaan","mshaalan800@gmail.com","123456"},
			{"Mohamed","Helal","mhela800@gmail.com","123456"},
			{"Muhammad","Sultan","msultan800@gmail.com","Abc@12345"}
		};
	}

	@Test(priority = 1, alwaysRun =true, dataProvider = "TestDataDriven")
	public void UserRegisteSuc(String FirstName,String LastName,String Email,String Password) {

		HomeObject = new AUserHomePage(driver);
		HomeObject.OpenRegistrationPage();
		RegistrationObject = new BUserRegistrationPage(driver);
		RegistrationObject.UserRegistrationPage(FirstName, LastName, Email, Password);
		Assert.assertTrue(RegistrationObject.SucMessage.getText().contains("Your registration completed"));
		RegistrationObject.UserLogOut();
		HomeObject.OpenLogInPage();	
		LogInObject = new CUserLoginPage(driver);
		LogInObject.UserLogInPag(Email, Password);
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
