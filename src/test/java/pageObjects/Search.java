package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search extends BasePage {

	public Search(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//i[@class='fa fa-search']")
	WebElement btnsearch;

	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement txtboxsearch;

	public void clickSearchIcon() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btnsearch));

		btnsearch.click();
	}

	public void enterSearchText(String txt) {
		txtboxsearch.clear();
		txtboxsearch.sendKeys(txt);
	}
}
