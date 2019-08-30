package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EUserSearchPage extends PagesBase{

	public EUserSearchPage(WebDriver Driver) {
		super(Driver);
		
	}

	@FindBy(id = "small-searchterms")
	WebElement SearchButtonTXT;
	
	@FindBy(xpath = "//*[@id=\"small-search-box-form\"]/input[2]")
	WebElement SearchBTN;
	
	@FindBy(id="ui-id-2")
	WebElement SearchAutoSugTXT;
	
	public void ProductSearch (String ProductName) {
		SendKey(SearchButtonTXT, ProductName);
		ClickButton(SearchBTN);
	}
}
