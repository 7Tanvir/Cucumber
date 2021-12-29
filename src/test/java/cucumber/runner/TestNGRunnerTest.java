package cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber/cucumber.html", "summary"},
        //tags = "@guest or @feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = false,
        glue = {"cucumber"},
        features = "src/test/resources/cucumber"
)
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
