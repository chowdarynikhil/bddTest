package com.RanfordBankBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//import Modules.Executelogin;
//import Page_Object.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Defination {
	
	WebDriver driver;
	
	public Step_Defination()
	{
		this.driver=Hooks.driver;
	}
	
	@Given("^Launch the site$")
	public void Launch_the_site() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
	  driver.get("http://srssprojects.in/home.aspx");
	}

	@When("^check the tittle of the page \"([^\"]*)\" data$")
	public void check_the_tittle_of_the_page_data(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  String acttitle=  driver.getTitle();
	  if(acttitle.equals(arg1)){
		  System.out.println("passed");
	  }
	}

	@Then("^Homepage should be displayed$")
	public void Homepage_should_be_displayed() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  if(driver.findElement(By.xpath("//img[contains(@src,'images/mainlinks_02.jpg')]")).isDisplayed())
	  {
		  System.out.println("passed");
	  }
	}

	@Then("^Close the site$")
	public void Close_the_site() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   driver.close();
	}

	@When("^Enter the username and password and click on login btn$")
	public void Enter_the_username_and_password_and_click_on_login_btn() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   //PageFactory.initElements(driver, HomePage.class);
	   //Executelogin.exectute();
	}

	@Then("^Branches btn should be displayed$")
	public void Branches_btn_should_be_displayed() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   if(driver.findElement(By.xpath("//img[contains(@src,'images/Branches_but.jpg')]")).isDisplayed())
	   {
		   System.out.println("passed");
	   }
	}


}
