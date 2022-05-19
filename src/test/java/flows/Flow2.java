package flows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Flow2 {
	
	WebDriver driver;
	
	public Flow2(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(how=How.ID, using = "nav-hamburger-menu")
	WebElement menu;
	
	@FindBy(how=How.XPATH, using = "//ul[contains(@class,'hmenu-visible')]/li/a[contains(., 'Amazon Prime Video')]")
	WebElement prime;
	
	@FindBy(how=How.XPATH, using = "//div[contains(@class, 'hmenu-close-icon')]")
	WebElement menu_close;
	
	@FindBy(how=How.XPATH, using = "//input[@id='twotabsearchtextbox']")
	WebElement input;
	
	@FindBy(how=How.XPATH, using = "//input[@id='nav-search-submit-button']")
	WebElement search;
	
	@FindBy(how=How.CLASS_NAME, using = "a-color-state")
	WebElement kidMovies;
	
	public void Search(String movie) {
		menu.click();
		prime.click();
		menu_close.click();
		input.sendKeys(movie);
		search.click();
		String ActualResult = kidMovies.getText();
		Assert.assertEquals(ActualResult, "\"Kid Movies\"");
	}
}
