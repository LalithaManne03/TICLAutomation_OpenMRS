package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class SeleniumTestNG_tests extends Base{
	

	@Test
	public void InvalidCredentialsTest() throws IOException, InterruptedException {
 
		LoginPage lp=new LoginPage(driver);
	
		lp.enterUsername("admin");
		lp.enterPassword("Admin");
		lp.selectLocation();
		lp.signIn();
		Thread.sleep(5000);
		lp.InValidMessage();
		
	}

	

	@Test
	public void ValidCredentialsTest() throws IOException, InterruptedException {
 
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);

	
		lp.enterUsername("admin");
		lp.enterPassword("Admin123");
		lp.selectLocation();
		lp.signIn();
		Thread.sleep(5000);
		hp.validMessage();
		
	}
	
	
}
