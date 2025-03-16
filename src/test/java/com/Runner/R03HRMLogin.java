package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"D:\\Code_StarAgile\\FirstCucumberProject\\src\\test\\resources\\FirstCucumberProject\\FirstCucumberProject\\F03HRMLogin.feature"},
glue= {"com.StepDefination"})
public class R03HRMLogin {

}
