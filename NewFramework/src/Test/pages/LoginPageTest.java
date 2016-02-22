package Test.pages;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BasePageTest;
import com.pages.LoginPage;

public class LoginPageTest extends BasePageTest{
	
	LoginPage lp;	
	
	@BeforeClass
	public void initialize()
	{		
		lp =new LoginPage(driver);
	}
		
    @Test
    public void performLogin()
    {
    	String actual = lp.performLogin("nehaagarwal_14@yahoo.co.in","Parnika@123");
    	assertEquals("http://whiteboxqa.com/login.php",actual);
    			
    }
    
}
