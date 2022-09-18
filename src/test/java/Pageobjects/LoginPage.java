package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(id ="Email")
	WebElement email;
	
	@FindBy(id ="Password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement  Login;
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
	public void enteremail(String Emailaddress) {
		email.clear();
		email.sendKeys(Emailaddress);
	}
	
	public void enterpassword(String passwordcode) {
		password.clear();
		password.sendKeys(passwordcode);
	}
	
	public void clickonloginbutton() {
		Login.click();
	}
	
	public void clickonlogoutbutton() {
		logout.click();
	}
}
