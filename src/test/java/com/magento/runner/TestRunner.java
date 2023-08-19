package com.magento.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com.magento", // recordar el path de hooks
        plugin = {"pretty", "summary",
                "html:target/test-report.html",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        monochrome = false,
        publish = true,
        //tags = "@Login",
        dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests {

        /*@Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }*/
}
