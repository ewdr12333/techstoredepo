package co.techstore.Testlaer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.techstore.Pagelayer.LoginPage;
import co.techstore.Pagelayer.RegistrationPage;
import co.techstore.Testbase.Testbase;
import co.techstore.Utility.Utill;

public class LoginTest extends Testbase {
	@Test
	
	public void validatevalidusernameandvalidpassword() throws IOException
	{
		RegistrationPage RegistrationPage_obj=new RegistrationPage(driver);
		RegistrationPage_obj.clicklogin_btn();
		LoginPage LoginPage_obj=new LoginPage(driver);
		LoginPage_obj.enterusernm_txt(Utill.writeData("login", 2, 0));
		LoginPage_obj.enterpass_txt(Utill.writeData("login", 2, 1));
		LoginPage_obj.clicklogin_btn();
	//	String msg=LoginPage_obj.getalrtmsg_txt();
		String actual="https://techstore.co.in/challenge";
		String expect=driver.getCurrentUrl();
		
		if(actual.equals(expect))
		{
			Utill.readdata(1, 2, 2, "Pass");
		}
		else
		{
			Utill.readdata(1, 2, 2, "Fail");
		//	Utill.readdata(1, 2, 3, "msg");
		}
		Assert.assertEquals(actual, expect);
	}

}
