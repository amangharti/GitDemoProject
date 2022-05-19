package flows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Flow1 {

	WebDriver driver;

	public Flow1(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how=How.ID, using = "nav-hamburger-menu")
	WebElement menu;

	@FindBy(how=How.XPATH, using = "//ul[contains(@class,'hmenu-visible')]/li/a[contains(., 'Amazon Prime Video')]")
	WebElement prime;

	@FindBy(how=How.XPATH, using = "//ul[contains(@class,'hmenu-visible')]/li/a[contains(.,'All Videos')]")
	WebElement allVideo;
	
	
	public void PrimeMenu(){
		menu.click();
		prime.click();
		allVideo.click();
		String ActualResult = driver.getTitle();
		Assert.assertEquals(ActualResult,"Welcome to Prime Video");
	}
}
