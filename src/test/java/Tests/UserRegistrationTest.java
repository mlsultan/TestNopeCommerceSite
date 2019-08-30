
package Tests;

import org.testng.Assert; import org.testng.annotations.Test; import
Pages.AUserHomePage; import Pages.BUserRegistrationPage; import
Pages.CUserLoginPage;


public class UserRegistrationTest extends TestBase{ AUserHomePage HomeObject;
BUserRegistrationPage RegistrationObject; CUserLoginPage LogInObject;

@Test(priority=1,alwaysRun=true) 
public void UserRegisteSuc() { HomeObject = new AUserHomePage(driver); 
HomeObject.OpenRegistrationPage();
RegistrationObject = new BUserRegistrationPage(driver);
RegistrationObject.UserRegistrationPage("Muammad", "Sultan","selenum.test222222@gmail.com", "12345678");
Assert.assertTrue(RegistrationObject.SucMessage.getText().contains("Your registration completed")); }

@Test(dependsOnMethods= {"UserCanRegisterSuccssfully"}) 
public void
RegisteredUserCanLogout() { RegistrationObject.UserLogOut(); }

@Test(dependsOnMethods= {"RegisteredUserCanLogout"}) 
public void
RegisteredUserCanLogin() { HomeObject.OpenLogInPage(); 
LogInObject = new CUserLoginPage(driver); LogInObject.UserLogInPag("selenium.test@gmail.com","12345678");
Assert.assertTrue(RegistrationObject.LogOutCHK.getText().contains("Log out")); 
}
} 

