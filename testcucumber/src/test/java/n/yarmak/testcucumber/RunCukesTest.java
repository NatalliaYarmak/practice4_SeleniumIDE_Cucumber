package n.yarmak.testcucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/n/yarmak/testcucumber/cukes.feature"})
public class RunCukesTest {

}