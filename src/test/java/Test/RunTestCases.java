package Test;


import java.io.IOException;
import org.testng.annotations.Test;
import Pages.RegisterPatient;
import Pages.UpdatePatientPage;
import Pages.LoginPage;
import Pages.HomePage;
import Pages.PostRegistrationPage;





public class RunTestCases extends Base{
	

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
 
		LoginPage lp=new LoginPage(driver);
		HomePage hp=new HomePage(driver);

	
		lp.enterUsername("admin");
		lp.enterPassword("Admin123");
		lp.selectLocation();
		lp.signIn();
		Thread.sleep(5000);
		hp.validMessage();
		
	}
	
	@Test
	public void RegisterPatient() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		HomePage hpage = new HomePage(driver);
		RegisterPatient rg = new RegisterPatient(driver);
		
		
		lp.enterUsername("admin");
        lp.enterPassword("Admin123");

		lp.selectLocation();
		lp.signIn();
		Thread.sleep(5000);

		hpage.validMessage();
		rg.registerButton();
		rg.givenName();
		rg.familyName();
		rg.nextButton();
		rg.selectGender();
		rg.nextButton();
		rg.selectBirthday();
		rg.selectMonth();
		rg.selectYear();
		rg.nextButton();
		rg.address();
		rg.nextButton();
		rg.nextButton();
		rg.nextButton();
		rg.confirmRegistration();
		rg.verifyRegistration();
		
		
	}
	
	@Test
	public void UpdatePatient() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		HomePage homepage = new HomePage(driver);
		UpdatePatientPage up = new UpdatePatientPage(driver);
		PostRegistrationPage pg = new PostRegistrationPage(driver);

		
		lp.enterUsername("admin");
        lp.enterPassword("Admin123");
        
		lp.selectLocation();
		
		lp.signIn();
		Thread.sleep(5000);

		homepage.validMessage();
		up.findpatient();
		up.searchByName();
		up.selectPatient();
		up.editOption();
		up.updatePatient();
		pg.confirmUpdate();
		pg.verifyUpdatedName();
		
	}
	
}
