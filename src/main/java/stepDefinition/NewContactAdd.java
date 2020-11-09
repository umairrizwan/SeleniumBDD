package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.joda.time.Seconds;
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

public class NewContactAdd {
	
	WebDriver driver;
	
	@Given("^user is already on login pagee$")
	public void useronlogin()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\umair.rizwan\\Documents\\Umair Office data\\Selenium Learning\\chromedriver\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("https://ui.freecrm.com/");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\umair.rizwan\\Documents\\Umair Office data\\Selenium Learning\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
	}
	
	
	  @When("^user enters \"(.*)\" and \"(.*)\" and clicks on login button$") public void userLogin(String un,
	  String pwd) { driver.findElement(By.name("email")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(pwd); driver.findElement(By.
	  xpath("//div[@class='ui fluid large blue submit button' and text()='Login']")
	  ).click(); }
	 
	  
	  @When("^user lands on homepage$")
	  public void userOnHomePage()
	  {
		String title=  driver.getTitle();
		System.out.println("The page title is-->"+title);
		Assert.assertEquals("Cogmento CRM", title);
	  }
	
	  
	  @When("^user clicks on contacts page$")
	  public void userclickonContact()
	  {
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//span[@class='item-text' and text()='Contacts']")).click();
	  }
	
	  @When("^user clicks on new contact button$")
	  public void clickonNewContact()
	  {
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//button[@class='ui linkedin button' and text()='New']")).click(); 
	  }
	

	
	  @When("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$"
	  ) public void enterNewContacts(String firstname, String lastname, String
	  category, String email) {
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  
	  driver.findElement(By.name("first_name")).sendKeys(firstname);
	  driver.findElement(By.name("last_name")).sendKeys(lastname);
	  driver.findElement(By.xpath("//div[@name='category']")).click();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//span[text()='"+category+"']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Email address']")).
	  sendKeys(email); driver.findElement(By.
	  xpath("//button[@class='ui linkedin button' and text()='Save']")).click(); }
	 
	  
}
