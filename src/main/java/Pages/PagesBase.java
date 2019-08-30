package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PagesBase {

	protected WebDriver Driver;
	// Create Constructor 
	public PagesBase (WebDriver Driver) {
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
	}

	protected static void ClickButton(WebElement Button) {
		Button.click();
	}
	
	protected static void SendKey(WebElement TXT, String Value) {
		TXT.sendKeys(Value);
	}
}
