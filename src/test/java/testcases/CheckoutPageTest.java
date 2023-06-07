package testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.BasePage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.FilterPage;
import pages.HomePage;
import pages.SearchResultPage;
import utilities.DriverSetup;

public class CheckoutPageTest extends DriverSetup{
	CheckoutPage checkoutPage=new CheckoutPage();
	HomePage homePage=new HomePage();
	CartPage cartPage=new CartPage();
	FilterPage filterPage=new FilterPage();
	AddToCartPage addToCartPage=new AddToCartPage();
	BasePage basePage=new BasePage();
	SearchResultPage searchResultPage=new SearchResultPage();
	@Test
	public void checkoutPageTest() throws InterruptedException {
		getDriver().get(homePage.HomePageUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		homePage.searchProduct("phone");
		basePage.clickOnElement(filterPage.brands);
		Thread.sleep(2000);
		basePage.clickOnElement(filterPage.spigen);
		basePage.clickOnElement(searchResultPage.searchedProduct);
		basePage.clickOnElement(addToCartPage.black);
		basePage.clickOnElement(addToCartPage.addToCartButton);
		basePage.clickOnElement(cartPage.cartBtn);
		basePage.clickOnElement(checkoutPage.proceedtocheckout);
		basePage.writeText(checkoutPage.shippingName, "fatema tabassum");
		basePage.writeText(checkoutPage.shippingaddress, "fatema tabassum");
		checkoutPage.selectDistrict("Comilla");
		Thread.sleep(2000);
		checkoutPage.selectZip("Muradnagar - 3540");
		Thread.sleep(2000);
		basePage.writeText(checkoutPage.shippingmobile, "01531847062");
		basePage.writeText(checkoutPage.shippingmail, "fat@gmail.com");
		basePage.clickOnElement(checkoutPage.BillingAddress);
		Thread.sleep(2000);
		basePage.clickOnElement(checkoutPage.billingSameAddressShipping);
		basePage.takeScreenShot("checkout info");
		basePage.clickOnElement(checkoutPage.confirmOrder);
		basePage.takeScreenShot("after clicking confirm Order button");
		Thread.sleep(2000);
	}
}
