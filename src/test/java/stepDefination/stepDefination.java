package stepDefination;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination 
{
	WebDriver driver=null;
	@Before(order=0)
	public void BroswerSetup()
	{
		
	System.out.println("I am doing this changes for X to refelct lets check will it do or not");	
		String ProjectPath=System.getProperty("user.dir");
		System.out.println(ProjectPath);
		
		System.setProperty("webdriver.chrome.driver",ProjectPath+"\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@After
	public void teardown()
	{
		System.out.println("Here we will close the broswer ");
		driver.quit();
		
	}
	
	@BeforeStep
	 public void BeforeStep()
	{
		System.out.println("I am executing before every Step");
	}
	
	@AfterStep
	 public void AfterStep()
	{
		System.out.println("I am executing After every Step");
	}
	
	
	
	@Given("Land on the Login of Webpage")
	public void land_on_the_Login_of_Webpage() 
	{
	   driver.get("https://rahulshettyacademy.com/locatorspractice/");
	}

	@When("^Enter the (.+) and (.+)$")
	public void enter_the_rahul_and_rahulshettyacademy(String username,String password) 
	{
	  driver.findElement(By.id("inputUsername")).sendKeys(username);
	  driver.findElement(By.name("inputPassword")).sendKeys(password);
	}

	@When("click on the checkboxes")
	public void click_on_the_checkboxes() 
	{
	driver.findElement(By.id("chkboxOne")).click();
	driver.findElement(By.id("chkboxTwo")).click();
	}

	@When("click on the Sign In Button")
	public void click_on_the_Sign_In_Button()
	{
	 driver.findElement(By.xpath("//button[text()='Sign In']")).click();   
	}

	@Then("Navigated to Home Page")
	public void navigated_to_Home_Page()
	{
	  String title=driver.getTitle();  
	  System.out.println(title);
	}
	
	@Then("click on Logout")
	public void click_on_Logout() {
			driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	}

	@When("click on the visit us page")
	public void click_on_the_visit_us_page() 
	{
	 driver.findElement(By.id("visitUsTwo")).click();  
	}

	@Then("Get the title of Visit us Page")
	public void get_the_title_of_Visit_us_Page() 
	{
		Set<String> win=	driver.getWindowHandles();
		Iterator<String> it=win.iterator();
		String parent=it.next();
		String Child=it.next();
		driver.switchTo().window(Child);
		String VisitusTitle=driver.getTitle();
		
		System.out.println(VisitusTitle);
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
	}

	


}
