package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import flows.Flow1;
import flows.Flow2;



public class Amazon {
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetUpTest() {
		driver = browserconfig.BrowserConfig.open("edge");
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	public void PrimeMenu() {
		Flow1 Prime = PageFactory.initElements(driver, Flow1.class);
		Prime.PrimeMenu();
	}
	
	@Test(priority=2)
	public void Search() {
		Flow2 Searching = PageFactory.initElements(driver, Flow2.class);
		Searching.Search("Kid Movies");
	}
	
	@AfterMethod
	public void After() {
		driver.close();
		System.out.println("Task run successfully");
	}
	
}
