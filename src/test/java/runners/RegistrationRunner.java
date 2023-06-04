package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\Registration.feature"},
		
		glue = {"stepdefinitions"},
		
		plugin = {"pretty"}
		
		
		)
public class RegistrationRunner extends AbstractTestNGCucumberTests
{
	

}
