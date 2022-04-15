package Testclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Requirement", glue ="TestSteps", dryRun=false)

public class TestRunner {

	
}
