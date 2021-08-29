package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/Features/dealsmaps.feature",glue= {"stepDefinations"},
      //format = {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
      plugin = {"pretty", "html:test-output"},
      dryRun= false,
      //strict = true,//will check if any step is not defined
      monochrome= true //display the console output in proper readable format
      //tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}	
      
		)

public class TestRunner {
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
		//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest

}
