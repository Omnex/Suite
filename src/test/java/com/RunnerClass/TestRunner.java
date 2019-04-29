package com.RunnerClass;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		
		features="G:\\Selenium tools\\EWQIMSProductBDD\\src\\main\\java\\Featurefile\\ca-MasterFolderTags.feature",
		glue="com.stepDefinition",
		format={"pretty","html:test-output", "junit:junit_xml/cucumber.xml"},
		tags={"@tags102"}, 
		monochrome=true,
		strict = false,
		dryRun = false
		
		
		)


public class TestRunner {
	
	
}
