package travels;

import org.testng.annotations.Test;

public class TestData extands TestcaseRegistration
{
	
	@Test
	public static void userRegistration() throws Exception
	{
		Test l = new Test();
		TestcaseRegistion bc= new TestcaseRegistion();
		//Launch l =new Launch();
		//HomePage h1= new HomePage();
		l.launchPage();
		l.driver.get(l.prop.getProperty("url"));
		bc.signUp();
		
		RegistionPage r1= new RegistionPage();
		r1.firstName().sendKeys(l.prop.getProperty("FirstName"));
		r1.LastName().sendKeys(l.prop.getProperty("LastName"));
		r1.Mobile().sendKeys(l.prop.getProperty("Mobile"));
		r1.Email().sendKeys(l.prop.getProperty("Email"));
		r1.password().sendKeys(l.prop.getProperty("password"));
		r1.ConfirmPassword().sendKeys(l.prop.getProperty("ConfirmPassword"));
		r1.SignUp();
	}	

}