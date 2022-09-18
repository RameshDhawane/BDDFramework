package StepDefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import Pageobjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Stepdef {

	public WebDriver driver;
	public LoginPage loginpg;
	
	@Before
	public void setup() {
		System.out.println(" This is beforeHook");
	}
	@After
	public void teardown() {
		System.out.println(" This is afterhook");
	}
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginpg = new LoginPage(driver);
		

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String Emailaddress, String passwordcode) {
		loginpg.enteremail(Emailaddress);
		
		loginpg.enterpassword(passwordcode);
		
		
		
	}

	@When("Click on Login")
	public void click_on_login() {
		loginpg.clickonloginbutton();
	}

	
	/////Login Feature ///////
	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedtitle) {

		String actualtitle=driver.getTitle();
		
		if(actualtitle.equals(expectedtitle))
		{
			Assert.assertTrue(true);// Test case passed
		}
		else
		{
			Assert.assertTrue(false);// Test case Failed
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {

		loginpg.clickonlogoutbutton();
	}

	@Then("close browser")
	public void close_browser() {

		driver.close();
		driver.quit();
	}
	
	/////////////////Add New Customer/////////////////
	


	/*@Then("User can view Dashboad")
	public void user_can_view_dashboad() {
		String actualTitle = addnewcp.getPageTitle();
		String expectedTitle = "Dashboard / nopCommerce administration";

		if(actualTitle.equals(expectedTitle))
		{
			//log.info("user can view dashboard test passed.");
			Assert.assertTrue(true);

		}
		else
		{
			Assert.assertTrue(false);
			//log.warn("user can view dashboard test failed.");

		}
	}*/

	
	

	}