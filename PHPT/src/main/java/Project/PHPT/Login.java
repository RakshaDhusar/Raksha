package Project.PHPT;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
WebDriver driver;
	
	public void browser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Online Test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		}
	
By Email=By.xpath("//*[@id=li_myaccount]/ul/li[1]/a");
By Password=By.xpath("//*[@id='loginfrm']/div[1]/div[5]/div/div[2]/input");
By ClickOnLogin=By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
By ClickOnSingin=By.xpath("//a[@class='btn btn-default br25 btn-block form-group']");
By ClickOnForgetPassword=By.xpath("//a[@class='btn btn-default br25 btn-block']");

	

public void ClickButton() throws Exception
{
	driver.findElement(ClickOnSingin).click();
	driver.findElement(ClickOnLogin).click();
} 
 public WebElement emailid() 
 {
	 return driver.findElement(Email);
 }
 public WebElement password() 
 {
	 return driver.findElement(Password);
 }
}


	