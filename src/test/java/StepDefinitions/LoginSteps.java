package StepDefinitions;

import io.cucumber.java.en.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
	
	WebDriver driver = null;
	
	public LoginSteps() throws InterruptedException {
		
		driver = DriverManager.getOpenBrowserHelp().getDriver();
		
	}
	 
	@Given("the user on the belgenet page")
	public void the_user_on_the_belgenet_page() throws InterruptedException {
	    System.out.println("Inside Step - the user on the belgenet page");
	    
	    String projectPath = System.getProperty("user.dir");
	    System.out.println("Project path is:" +projectPath);
	    
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");

	    driver.navigate().to("https://www.belgenet.com.tr/");
	    
	    driver.manage().window().maximize();
	    
	    Thread.sleep(250);
	}
	

	@When("the user clicks the Demo button")
	public void the_user_clicks_the_Demo_button() {
		System.out.println("Inside Step - the user clicks the Demo button");
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]")).click();
	}


	@And("the user enters the username as {string}")
	public void the_user_enters_the_username_as(String string) throws InterruptedException {
		System.out.println("Inside Step - the user enters the username as {string}");
		driver.findElement(By.id("parolaSertifikaAccordion:uForm:txtUKullaniciAdi")).sendKeys("botcu");
		Thread.sleep(250);
	}

	@And("the user enters the password as {string}")
	public void the_user_enters_the_password_as(String string) throws InterruptedException {
		System.out.println("Inside Step - the user enters the password as {string}");
		driver.findElement(By.id("loginUSifre")).sendKeys("spider");
		Thread.sleep(250);
	}

	@And("the user clicks the login button")
	public void the_user_clicks_the_login_button() throws InterruptedException {
		System.out.println("Inside Step - the user clicks the login button");
		driver.findElement(By.xpath("//*[@id=\"parolaSertifikaAccordion:uForm:girisYapButton\"]/span")).click();
		Thread.sleep(250);
	}

	@Then("the user should be redirected to the home page")
	public void the_user_should_be_redirected_to_the_home_page() throws InterruptedException {
		System.out.println("Inside Step - the user should be redirected to the home page");
		driver.getPageSource().contains("Demo");
		Thread.sleep(1000);
	}


}
