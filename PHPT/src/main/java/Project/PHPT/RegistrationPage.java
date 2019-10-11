package Project.PHPT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage  {
	
	public static WebDriver driver;
	   
	public WebDriver browser() throws IOException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Online Test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\New folder\\222\\PHPT\\src\\main\\java\\resources\\BasicData.properties");
		prop.load(fis);
		return driver; 
	}
	
	
	By FirstName=By.xpath("//input[@placeholder='First Name']");
	By LastName=By.xpath("//input[@placeholder='Last Name']");
	By Mobile=By.xpath("//input[@placeholder='Mobile Number']");
	By Email=By.xpath("//input[@placeholder='Email']");
	By Password=By.xpath("//input[@placeholder='Password']");
	By ConfirmPassword=By.xpath("//input[@placeholder='Confirm Password']");
	By signbut=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
	

	
	
	public WebElement firstName() 
	 {
		 return driver.findElement(FirstName);
	 }
	public WebElement lastname() 
	 {
		 return driver.findElement(LastName);
	 }
	public WebElement mobile() 
	 {
		 return driver.findElement(Mobile);
	 }
	public WebElement email() 
	 {
		 return driver.findElement(Email);
	 }
	public WebElement password() 
	 {
		 return driver.findElement(Password);
	 }
	public WebElement confirmpassword() 
	 {
		 return driver.findElement(ConfirmPassword);
	 }
	
	 
}
