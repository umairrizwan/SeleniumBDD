package stepDefinition;

import java.awt.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsMap {
	
	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void useralreadyonloginPage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\umair.rizwan\\Documents\\Umair Office data\\Selenium Learning\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
	}
	
	@When("^title of login page is CRM$")
	public void loginPageTitle()
	{
		String title= driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}
	
	@Then("^user enters username and password$")
	public void logincredentials(DataTable credentials)
	{
		for( Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
				
	     driver.findElement(By.name("email")).sendKeys(data.get("username"));
	     driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
	}
	
	@Then("^user clicks on login button$")
	public void userclicksonLogin()
	{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button' and text()='Login']")).click();
	}

	
	
	
	@Then("^user clicked on deals link$")
	public void userclicksonDeals()
	{
		driver.findElement(By.xpath("//span[@class='item-text' and text()='Deals']")).click();
	}
	
	@Then("^user lands on deals page$")
	public void getdealstitle()
	{
		String Dealtitle = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", Dealtitle);
		/* driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); */ 
		/* driver.findElement(By.xpath("//button/i[@class='edit icon']")).click(); */
		WebDriverWait wait = new WebDriverWait(driver, 3);
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button/i[@class='edit icon']"))));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ui linkedin button'][contains(.,'New')]")));
		element.click();
		//driver.findElement(By.xpath("//button/i[@class='edit icon']")).click();
	}
	
	@Then("^user enter deals values$")
	public void enterDeals(DataTable deals)
	{
		for( Map<String, String> data : deals.asMaps(String.class, String.class))
		{
		driver.findElement(By.name("title")).sendKeys(data.get("title"));
		driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
		driver.findElement(By.name("commission")).sendKeys(data.get("comission"));
		}
	}

}
