package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PostRegistrationPage {
	
WebDriver driver;
	
	public  PostRegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	

	By ConfirmEditOption = By.xpath("//button[@id='registration-submit']");
	By PersonalName = By.xpath("//span[@class='PersonName-givenName']");



	public void confirmUpdate() {
		driver.findElement(ConfirmEditOption).click();
	}
	
	public void verifyUpdatedName() {
		
		WebDriverWait wdw=new WebDriverWait(driver,Duration.ofSeconds(30));
		wdw.until(ExpectedConditions.visibilityOfElementLocated(PersonalName));
				
				WebElement actual_updated_name =  driver.findElement(PersonalName);
				Assert.assertEquals(actual_updated_name.getText(), "AlphaBetaGGama");
	}
	
}
