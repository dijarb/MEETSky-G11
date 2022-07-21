package com.meetsky.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = {"src/test/resources/features/contactsModuleFunctionality.feature"},
        glue = {"com/meetsky/step_definitions"},
        dryRun = true,
        tags = ""
)
public class CukesRunner {
}
