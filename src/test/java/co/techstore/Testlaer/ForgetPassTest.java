package co.techstore.Testlaer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.techstore.Pagelayer.ForgetPassPage;
import co.techstore.Pagelayer.LoginPage;
import co.techstore.Pagelayer.RegistrationPage;
import co.techstore.Testbase.Testbase;
import co.techstore.Utility.Utill;

public class ForgetPassTest extends Testbase{

	@Test
	public void validateforgetpassword() throws IOException
	{
		RegistrationPage RegistrationPage_obj=new RegistrationPage(driver);
		RegistrationPage_obj.clicklogin_btn();
		LoginPage LoginPage_obj=new LoginPage(driver);
		LoginPage_obj.clickforgetpwd_link();
		ForgetPassPage ForgetPassPage_obj=new ForgetPassPage(driver);
		ForgetPassPage_obj.enterusernm_txt(Utill.writeData("forgotpw", 1, 0));
		ForgetPassPage_obj.clicksubmit_btn();
	    String actual="https://techstore.co.in/account/login";
	    String expect=driver.getCurrentUrl();
	    if(actual.equals(expect))
	    {
	    	Utill.readdata(2, 1, 1, "Pass");
	    }
	    else
	    {
	    	Utill.readdata(2, 1, 1, "fail");
	    }
		Assert.assertEquals(actual, expect);
}
}