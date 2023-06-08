package execution;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class AppHooks {
	
	WebDriver driver;
	
	@Before
	public void launchBrowser()
	{
		DriverFactory df = new DriverFactory();
		
		 driver = df.initBrowser();
		
		driver.manage().window().maximize();
		
	}
	
	@After
	public void quitBrowser()
	{
		driver.quit();
	}

}
