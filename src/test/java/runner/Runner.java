	package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.*;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;
//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(
		plugin = { "pretty", "html:target/lms.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		
		monochrome=false,  //console output
		//tags = "@CrossBrowserFirefox", //tags from feature file
		features = {"src/test/resources/Features"}, //location of feature files
		glue= {"stepDefinition","hooks"}) //location of step definition files

public class Runner
extends AbstractTestNGCucumberTests{

@Override
@DataProvider(parallel = false)
public Object[][] scenarios() {
			
return super.scenarios();
    
}
}


