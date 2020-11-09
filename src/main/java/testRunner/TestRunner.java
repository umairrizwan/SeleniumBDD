package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C:\\Users\\umair.rizwan\\eclipse-workspace\\Selenium_BDD\\src\\main\\java\\Feature\\taging.feature"//It means where is your feature file
	,glue= {"stepDefinition"},//It means there is your step definition file
	format= {"pretty","html:test-output","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},//to generate different types of reporting
	monochrome = true,//to dispaly the console output in a proper readable format
	dryRun = true,//to check the mapping is proper between feature file and step def file
	tags = {"@Sanity"}
)


public class TestRunner {

}
