package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"D:\\Code_StarAgile\\FirstCucumberProject\\src\\test\\resources\\FirstCucumberProject\\FirstCucumberProject\\F05GoogleLink.feature"},
                 glue= {"com.StepDefination"},
                 publish = true ,
               tags = "@GoogleLink")  
public class R05GoogleLink {

}


/*  tags -
 * Execute Single Scenario: 	tags = "@SanityTest"
 * Execute multiple Scenarios: 	tags = "@SanityTest or @UsabilityTest"
 * Skip single Scenario:		tags = "not @UsabilityTest"
 * Skip multiple Scenarios:		tags = "not @UsabilityTest and not @SanityTest"
 * Execute all Scenarios:		tags = "@GoogleLink"
 */