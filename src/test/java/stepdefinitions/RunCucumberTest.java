package stepdefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/functionalTests",
        glue = {"stepdefinitions"},
        monochrome = true,
        strict = true,
        plugin = {"pretty"}
)
public class RunCucumberTest {

}
