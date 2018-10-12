package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        features = "src/test/java/features",
        glue={"TestRunner"},
        tags = {"~@Tabulate", "~@Underscore"}

)

public class CucumberTest {

}