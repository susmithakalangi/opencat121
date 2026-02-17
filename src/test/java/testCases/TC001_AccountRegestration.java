package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test; 
import pageObjects.AccountRegestration;
import pageObjects.HomePage;
import testbase.BaseClass;


public class TC001_AccountRegestration extends BaseClass
{
@Test(groups = {"reggression","Master"})
  public void verifyAccounrRegistration() 
  {
	try
	{

	logger.info("*****starting TC001_AccountRegestration");
	HomePage hp=new HomePage(driver);
	hp.clickMyAccount();
	logger.info("clicked on my account link");
	hp.clickRegester();
    logger.info("clicked on regester link");
	AccountRegestration arg=new AccountRegestration(driver);
	logger.info("providing all the details");
	arg.setfirstName(randomeString().toUpperCase());
    arg.setLastName(randomeString().toUpperCase()); 
    arg.setEmail(randomeString()+"@gmail.com");
    arg.settelephone(randomnumber());
    String password=  randomAlphanumeric();
    arg.setPassword(password); 
    arg.setConfirmPassword(password);
    arg.checkPrivacyPolicy();
    arg.clickConitinue();
    logger.info("validating expected message");
    String confmsg= arg.confirmationmsg();
    Assert.assertEquals(confmsg,"Your Account Has Been Created!");
	}
    catch(Exception e)
{
	logger.error("test failed");;
    logger.debug("Debug loss");
    Assert.fail();
}
	}
public String randomAlphanumeric()
{
	String genetratedstring=RandomStringUtils.randomAlphabetic(5);
	String generatednumber=RandomStringUtils.randomNumeric(10);
    return (genetratedstring+"@"+generatednumber);
    
    
    
}
public String randomnumber() {
	String generatednumber=RandomStringUtils.randomNumeric(10);
	return generatednumber;
}	
	
}



