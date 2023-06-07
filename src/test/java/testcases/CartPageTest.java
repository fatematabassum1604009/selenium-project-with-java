package testcases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.BasePage;
import pages.CartPage;
import utilities.DriverSetup;

public class CartPageTest extends DriverSetup{
	CartPage cartPage=new CartPage();
	BasePage basePage=new BasePage();
	AddToCartPage addToCartPage=new AddToCartPage();
	@Test
	public void cartPageTest() {
		getDriver().get(addToCartPage.addToCartUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		basePage.clickOnElement(addToCartPage.color);
		basePage.clickOnElement(addToCartPage.rom);
		basePage.clickOnElement(addToCartPage.addToCartButton);
		basePage.clickOnElement(cartPage.cartBtn);
		basePage.clickOnElement(cartPage.plus);
		assertEquals(basePage.getElement(cartPage.successMsg).getText(), "Product successfully added to cart.");
		basePage.clickOnElement(cartPage.proceedtocheckout);
		basePage.takeScreenShot("after clicking proceed to checkout button");
	}
	@Test
	public void SubTotalTest() {
		getDriver().get(addToCartPage.addToCartUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		basePage.clickOnElement(addToCartPage.color);
		basePage.clickOnElement(addToCartPage.rom);
		basePage.clickOnElement(addToCartPage.addToCartButton);
		basePage.clickOnElement(cartPage.cartBtn);
		basePage.clickOnElement(cartPage.plus);
		basePage.takeScreenShot("after increasing number of item");
		double unitPrice=cartPage.getUNITPRICE();
		double subTotalPrice=cartPage.getSubTotal();
		assertEquals(unitPrice*2, subTotalPrice);
	}
}
