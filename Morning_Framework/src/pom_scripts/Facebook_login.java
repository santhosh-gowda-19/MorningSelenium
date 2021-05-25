package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class Facebook_login extends Base_Page
{
	//declaration
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement logIn;
	
	//initialization
	public Facebook_login(WebDriver driver)
	{
		super(driver);
	}
	//utilization
	
	public void setEmail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void setPass(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void passBtn()
	{
		logIn.click();
	}
}
