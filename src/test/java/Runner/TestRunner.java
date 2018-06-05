package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by akshay.pokley on 6/5/2018.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "functionalTests"
        ,glue= {"stepDefinitions"}
)
public class TestRunner {
}
