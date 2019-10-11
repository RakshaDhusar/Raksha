package Project.PHPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlightSearchPage extends RegistrationPage
{
	By Enter_To_Location=By.xpath("//div[@id='select2-drop']//input[@class='select2-input']");
	By Enter_From_Location=By.xpath("//div[@id='thflight']//div[4]//div[1]//i[1");
	By Location=By.xpath("//div[@id='thflight']//div[1]//div[1]//i[1]");
	By One_Way=By.xpath("/label[@class='hover']");
	By Round_Trip=By.xpath("//label[@class='hover']");
	By ClickOnSearch=By.xpath("//button[@class='btn-primary btn btn-lg btn-block pfb0']");
	
	public WebElement searchButton() {

		return driver.findElement(ClickOnSearch);
	}
	
	public WebElement entertolocation() {
		return driver.findElement(Enter_To_Location);
	}
	
	public WebElement enterfromlocation() {
		return driver.findElement(Enter_From_Location);
	}
	
	public WebElement location(){
		return driver.findElement(Location);
	}
	
	public WebElement oneway() {
		return driver.findElement(One_Way);
	}
	public WebElement roundtrip() {
		return driver.findElement(Round_Trip);
	}
	
	public WebElement flightSearchButton(){
		return driver.findElement(ClickOnSearch);
	}





	
	

}
