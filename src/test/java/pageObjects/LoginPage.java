package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage

{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

@FindBy(xpath = "//input[@id='input-email']") WebElement txtemail;

@FindBy(xpath="//input[@id='input-password']") WebElement txtpassword;

@FindBy(xpath="//input[@value='Login']") WebElement btnlogin;

	
public void setEmail(String email) 
{
	txtemail.clear();
	txtemail.sendKeys(email.trim());
	
}	
public void setpassword(String pwd) 
{
	txtpassword.clear();
	txtpassword.sendKeys(pwd.trim());
	
}	
public void clicklogin() 
{
	btnlogin.click();
}
}