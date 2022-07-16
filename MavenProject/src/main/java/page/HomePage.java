package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//*[@id='branding']//a[@id='welcome']")
	private WebElement link;

	@FindBy(xpath = "//*[@id='welcome-menu']/ul/li[3]//a[text()='Logout']")
	private WebElement logoutLink;

	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getLink() {

		return link;
	}

	public WebElement getLogoutLink() {

		return logoutLink;
	}

}
