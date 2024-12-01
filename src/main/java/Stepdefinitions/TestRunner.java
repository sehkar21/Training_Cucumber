package Stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features ={"C:\\Users\\sehka\\eclipse-workspace\\Trianing-cucumber\\Training_Cucumber\\src\\test\\java\\Features\\OrangeHRM_Login.feature",
				"C:\\Users\\sehka\\eclipse-workspace\\Trianing-cucumber\\Training_Cucumber\\src\\test\\java\\Features\\OrangeHRM_Recruitment.feature"},
		glue = "Stepdefinitions",
		dryRun=false,
		plugin={"pretty", "html:target/cucumber-reports.html"},
		monochrome=true,
		tags="@smoke"
		)


public class TestRunner {
}
