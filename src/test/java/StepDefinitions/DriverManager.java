package StepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DriverManager {
	private WebDriver driver;
	private static DriverManager browserHelp;
	
	private DriverManager() throws InterruptedException {
	    this.driver = new ChromeDriver();
	    Thread.sleep(250);
	    driver.manage().window().maximize();
	}
	
	public static DriverManager getOpenBrowserHelp() throws InterruptedException {
	    if (null == browserHelp) {
	        browserHelp = new DriverManager();
	    }
	    return browserHelp;
	}
	
	WebDriver getDriver() {
	    return driver;
	}
	
	void setDriver(WebDriver driver) {
	    this.driver = driver;
	}
	
	public void printSingleton() {
	    System.out.println("Inside print Singleton");
	}
}
