//package stepDefinations;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Test;
//
//public class LoginstepDefination {
//	
//	WebDriver driver;
//	WebDriverWait wait ; 
//	
//	
//	@Given("^User is on already on login page$")
//	public void User_is_on_already_on_login_page()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:/Users/priya.saxena/Desktop/RR/FreshrestAssured/Test/chromedriver_win32 (4)/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.freecrm.com/");
//	}
//	
//	
//	@When("^title on login page is free crm$")
//	public void title_on_login_page_is_free_crm()  {
//	    String title = driver.getTitle();
//	    Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
//	   
//	}
//
//	@Then("^User1 enters \"(.*)\"$")
//	public void user_enters_username(String username) throws InterruptedException {
//		//driver.findElement(By.xpath("//*[@class='layout-header__links']/a[1]")).click();
//		driver.findElement(By.xpath("//*[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
//		driver.manage().window().maximize();
//		//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//		wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='E-mail address']")));
//		WebElement user = driver.findElement(By.xpath("//*[@placeholder='E-mail address']"));
//		user.click();
//		user.sendKeys(username);
//		
//	}
//
//	@Then("^User enters \"(.*)\"$")
//	public void user_enters_password(String password)  {
//	    
//	    driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(password);
//	}
//
//	@Then("^use clicks on login button$")
//	public void use_clicks_on_login_button() {
//		
//		WebElement loginbtn = driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']"));
//		loginbtn.click();
//	    
//	}
//
//	@Then("^User is on home page$")
//	public void user_is_on_home_page()  {
//		
//		String title2 = driver.getTitle();
//		System.out.println(title2);
//	}
//		
//		
//		@Then("^Click on contacts$")
//		public void click_on_contacts() throws InterruptedException  {
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='main-nav']/div[3]")).click();
//			
//		    
//		}
//
//		@Then("^create contact with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//		public void create_contact_with_and_and(String fname, String lname, String company) throws InterruptedException  {
//		  
//			driver.findElement(By.xpath("//button[@class='ui linkedin button' and text()='Create']")).click();
//			driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys(fname);
//			driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys(lname);
//			WebElement comp =driver.findElement(By.xpath("//*[@name='company']/input"));
//			comp.click();
//			Thread.sleep(3000);
//			comp.sendKeys(company);
//			driver.findElement(By.xpath("//*[@class='visible menu transition' ]")).click();
//		   
//	   
//	}
//		@Then("^close the browser$")
//		public void close_the_browser() {
//			driver.quit();
//		}
//}
//
//
