package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
/*	
	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_already_login_page()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\umair.rizwan\\Documents\\Umair Office data\\Selenium Learning\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
	}

	@When("^title of login page is CRM$")
	public void get_title()
	{
	  String title=	driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals("Cogmento CRM", title);
	}
	
	
	/*
	 * @Then("^user enters \"(.*)\" and \"(.*)\"$") public void
	 * user_enters_username_and_password(String uName, String Pwd) { // Write code
	 * here that turns the phrase above into concrete actions
	 * 
	 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys(uName);
	 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Pwd);
	 * 
	 * driver.findElement(By.xpath("//div[text()='Login']")).click(); }
	 */

	/*
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement loginBtn = driver.findElement(By.xpath("//div[text()='Login']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);	
		
	}
	*/
	
	
	/*
	 * @Then("^user lands on homepage$") public void user_is_on_hopme_page(){ String
	 * title = driver.getTitle(); System.out.println("Home Page title ::"+ title);
	 * Assert.assertEquals("Cogmento CRM", title); }
	 */
	
	/*
	
	@Then("^close the browser$")
	public void close_browser()
	{
		driver.quit();;
	} 
	*/
}
