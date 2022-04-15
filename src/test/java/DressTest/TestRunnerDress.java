package DressTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Requirement/Dresspage.feature", glue = "DresspageSteps", dryRun = false)
public class TestRunnerDress {

}
