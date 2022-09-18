package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features//Loginfeature.feature",
		glue="StepDefination",
		dryRun=false,
		monochrome=true,
		plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
		
		)
public class TestRun {

}
