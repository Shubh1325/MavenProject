package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.LogInPage;

public class LogInTest extends BaseTest {

	LogInPage lp;

	@BeforeClass
	public void initObject() {

		lp = new LogInPage(driver);

	}

	@Test(priority = 1)
	public void verifyButton() {
		System.out.println(lp.isButtonPresent());
		Assert.assertTrue(lp.isButtonPresent());
	}

	@Test(priority = 2)
	public void login() {

		lp.login("Admin", "admin123");
		System.out.println(driver.getTitle());

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

}
