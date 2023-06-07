package testcases;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.AddToCartPage;
import pages.BasePage;
import utilities.DriverSetup;

public class AddToCartPageTest extends DriverSetup{
	AddToCartPage addToCartPage=new AddToCartPage();
	BasePage basePage=new BasePage();
@Test(description = "add to cart test")	
@Description("add to cart test description using allure")
public void addToCart() {
	getDriver().get(addToCartPage.addToCartUrl);
	getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	basePage.clickOnElement(addToCartPage.color);
	basePage.clickOnElement(addToCartPage.rom);
	basePage.clickOnElement(addToCartPage.addToCartButton);
	basePage.takeScreenShot("after clicking add to cart button");
	assertTrue(basePage.isDisplayedElement(addToCartPage.successMsg));
}
}
