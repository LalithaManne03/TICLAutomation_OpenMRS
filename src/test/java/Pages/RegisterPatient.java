package Pages;

import java.time.Duration;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPatient{
	
	WebDriver driver;
	
	public  RegisterPatient(WebDriver driver) {
		this.driver = driver;
	}
	
	By RegisterButton = By.xpath("//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']");
	
	By Name = By.xpath("//input[@name='givenName']");
	By FamilyName = By.xpath("//input[@name='familyName']");
	By NextButton = By.xpath("//button[@id='next-button']");
	
	By Gender = By.id("gender-field");
	By Birthday = By.xpath("//input[@id='birthdateDay-field']");
	By Month = By.id("birthdateMonth-field");
	By Year = By.xpath("//input[@id='birthdateYear-field']");
	
	
	By Address = By.xpath("//input[@id=\"address1\"]");
	By PatientID = By.xpath("//*[@class=\"patient-header row \"]/div[2]/div/span");
	By ConfirmButton = By.id("submit");
	
	
	public void registerButton()
	{
		driver.findElement(RegisterButton).click();
	}
	
	public void givenName() {
		driver.findElement(Name).sendKeys("AlphaBetaG");
		
	}
	public void familyName() {
		driver.findElement(FamilyName).sendKeys("Krishna");
	}
	public void nextButton() {
		driver.findElement(NextButton).click();
	}
	
	public void selectGender() {
		WebElement gender = driver.findElement(Gender);
	    Select obj = new Select(gender);
	    obj.selectByVisibleText("Male");
	}
	
	public void selectBirthday() {
		driver.findElement(Birthday).sendKeys("19");
	}
	public void selectMonth() {
		WebElement month = driver.findElement(Month);
	    Select mon = new Select(month);
	    mon.selectByVisibleText("September");
	}
	public void selectYear() {
		driver.findElement(Year).sendKeys("2013");
	}
	public void address() {
		 driver.findElement(Address).sendKeys("Vihanga");
	}
	public void confirmRegistration()
	{
		driver.findElement(ConfirmButton).click();
	}
	
	public void verifyRegistration() {
		
		WebDriverWait wdw=new WebDriverWait(driver,Duration.ofSeconds(30));
		wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"patient-header row \"]/div[2]/div/span")));
				
				boolean patientId =  driver.findElement(By.xpath("//*[@class=\"patient-header row \"]/div[2]/div/span")).isDisplayed();
				Assert.assertTrue(patientId, "Patient Id should generate ");
	}
	
}