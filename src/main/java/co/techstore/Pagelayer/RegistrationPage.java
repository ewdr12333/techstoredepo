package co.techstore.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.techstore.Testbase.Testbase;
import co.techstore.Utility.Utill;

public class RegistrationPage extends Testbase {
	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//header/div[1]/a[1]/*[1]")
	private WebElement login_btn;
	@FindBy(xpath="//a[contains(text(),'Create account')]")
	private WebElement register_link;
	@FindBy(xpath="//input[@id='RegisterForm-FirstName']")
	private WebElement fname_txt;
	@FindBy(xpath="//input[@id='RegisterForm-LastName']")
	private WebElement lname_txt;
	@FindBy(xpath="//input[@id='RegisterForm-email']")
	private WebElement email_txt;
	@FindBy(xpath="//input[@id='RegisterForm-password']")
	private WebElement pass_txt;
	@FindBy(xpath="//button[contains(text(),'Create')]")
	private WebElement create_btn;
	
	@FindBy(xpath="//h2[@class='form__message']")
	private WebElement message_text;
	
	
	public void clicklogin_btn()
	{
		login_btn.click();
	}
	
	public void clickregister_link()
	{
		register_link.click();
	}
	public void enterfname_txt(String fname)
	{
		fname_txt.sendKeys(fname);
	}
	public void enterlname_txt(String lname)
	{
		lname_txt.sendKeys(lname);
	}
	public void enteremail_txt(String email)
	{
		email_txt.sendKeys(email);
	}
	public void enterpassword_txt(String Pass)
	{
		pass_txt.sendKeys(Pass);
	}
	public void clickcreate_btn()
	{
		create_btn.click();
	}
	public String getmessage_text()
	{
		return Utill.getmessage(message_text);
	}
	
}
