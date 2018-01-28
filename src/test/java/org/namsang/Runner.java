package org.namsang;

import cucumber.api.CucumberOptions;

@CucumberOptions(monochrome = true,
        features = "src/test/resources/features/",
        format = { "pretty","html: cucumber-html-reports",
                "json: cucumber-html-reports/cucumber.json" },
        dryRun = false,
        glue = "org.namsang")
public class Runner {
}
