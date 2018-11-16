package com.RanfordBankBDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "folder",glue={"com.RanfordBankBDD"}, format={"pretty", "html:/RanfordBankBDD/target"})
public class Runner {

}
