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
        features = {"src/test/resources/features/talkModule.feature"},
        glue = {"com/meetsky/step_definitions"},
        dryRun = false,
        tags = "@METSK-511"
)
public class CukesRunner {
}
