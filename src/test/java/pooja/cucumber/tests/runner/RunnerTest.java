package pooja.cucumber.tests.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/pooja/cucumber/demo/tests/feature"},				
		tags="@",
		glue={"pooja.cucumber.demo.tests.stepDefinations.user","pooja.cucumber.demo.tests.base"},
		monochrome = true,
		plugin= {"pretty", "html:target/cucumber/report.html", "json:target/JSONReports/report.json","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
		}
		)

public class RunnerTest {

}
