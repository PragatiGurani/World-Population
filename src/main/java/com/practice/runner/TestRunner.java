package com.practice.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\Java Practice_Selenium\\CucumberPractice\\src\\main\\java\\Features",
                 glue= {"stepdefinitions"},
                 monochrome=true,
                 dryRun=false,
                 strict=true,
                 plugin= {"pretty","html:F:\\Java Practice_Selenium\\CucumberPractice\\Htmlreports\\login.html"}
                 
                  )
public class TestRunner {

}
