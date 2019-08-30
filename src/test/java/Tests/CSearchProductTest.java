package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.EUserSearchPage;
import Pages.FUserProductDetailsPage;

public class CSearchProductTest extends TestBase{

	EUserSearchPage SearchObject;
	FUserProductDetailsPage ProductDetailsObject;
	
	@Test
	public void UserProductSearch() {
		SearchObject = new EUserSearchPage(driver);
		ProductDetailsObject = new FUserProductDetailsPage(driver);
		SearchObject.ProductSearch("Apple MacBook Pro 13-inch");
		Assert.assertTrue(ProductDetailsObject.MacProProduct.getText().contains("Apple MacBook Pro 13-inch"));
	}
}
