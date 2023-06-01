package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\login.feature"},
		
		glue = {"stepdefinitions"}
		
		
		
		
			
		
		)




public class LoginRunner extends AbstractTestNGCucumberTests {

}
