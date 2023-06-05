package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\profile.feature"},
		
		glue = {"stepdefinitions", "hooks"},
		
		plugin = {"pretty"}
		
		
		)

public class ProfileRunner extends AbstractTestNGCucumberTests{

}
