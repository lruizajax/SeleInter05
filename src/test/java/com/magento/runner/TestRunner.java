package com.magento.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com.magento", // recordar el path de hooks
        plugin = {"summary","pretty",
                "html:target/cucumber",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                //"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        monochrome = false,
        publish = true,
        //tags = "@Login",
        dryRun = false
)
public class TestRunner  {
}
