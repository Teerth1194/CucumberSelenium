package com.google;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "C:/Users/teerthp/Documents/Automation/Automation-Local/SeleniumMavencucumber2/src/test/resources/sample.feature",

        glue = {"com.google.Steps"},

        plugin = {"html:target/ReportOutput/report.html","json:target/ReportInput/report.json"}
)

public class TestRunner {
}
