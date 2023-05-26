package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesForHooks/hooksDemo.feature", glue= {"hooks"},
monochrome= true,
plugin= {"pretty","junit:target/JUnitReports/report.xml",
		"html:target/HtmlReports"}
		)

public class TestRunnerForHooksDemo {

}
