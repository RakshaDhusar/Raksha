package travels;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase2
{
	static Properties prop;
	static WebDriver driver;
	
	static By month= By.xpath("//div[16]//div[1]//tr[1]//th[2]");
	static By next=By.xpath("//div[16]//div[1]//tr[1]//th[3]");
	
	
	@Test
	public static void fightSearch() throws Exception{
		
		prop = new Properties();
		FileInputStream fls= new FileInputStream("C:\\New folder\\222\\PHPT\\src\\main\\java\\Project\\PHPT\\base.properties");
		prop.load(fls);
		
		HomePage h1= new HomePage();
		h1.launchPage();
		h1.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		h1.driver.get(h1.prop.getProperty("url"));
		h1.flights().click();
		
		FlightSearch f1= new FlightSearch();
		f1.fromClick().click();
		f1.from().sendKeys(h1.prop.getProperty("fromLocation"));
		h1.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+h1.prop.getProperty("fromLocation")+"')]")).click();
		f1.toClick().click();
		f1.to().sendKeys(h1.prop.getProperty("toCity"));
		h1.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+h1.prop.getProperty("toCity")+"')]")).click();
		f1.departureDate().click();
		
		
		
		while(!h1.driver.findElement(By.xpath("//div[16]//div[1]//tr[1]//th[2]")).getText().contains(h1.prop.getProperty("departurteMonthYear"))) 
		{
			h1.driver.findElement(By.xpath("//div[16]//div[1]//tr[1]//th[3]")).click();
		}
		
		checkInDate(h1.prop.getProperty("departureDate"));
		
		f1.guestClick().click();
		f1.adults().click();
		f1.adults().sendKeys(h1.prop.getProperty("fAdults"));
		int aval = Integer.parseInt(h1.prop.getProperty("fAdults"));
		h1.driver.findElement(By.xpath("//select[@id='madult']//option[@value='"+aval+"']")).click();
		
		f1.child().click();
		f1.child().sendKeys(h1.prop.getProperty("fChild"));
		int cval = Integer.parseInt(h1.prop.getProperty("fChild"));
		h1.driver.findElement(By.xpath("//select[@id='mchildren']//option[@value='"+cval+"']")).click();
		
		f1.infantb().click();
		f1.infantb().sendKeys(h1.prop.getProperty("fInfant"));
		int ival= Integer.parseInt(h1.prop.getProperty("fInfant"));
		h1.driver.findElement(By.xpath("//select[@id='minfant']//option[@value='"+ival+"']")).click();
		f1.done().click();
		Thread.sleep(1000);
		//h1.driver.findElement(By.xpath("//button[@id='cookyGotItBtn']")).click();
		f1.searchButton().click();
	}

	public static void checkInDate(String date){
		
		String d;
		HomePage h1= new HomePage();
		for(int i=1; i<=6;i++){
			for(int j=1; j<=7; j++){
				 d = h1.driver.findElement(By.xpath("//div[16]//tr["+i+"]//td["+j+"]")).getText();
				 if(d.equals("1")) {
					 for(int k=i; k<6; k++) {
						 for(int l=j; l<7; l++) {
							 d = h1.driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+l+"]")).getText();
							 if(d.equals(date))
									h1.driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+l+"]")).click();
						 }
					 }
			}
		}
	}
	}	

}
