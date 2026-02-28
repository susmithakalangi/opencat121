package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Search;
import testbase.BaseClass;

public class TC004_SearchTest extends BaseClass {
	@Test(groups = { "sanity", "master" })
	public void testSearchFunctionality() {
		try {

			Search srch = new Search(driver);
			srch.clickSearchIcon();
			srch.enterSearchText(p.getProperty("searchProductname"));
			srch.clickSearchIcon();
			srch.scrollToFooter();
			 srch.isIphoneImageDisplayed();
		} catch (Exception e) {
			Assert.fail();
		}
	}

}