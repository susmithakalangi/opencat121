package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegestration extends BasePage

{
//constructor
	public AccountRegestration(WebDriver driver) {
		super(driver);
	}

	// elements

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastName;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txttelephone;

	// passowrd
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPassword;

	// @FindBy(xpath = "//label[normalize-space()='No']") WebElement
	// chksubscElement;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkprivacy;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgconfirmations;

	// Methods

	public void setfirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void settelephone(String tel) {
		txttelephone.sendKeys(tel);
	}

	public void setPassword(String Password) {
		txtPassword.sendKeys(Password);
	}

	public void setConfirmPassword(String confPassword) {
		txtConfirmPassword.sendKeys(confPassword);
	}

	public void checkPrivacyPolicy() {
		chkprivacy.click();
	}

	public void clickConitinue() {
		btnContinue.click();
	}

	public String confirmationmsg() {
		try {
			return (msgconfirmations.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}

	}
}