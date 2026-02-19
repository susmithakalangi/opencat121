package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testbase.BaseClass;


public class TC003_Login_DDT extends BaseClass
{
	@Test(dataProvider ="LoginData",dataProviderClass =utilities.DataProviders.class,groups = "dataDriven" )
 public void verify_loginDDT(String email,String pwd ,String exp) throws InterruptedException 
	 {
	logger.info("***excution of TC_003_Login_DDT is strated");
try
{
//homepage
// setup();
 HomePage hp=new HomePage(driver);
 hp.clickMyAccount();
 hp.clicklogin();
  //loginpage
 LoginPage lg=new LoginPage(driver);
 lg.setEmail(email);
 lg.setpassword(pwd);
 lg.clicklogin();
 MyAccountPage my_account=new MyAccountPage(driver);
 boolean targetpage  =my_account.ismymsgexsist();
 
	
	
	if(exp.equalsIgnoreCase("valid"))
	{
		if(targetpage==true)
		{
			my_account.clicklogout();
		    Assert.assertTrue(true );
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	if(exp.equalsIgnoreCase("Invalid"))
	{
		if(targetpage==true)
		{
			my_account.clicklogout();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
}
catch (Exception e) 
{
	Thread.sleep(null);
	e.printStackTrace();                 // shows real exception
    Assert.fail("Test failed due to: " + e.getMessage());
}
}
}
