package travels;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HomePage extends Launch
{
	By MyAccount =By.xpath("//a[@aria-expanded='false']");
	By SignUp =By.xpath("//div[@class='modal-content']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]"); 
	By LogIn =By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
	By hotels = By.xpath("//li[@class='active text-center']//a[@class='text-center']");
	By flights = By.xpath("//div[@id='body-section']//li[2]//a[1]");
	By tours = By.xpath("//a[@href='#tours']");
	
	void signUp()
	{
		driver.findElement( MyAccount).click();
		driver.findElement(SignUp).click();
	}
	
	void LogIn()
	{
		driver.findElement(MyAccount).click();
		driver.findElement( LogIn);
		
	}
	WebElement hotels()
	{
		return driver.findElement(hotels);
	}
	
	  WebElement flights()
	  {
		  return driver.findElement(flights);
	  }
	
	  WebElement tours()
	  {
		  return driver.findElement(tours);
	  }
	
	
}