package testcases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.HomePage;
import pages.SelectItemsFromMenu;
import utilities.DriverSetup;

public class SelectItemsFromMenuTest extends DriverSetup{
	SelectItemsFromMenu selectItemsFromMenu=new SelectItemsFromMenu();
	BasePage basePage = new BasePage();
	HomePage homePage=new HomePage();
	@Test(description = "Select Items From Menu Test")
	public void iPhone14ProMaxCasesTestImproved() throws InterruptedException {
		getDriver().get(homePage.HomePageUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		Thread.sleep(5000);
		selectItemsFromMenu.getAMainMenu("ACCESSORIES");
		Thread.sleep(5000);
		selectItemsFromMenu.getOneFromallAccessories("Cases & Screen Protector");
		Thread.sleep(5000);
		selectItemsFromMenu.getOneFromallCasesAndScreenProtectors("Apple");
		Thread.sleep(5000);
		selectItemsFromMenu.clickOneFromallApple("IPhone 14 Pro Max Cases");
		Thread.sleep(5000);
		basePage.takeScreenShot("after clicking iPhone 14 Pro Max Cases");
		assertEquals(getDriver().getCurrentUrl(), selectItemsFromMenu.UrlAfterClickiPhone14ProMaxCases);
}
	@Test(description = "Select Items From Menu Test")
	public void iPhone14ProMaxCasesTest() {
		getDriver().get(homePage.HomePageUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		basePage.movingToElement(selectItemsFromMenu.Accessories);
		basePage.movingToElement(selectItemsFromMenu.CasesScreenProtector);
		basePage.movingToElement(selectItemsFromMenu.Apple);
		basePage.clickOnElement(selectItemsFromMenu.iPhone14ProMaxCases);
		basePage.takeScreenShot("after clicking iPhone 14 Pro Max Cases");
		assertEquals(getDriver().getCurrentUrl(), selectItemsFromMenu.UrlAfterClickiPhone14ProMaxCases);
}
}
