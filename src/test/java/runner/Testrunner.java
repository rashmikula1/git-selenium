package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    plugin = {"pretty", "html:target/rashmi.html"},//reporting purpose
	    monochrome=false,//console output color 
	    tags="@tag",//tags from the feature file
	    features={"src/test/resources/features"},//location of feature file
	    glue="stepDefinition")//location of step definition file

/*public class Testrunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=false)
	public Object[][]scenarios(){
		
		return super.scenarios();
	
	}*/
	public class Testrunner{
	
	}
	
	


