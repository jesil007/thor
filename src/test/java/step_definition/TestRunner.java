package step_definition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features=("src\\test\\resources\\features\\login.feature"),glue= {"step_definition"},plugin= {})
public class TestRunner extends AbstractTestNGCucumberTests {

}
