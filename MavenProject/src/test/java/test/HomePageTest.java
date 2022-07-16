package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.HomePage;

public class HomePageTest extends BaseTest {
	HomePage hp;
	
	@BeforeClass
	public void initObject() {
	 hp=new HomePage(driver);
		
	}
	
  @Test
  public void logout() {
	 
	  hp.getLink().click();
	  hp.getLogoutLink().click();
	  
  }
}
