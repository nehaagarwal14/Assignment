package Test.pages;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BasePageTest;
import com.pages.HomePage;

public class HomePageTest extends BasePageTest {
	
	HomePage hp;
	
	@BeforeClass
	public void initialize()
	{
	hp = new HomePage(driver);	
	}
	
    @Test
    public void countSocialIcons()
    {
     int actual = hp.countsocialIcons();
     assertEquals(4,actual);
    }
    
    @Test
    public void testloginClick()
    {
     String actual = hp.clickLogin();
     assertEquals("http://whiteboxqa.com/login.php",actual);
    }
}
