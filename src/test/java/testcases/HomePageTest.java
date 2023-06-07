package testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.HomePage;
import pages.StoreLocatorPage;
import utilities.DriverSetup;

public class HomePageTest extends DriverSetup{
	HomePage homePage= new HomePage();
	BasePage basePage=new BasePage();
	StoreLocatorPage storeLocatorPage=new StoreLocatorPage();
	@Test
	public void verifyTitle() {
		getDriver().get(homePage.HomePageUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		assertEquals(getDriver().getTitle(), "Apple Authorised Reseller in Bangladesh - Gadget & Gear");
	}
	@Test
	public void scrollAndGoToAboutUs() {
		getDriver().get(homePage.HomePageUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		basePage.movingToElement(homePage.AboutUs);
		basePage.clickOnElement(homePage.AboutUs);
		assertEquals(getDriver().getCurrentUrl(), homePage.AboutUsUrl);
	}
	@Test
	public void StoreLocator() {
		getDriver().get(homePage.HomePageUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		basePage.clickOnElement(homePage.StoreLocator);
		assertEquals(getDriver().getTitle(), storeLocatorPage.StoreLocatorPageTitle);
	}
	@Test
	public void logoValidate() {
		getDriver().get(homePage.HomePageUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		assertTrue(basePage.isDisplayedElement(homePage.Logo),"No image is exist");
	}
	@Test
	public void SearchItem() {
		getDriver().get(homePage.HomePageUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage.searchProduct("phone");
		basePage.takeScreenShot("searching for phone");
		assertEquals(getDriver().getCurrentUrl(), "https://gadgetandgear.com/search?keyword=phone");
	}
}
