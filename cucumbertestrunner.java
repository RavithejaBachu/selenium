package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"FeatureFile"},
		glue = {"stepdef"},
		//dryRun = true,
		plugin = {"pretty",
				"html:target/cucumber-reports/Cucumber.html",
				"json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",
			
		}
		
		)
	




public class cucumbertestrunner extends AbstractTestNGCucumberTests {

}
