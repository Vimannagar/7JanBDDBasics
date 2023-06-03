package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\Orders.feature"},
		
		glue = {"stepdefinitions"},
		
		plugin = {"pretty"}
		
		
		)


public class OrdersRunner extends AbstractTestNGCucumberTests {

}
