package travels;
import org.testng.annotations.Test;

public class Testcase1 extends BasicCommands{
	@Test
	public static void userRegistration() throws Exception {
		Launch l = new Launch();
		BasicCommands bc= new BasicCommands();
		//Launch l =new Launch();
		//HomePage h1= new HomePage();
		l.launchPage();
		l.driver.get(l.prop.getProperty("url"));
		bc.signUp();
		
		RegistionPage r1= new RegistionPage();
		r1.firstName().sendKeys(l.prop.getProperty("FirstName"));
		r1.lastName().sendKeys(l.prop.getProperty("LastName"));
		r1.MobileNumber().sendKeys(l.prop.getProperty("MobileNumber"));
		r1.email().sendKeys(l.prop.getProperty("Email"));
		r1.password().sendKeys(l.prop.getProperty("Password"));
		r1.confirmPassword().sendKeys(l.prop.getProperty("ConfirmPassword"));
		r1.signUp();
	}	

}
