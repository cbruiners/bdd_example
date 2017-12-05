package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue= {"stepDefinition"}
		,format = { "pretty",
	    "html:Reports/" }, tags = { "~@ignore" }
		)

public class TestRunner {

}