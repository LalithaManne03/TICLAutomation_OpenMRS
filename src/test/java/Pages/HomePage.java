package Pages;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
 
public class HomePage {
 
WebDriver driver;
	
	public  HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By validMessage = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a");
	
	public void validMessage()
	{
		WebElement logoutbutton =driver.findElement(validMessage);
		 Assert.assertEquals(logoutbutton.getText(),"Logout");
	}
}
 