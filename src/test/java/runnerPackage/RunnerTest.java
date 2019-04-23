package runnerPackage;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features", 
				 glue = "stepDefinition", 
				 tags = "@smoke", 
				 dryRun = false, 
				 plugin = {
						"pretty", 
						"html:target/cucumber", 
						"json:target/cucumber/cucumber.json", 
						"pretty:target/cucumber/cucumber-pretty.txt",
						"usage:target/cucumber/cucumber-usage.json", 
						"junit:target/cucumber/cucumber-results.xml" 
		})
public class RunnerTest {

}
