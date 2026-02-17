package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testbase.BaseClass;

public class TC002_LoginTest extends BaseClass
{
	@Test(groups={"sanity","Master"})
 public void verify_login()
 {
		try
		{
		
	 logger.info("***starting the TC002_LoginTest test case");
//homepage
//	 setup();
	 HomePage hp=new HomePage(driver);
     hp.clickMyAccount();
     hp.clicklogin();
      //loginpage
     LoginPage lg=new LoginPage(driver);
     lg.setEmail(p.getProperty("email"));
     lg.setpassword(p.getProperty("password"));
     lg.clicklogin();
 
 MyAccountPage my_account=new MyAccountPage(driver);
  boolean targetpage  =my_account.ismymsgexsist();
 
 Assert.assertEquals(targetpage ,true) ;
 logger.info("***finshed  TC002_LoginTest excution ******");
		}
 catch (Exception e)
		{
	      Assert.fail();
          
		}		
 


	

}
}