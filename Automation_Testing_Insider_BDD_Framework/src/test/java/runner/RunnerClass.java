package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "./Features" }, glue = {
		"stepDefinations" }, monochrome = true, dryRun = false, plugin = { "html:Reports/HTMLReports",
				"json:Reports/Cuumber.json", "junit:Reports/JunitReports/Cucumber.xml" })
public class RunnerClass {

}