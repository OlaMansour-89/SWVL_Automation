package PagesObjects;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(tags = {"@smoke"},
features = "classpath:Features",
plugin = {"pretty",
        "json:build/cucumber-json-report/cucumber.json",
        "html:build/cucumber-html-report",
        "rerun:rerun.txt"},
glue = {"classpath:StepsDef"}
)
 

public class TestRunner {
	@Before
    public static void startAppium() {
        DriverRegistry.startSession();
    }

    @After
    public static void stopAppium() { DriverRegistry.stopAppiumServer(); }

}
