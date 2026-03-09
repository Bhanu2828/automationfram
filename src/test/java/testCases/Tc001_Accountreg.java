package testCases;


import org.testng.annotations.Test;

import pagaObject.AccountRegister;
import pagaObject.HomePage;

public class Tc001_Accountreg extends BaseClass{

	
	@Test
	public void verify_regist() {
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		AccountRegister ar = new AccountRegister(driver);
		ar.firstName("Bhanu");
		ar.lasrName("bha");
		ar.email("test@123");
		ar.password("test123");
		ar.button();
		

	}

}
