package co.techstore.Testlaer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.techstore.Pagelayer.RegistrationPage;
import co.techstore.Testbase.Testbase;
import co.techstore.Utility.Utill;

public class RegistrationTest extends Testbase{
	@Test
	public void validateRegistration() throws IOException
	{
		RegistrationPage RegistrationPage_obj=new RegistrationPage(driver);
		RegistrationPage_obj.clicklogin_btn();
		RegistrationPage_obj.clickregister_link();
		RegistrationPage_obj.enterfname_txt(Utill.writeData("register", 2, 0));
		RegistrationPage_obj.enterlname_txt(Utill.writeData("register", 2, 1));
		RegistrationPage_obj.enteremail_txt(Utill.writeData("register", 2, 2));
		RegistrationPage_obj.enterpassword_txt(Utill.writeData("register", 2, 3));
		RegistrationPage_obj.clickcreate_btn();
		String actual="https://techstore.co.in/";
		String expect=driver.getCurrentUrl();
		if(actual.equals(expect))
		{
			Utill.readdata(0, 2, 4, "Pass");
		}
		else
		{
			Utill.readdata(0, 2, 4, "Fail");
		}
		
		Assert.assertEquals(actual, expect);
	}

	@Test(enabled=false)
	public void validateRegistration1() throws IOException
	{
		RegistrationPage RegistrationPage_obj=new RegistrationPage(driver);
		RegistrationPage_obj.clicklogin_btn();
		RegistrationPage_obj.clickregister_link();
		RegistrationPage_obj.enterfname_txt(Utill.writeData("register", 1, 0));
		RegistrationPage_obj.enterlname_txt(Utill.writeData("register", 1, 1));
		RegistrationPage_obj.enteremail_txt(Utill.writeData("register", 1, 2));
		RegistrationPage_obj.enterpassword_txt(Utill.writeData("register", 1, 3));
		RegistrationPage_obj.clickcreate_btn();
		String actual="https://techstore.co.in/";
		String expect=driver.getCurrentUrl();
		String warningmsg=RegistrationPage_obj.getmessage_text();
		if(actual.equals(expect))
		{
			Utill.readdata(0, 1, 4, "Pass");
			
		}
		else
		{
			Utill.readdata(0, 1, 4, "Fail");
			Utill.readdata(0, 1, 5, warningmsg);
		}
		
		Assert.assertEquals(actual, expect);
	}
	
}
