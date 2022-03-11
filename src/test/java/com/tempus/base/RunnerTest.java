package com.tempus.base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com/tempus"},
        tags = "" ,
        publish = true
)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
