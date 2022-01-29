package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features="src/text/java/features/login.feature",glue="steps",monochrome=true,publish =true)

public class cucumberrunner extends AbstractTestNGCucumberTests{

}
