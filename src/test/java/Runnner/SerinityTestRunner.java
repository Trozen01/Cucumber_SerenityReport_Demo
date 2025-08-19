package Runnner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin={"pretty"},
		glue="StepDefiniations",
		features="C:/Jitu/Work/SoftwareTesting/Practical/Cucumber_SerenityReport_Demo/src/test/resources/Features/Amazon.feature",
		monochrome=true
		)
public class SerinityTestRunner {

}
