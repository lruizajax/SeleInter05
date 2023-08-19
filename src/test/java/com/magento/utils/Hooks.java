package com.magento.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Hooks extends Base{

    @Before
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
    }


    @After
    public void tearDown(Scenario scenario){
        System.out.println("After");
        try {
            if(scenario.isFailed()){
                final byte[] screnshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screnshot,"image/png","failed");
            }
        }finally {
            driver.quit();
        }
    }
}
