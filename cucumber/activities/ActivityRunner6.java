package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions.LoginTestSteps"},
    tags = "@SmokeTest",
    plugin = {"pretty", "html: test-reports", "json: test-reports/json-report.json"},
    monochrome = true
)

public class ActivityRunner6 {
}
