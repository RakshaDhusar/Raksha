package travels;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launch 
{
	public static WebDriver driver;
	public static Properties prop = new Properties ();
	
		
		public void launchPage() throws Exception
		{
		
			FileInputStream fls= new FileInputStream("C:\\New folder\\222\\PHPT\\src\\main\\java\\Project\\PHPT\\base.properties");
		   prop.load(fls);
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Online Test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
}
