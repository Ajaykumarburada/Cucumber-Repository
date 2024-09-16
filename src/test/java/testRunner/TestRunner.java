package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features//Tags.feature",
                 glue="stepDefination",//package name
                 plugin = {"pretty", "html:target/cucumber-reports"},
                 dryRun=false,
                 monochrome=true,
                 tags="@Smoke"
                 )

public class TestRunner {

}
