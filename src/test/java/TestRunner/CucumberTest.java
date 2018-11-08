package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "json:target/json/testreport.json"},
        features = "src/test/java/features",
        glue={"TestRunner"},
        tags = {"@Smoke"}

)

public class CucumberTest {

}