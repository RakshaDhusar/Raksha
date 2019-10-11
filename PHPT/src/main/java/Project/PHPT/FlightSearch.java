package Project.PHPT;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlightSearch extends RegistrationPage{
	
	WebDriver driver;
	Properties prop;
	@BeforeTest
	public void main() throws IOException
	{
	 
		driver = browser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}


	

	@Test
	public void method1() throws InterruptedException{
		FlightSearchPage r1= new FlightSearchPage();
		r1.searchButton().click();
}}
