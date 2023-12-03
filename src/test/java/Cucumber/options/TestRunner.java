package Cucumber.options;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Feature",
		glue= {"stepDefination"},
//		plugin= {"pretty":"html:target/HTML"},
//		plugin= {"pretty","json:target/Jsonreports/report.json"}
		plugin= {"pretty","junit:target/JunitReports/reports.xml"}
		
//		tags= {"@Smoke"},
//	,	tags= {"@Smoke","@Important"}
		
		)
public class TestRunner {

}
