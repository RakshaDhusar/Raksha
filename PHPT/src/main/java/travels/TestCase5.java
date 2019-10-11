package travels;
import org.testng.annotations.Test;

public class TestCase5 
{
	@Test
	public static void Login() throws Exception 
	{
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
		//bc.signUp();
		l.driver.get(l.prop.getProperty("url"));
		HomePage h= new HomePage();
		h.LogIn();
		LogIn l1= new LogIn();
		l1.loginEmail().sendKeys(l.prop.getProperty("Email"));
		l1.loginPassword().sendKeys(l.prop.getProperty("Password"));
		l1.loginButton().click();
		
	
	}	
	

}
