package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
//		features = {"src\\test\\resources\\execution"},
		
		features = {"@target/FailedRun.txt"},
		
		glue = {"execution"},
		
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
				"rerun:target/FailedRun.txt"}
		
			
		)




public class PolicyBazaarTest extends AbstractTestNGCucumberTests
{
	
	

}
