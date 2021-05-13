package stepdefs;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@CucumberOptions(
    plugin = {"pretty","html:target/html-report","json:target/cucumber.json"},
            features = {"src/test/resources/features/calculator.feature"},
            dryRun = false, glue = {"stepdefs"})

@RunWith(Cucumber.class)
public class RunnerTest {
}
