package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Search;
import testbase.BaseClass;

public class TC_005SearchTest extends BaseClass
{
    @Test
    public void testSearchFunctionality() 
    {
     try
     {
    	 
     
    	Search srch=new Search(driver);
    srch.clickSearchIcon();
    srch.enterSearchText(p.getProperty("searchProductname"));
	 
    }
catch (Exception e) 
     {
	Assert.fail();
}
    }
}