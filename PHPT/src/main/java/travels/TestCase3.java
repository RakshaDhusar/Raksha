package travels;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase3 
{
	static By month= By.xpath("//div[14]//div[1]//tr[1]//th[2]");
	static By next=By.xpath("//div[14]//div[1]//tr[1]//th[3]");
	static By month1= By.xpath("//div[15]//div[1]//tr[1]//th[2]");
	static By next1=By.xpath("//div[15]//div[1]//tr[1]//th[3]");

	//Hotel search
	@Test
	public static void hotelSearch() throws Exception {
	
		HomePage hp= new HomePage();
		hp.launchPage();
		
		hp.driver.get(hp.prop.getProperty("url"));
		hp.hotels().click();
		
		HotelSearch hs= new HotelSearch();
		
		//hotel or city name
		hs.searchButton().sendKeys(hp.prop.getProperty("SearchElement"));
		hp.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+hp.prop.getProperty("SearchElement")+"')]")).click();
		
		
		//check in
		hs.checkIn().click();
		String str = hs.driver.findElement(month).getText();
		
		while(!str.equalsIgnoreCase(hp.prop.getProperty("checkInMonthYear"))) {
			hs.driver.findElement(next).click();
			str= hs.driver.findElement(month).getText();
		}
		
		checkInDate(hp.prop.getProperty("checkInDate"));
		
		//check out
        String str1 = hs.driver.findElement(month1).getText();
		
		while(!str1.equalsIgnoreCase(hp.prop.getProperty("checkOutMonthYear"))) {
			hs.driver.findElement(next1).click();
			str1= hs.driver.findElement(month1).getText();
		}
		
		checkOutDate(hp.prop.getProperty("checkInDate"));
		
		hs.guests().click();
		hs.adults().clear();
		hs.child().clear();
		hs.adults().sendKeys(hp.prop.getProperty("adults"));
		hs.child().sendKeys(hp.prop.getProperty("child"));
		hs.hotelSearchButton().click();
	}
	
	public static void checkInDate(String date){
		
		String d;
		HomePage h1= new HomePage();
		for(int i=1; i<=6;i++){
			for(int j=1; j<=7; j++){
				 d = h1.driver.findElement(By.xpath("//div[14]//tr["+i+"]//td["+j+"]")).getText();
				if(d.equals(date))
					h1.driver.findElement(By.xpath("//div[14]//tr["+i+"]//td["+j+"]")).click();
			}
		}
	}
	
	
public static void checkOutDate(String date){
		
		String d;
		HomePage h1= new HomePage();
		for(int i=1; i<=6;i++){
			for(int j=1; j<=7; j++){
				 d = h1.driver.findElement(By.xpath("//div[15]//tr["+i+"]//td["+j+"]")).getText();
				if(d.equals(date))
					h1.driver.findElement(By.xpath("//div[15]//tr["+i+"]//td["+j+"]")).click();
			}
		}
	}
	
	

}
