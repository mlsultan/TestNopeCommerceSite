package Tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {

	public static WebDriver driver;

	@BeforeSuite
	@Parameters ({"Browser"})
	public void StratDriver(@Optional("chrome")String BrowserName) {
		if (BrowserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Resources\\gecko.exe");
			driver = new FirefoxDriver();
		}
		else if (BrowserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Resources\\IE.exe");
			driver = new InternetExplorerDriver();
		}

		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void StopDriver() {
		driver.close();

	}
}
