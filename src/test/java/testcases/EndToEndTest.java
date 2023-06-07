package testcases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.BasePage;
import pages.CartPage;
import pages.FilterPage;
import pages.HomePage;
import pages.SearchResultPage;
import utilities.DriverSetup;

public class EndToEndTest extends DriverSetup{
	HomePage homePage=new HomePage();
	CartPage cartPage=new CartPage();
	FilterPage filterPage=new FilterPage();
	AddToCartPage addToCartPage=new AddToCartPage();
	BasePage basePage=new BasePage();
	SearchResultPage searchResultPage=new SearchResultPage();
	@Test
public void endToendTest() {
	getDriver().get(homePage.HomePageUrl);
	getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	homePage.searchProduct("phone");
	basePage.clickOnElement(filterPage.brands);
	basePage.clickOnElement(filterPage.spigen);
	basePage.clickOnElement(searchResultPage.searchedProduct);
	basePage.clickOnElement(addToCartPage.black);
	basePage.clickOnElement(addToCartPage.addToCartButton);
	basePage.clickOnElement(cartPage.cartBtn);
	basePage.clickOnElement(cartPage.plus);
	double unitPrice=cartPage.getUNITPRICE();
	double subTotalPrice=cartPage.getSubTotal();
	assertEquals(unitPrice*2, subTotalPrice);
}
}
