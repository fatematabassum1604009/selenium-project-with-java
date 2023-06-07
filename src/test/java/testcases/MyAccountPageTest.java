package testcases;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import utilities.DriverSetup;

public class MyAccountPageTest extends DriverSetup{
	MyAccountPage myAccountPage=new MyAccountPage();
	BasePage basePage=new BasePage();
	LoginPage loginPage=new LoginPage();
	HomePage homePage=new HomePage();
	@Test
public void validateDashboard() throws InterruptedException {
		getDriver().get(homePage.HomePageUrl);
		Thread.sleep(3000);
		basePage.movingToElement(homePage.MYACCOUNT);
		basePage.clickOnElement(homePage.SignIn);
		loginPage.doLogin("taufiqrahaman@gmail.com", "123456taufiq");
		Thread.sleep(3000);
		basePage.movingToElement(homePage.MYACCOUNT);
		basePage.clickOnElement(myAccountPage.MyAccountAfterLogin);
		Thread.sleep(3000);
		assertTrue(basePage.isDisplayedElement(myAccountPage.Dashboard));
}
	@Test
	public void validateMyCoupons() throws InterruptedException {
			getDriver().get(homePage.HomePageUrl);
			Thread.sleep(3000);
			basePage.movingToElement(homePage.MYACCOUNT);
			basePage.clickOnElement(homePage.SignIn);
			loginPage.doLogin("taufiqrahaman@gmail.com", "123456taufiq");
			Thread.sleep(3000);
			basePage.movingToElement(homePage.MYACCOUNT);
			basePage.clickOnElement(myAccountPage.MyAccountAfterLogin);
			Thread.sleep(3000);
			assertTrue(basePage.isDisplayedElement(myAccountPage.MyCoupons));
	}
}
