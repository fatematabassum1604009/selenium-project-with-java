package testcases;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.HomePage;
import pages.SearchResultPage;
import utilities.DriverSetup;

public class SearchResultPageTest extends DriverSetup{
	SearchResultPage searchResultPage=new SearchResultPage();
	BasePage basePage=new BasePage();
	HomePage homePage=new HomePage();
@Test
public void isProductAvailable() {
	getDriver().get(homePage.HomePageUrl);
	getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	homePage.searchProduct("phone");
	basePage.takeScreenShot("searching product");
	assertTrue(basePage.isDisplayedElement(searchResultPage.searchedProduct));
}
}
