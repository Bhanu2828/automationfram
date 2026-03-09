package pagaObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegister extends Base {
	
	public AccountRegister(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement buttoncontinue;
	
	public void firstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	public void lasrName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	public void email(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void password(String pword)
	{
		txtpassword.sendKeys(pword);
	}
	public void button()
	{
		buttoncontinue.click();
	}

}
