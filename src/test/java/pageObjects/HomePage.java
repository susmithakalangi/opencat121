package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}

//elements
	@FindBy(xpath = "//span[@class='caret']")
	WebElement lnkMyaccount;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegester;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement lnklogin;
//actions methods

	public void clickMyAccount() {
		lnkMyaccount.click();
	}

	public void clickRegester() {
		lnkRegester.click();
	}

	public void clicklogin() {
		lnklogin.click();
	}
}
