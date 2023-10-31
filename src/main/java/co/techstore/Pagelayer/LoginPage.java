package co.techstore.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.techstore.Utility.Utill;

public class LoginPage {

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='CustomerEmail']")
	private WebElement usernm_txt;
	@FindBy(xpath="//input[@id='CustomerPassword']")
	private WebElement pass_txt;
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	private WebElement login_btn;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	private WebElement forgettpwd_link;
	
	@FindBy(xpath="//li[contains(text(),'Incorrect email or password.')]")
	private WebElement getalertmsg_txt;
	
	public void enterusernm_txt(String usernm)
	{
		usernm_txt.sendKeys(usernm);
	}
	
	public void enterpass_txt(String password)
	{
		pass_txt.sendKeys(password);
	}
	
	public void clicklogin_btn()
	{
		login_btn.click();
	}
	public void clickforgetpwd_link()
		{
		forgettpwd_link.click();
	}
	
	public String getalrtmsg_txt()
	{
		return Utill.getmessage(getalertmsg_txt);
	}
	
}
