package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@CucumberOptions(features=".\\src\\test\\resources\\features",tags ="@MyAccount", glue = {"TestScripts"})

@CucumberOptions(plugin = {"html:test-output/cucumberreports","json:test-output/cucumberreports/cucumber.json",
"pretty:ttest-output/cucumberreports/cucumber-pretty.txt","junit:test-output/cucumberreports/cucumber-results.xml"},
features=".\\src\\test\\resources\\features",tags ="@AboutUS",glue = {"stepDefinition"})

public class NewRunnerClass extends AbstractTestNGCucumberTests{


}

