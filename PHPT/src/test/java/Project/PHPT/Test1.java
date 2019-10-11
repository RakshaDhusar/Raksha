package Project.PHPT;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 extends RegistrationPage
{
	
	By MyAccount = By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	By SignUp = By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]");
	
	WebDriver driver;
	Properties prop;
	
	@BeforeTest
	public void LaunchBrowser() throws IOException
	{
		driver = browser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}

	@Test
	public void method1() throws InterruptedException
	{
		RegistrationPage r1= new RegistrationPage();
		driver.findElement(MyAccount).click();
		driver.findElement(SignUp).click();
		r1.firstName().sendKeys(prop.getProperty("FirstName"));
		r1.lastname().sendKeys(prop.getProperty("LastName"));
		r1.mobile().sendKeys(prop.getProperty("Mobile"));
		r1.email().sendKeys(prop.getProperty("Email"));
		r1.password().sendKeys(prop.getProperty("Password"));
		r1.confirmpassword().sendKeys(prop.getProperty("ConfirmPassword"));
	}
}
