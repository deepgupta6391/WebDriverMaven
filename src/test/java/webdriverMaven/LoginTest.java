package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver","C:\\Softwares\\jars\\selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
	
	@Test
	public void doLogin() {
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys("deep.gupta.6391@gmail.com");
		driver.findElement(By.xpath("//span[@class=\"RveJvd snByac\"]")).click();
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	

}
