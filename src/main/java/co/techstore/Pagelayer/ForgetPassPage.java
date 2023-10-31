package co.techstore.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPassPage {
	
	public ForgetPassPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='RecoverEmail']")
	private WebElement usernm_txt;

	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement submit_btn;
	
	
	public void enterusernm_txt(String userm)
	{
		usernm_txt.sendKeys(userm);
	}
	
	public void clicksubmit_btn()
	{
		submit_btn.click();
	}
}
