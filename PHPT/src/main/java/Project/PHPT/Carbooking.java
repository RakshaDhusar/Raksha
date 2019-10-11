package Project.PHPT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Carbooking {
	WebDriver driver;
	
	By Pick_Up_Location = By.xpath("//div[@id='select2-drop']//input[@class='select2-input']");
	By Drop_Of_Location = By.xpath("//div[@id='s2id_carlocations2']//span[@class='select2-chosen'][contains(text(),'Location')]");
	By From_Date = By.xpath("//input[@id='departcar']");
	By To_Date = By.xpath("//input[@id='returncar']");
	By ClickOnSearch = By.xpath("//div[@class='bgfade col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg btn-block pfb0 loader'][contains(text(),'Search')]");
	
	@Test
	public void Search()
	{
	System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.phptravels.net/");
	driver.manage().window().maximize();
	driver.findElement(Pick_Up_Location).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement()
}
}
