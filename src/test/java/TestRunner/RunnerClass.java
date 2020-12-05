package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(plugin = {"html:test-output/cucumberreports","json:test-output/cucumberreports/cucumber.json",
"pretty:test-output/cucumberreports/cucumber-pretty.txt","junit:test-output/cucumberreports/cucumber-results.xml"},
features=".\\src\\test\\resources\\features",tags ="@BusSearch",glue = {"stepDefinition"})
public class RunnerClass extends AbstractTestNGCucumberTests{


}