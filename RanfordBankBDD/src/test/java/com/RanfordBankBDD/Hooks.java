package com.RanfordBankBDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;

public class Hooks {
 public static WebDriver driver;
 
 @Before
 public static void openbrowser()
 {

	 System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
	 driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }
}
