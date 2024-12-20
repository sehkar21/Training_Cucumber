package Stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features ={"src\\test\\java\\Features\\OrangeHRM_Login.feature",
				"src\\test\\java\\Features\\OrangeHRM_Recruitment.feature",
				"src\\test\\java\\Features\\MyInfoPage.feature",
				"src\\test\\java\\Features\\OrangeHRM_AddEmployee.feature"},
		glue = {"Stepdefinitions","Hooks"},
		dryRun=false,
		plugin={"pretty", "html:target/cuucmber-reports/cucumber-reports.html",
				"json:target/cuucmber-reports/cucumber-reports.json",
				"junit:target/cuucmber-reports/cucumber-reports.xml"},
		tags = ("@adhoc or ~@sanity"),
		monochrome=true
		
		)


public class TestRunner {
}
