package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UpdatePatientPage {
	
WebDriver driver;
	
	public  UpdatePatientPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By FindPatientButton = By.xpath("//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']");
	By SearchByField= By.xpath("//input[@placeholder='Search by ID or Name']");
	By ResultsTable = By.xpath("//*[@id='patient-search-results-table_wrapper']/table/tbody/tr[1]");
	By EditOption = By.xpath("//span[@id='edit-patient-demographics']");
	By Name = By.xpath("//input[@name='givenName']");
	By SaveButton = By.xpath("//a[@id='save-form']");
	By PersonalName = By.xpath("//span[@class='PersonName-givenName']");
	
	
	public void findpatient()
	{
		driver.findElement(FindPatientButton).click();
	}
	
	public void searchByName() {
		driver.findElement(SearchByField).sendKeys("Gautham");
	}
	
	public void selectPatient() {
		WebElement moveMouse=driver.findElement(ResultsTable);
		Actions ac=new Actions(driver);
		ac.moveToElement(moveMouse).click().perform();
	}
	
	public void editOption() {
		driver.findElement(EditOption).click();
	}
	
	public void updatePatient() {
		 driver.findElement(Name).clear();
		    driver.findElement(Name).sendKeys("GauthamCH");
		    driver.findElement(SaveButton).click();
	}
	

}