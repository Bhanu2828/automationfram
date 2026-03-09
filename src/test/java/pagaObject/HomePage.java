package pagaObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement lnkmyaccount;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkregister;
	
	public void clickMyAccount()
	{
		lnkmyaccount.click();
	}
	
	public void clickRegister()
	{
		lnkregister.click();
	}
	
}
