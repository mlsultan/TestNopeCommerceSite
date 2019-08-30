package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FUserProductDetailsPage extends PagesBase{

	public FUserProductDetailsPage(WebDriver Driver) {
		super(Driver);
		
	}

	@FindBy (linkText = "Apple MacBook Pro 13-inch")
	public WebElement MacProProduct;
}
