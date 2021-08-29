package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealStepDefination {
	
	WebDriver driver;
	WebDriverWait wait ; 
	
	
	@Given("^User is on already on login page$")
	public void User_is_on_already_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/priya.saxena/Desktop/RR/FreshrestAssured/Test/chromedriver_win32 (4)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
	}
	@When("^title on login page is free crm$")
	public void title_on_login_page_is_free_crm()  {
	    String title = driver.getTitle();
	    Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
	   
	}
	
	@Then("^User enters username and password$")
	public void User_enters_username_and_password(DataTable credentials)  {
		List<List<String>> data =credentials.raw();
		driver.findElement(By.xpath("//*[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='E-mail address']")));
		WebElement user = driver.findElement(By.xpath("//*[@placeholder='E-mail address']"));
		user.click();
		user.sendKeys(data.get(0).get(0));
		 driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(data.get(0).get(1));
	   
	}
	@Then("^use clicks on login button$")
	public void use_clicks_on_login_button() {
		
		WebElement loginbtn = driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']"));
		loginbtn.click();
	    
	}

	@Then("^User is on home page$")
	public void user_is_on_home_page()  {
		
		String title2 = driver.getTitle();
		System.out.println(title2);
	}
		
	@Then("^Click on deals page$")
	public void click_on_deals_page() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='main-nav']/div[5]")).click();
	    
	}

	@Then("^create deal with title and description and identifier$")
	public void create_deal_with_title_and_description_and_identifier(DataTable  deals) throws InterruptedException {
		List<List<String>>dealsdata =deals.raw();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='ui linkedin button' and text()='Create']")).click();
		driver.findElement(By.xpath("//*[@name='title']")).sendKeys(dealsdata.get(0).get(0));
		driver.findElement(By.xpath("//*[@name='description']")).sendKeys(dealsdata.get(0).get(1));
		driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys(dealsdata.get(0).get(2));
//		comp.click();WebElement comp 
//		Thread.sleep(3000);
//		comp.sendKeys(company);
//		driver.findElement(By.xpath("//*[@class='visible menu transition' ]")).click();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		
		driver.quit();
	   
	

}
}
