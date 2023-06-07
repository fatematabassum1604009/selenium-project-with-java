package testcases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.HomePage;
import pages.SignUpPage;
import utilities.DriverSetup;

public class SignUpPageTest extends DriverSetup{
	SignUpPage signUpPage=new SignUpPage();
	BasePage basePage=new BasePage();
	HomePage homePage=new HomePage();
	@Test(description = "sign Up Manually test")
	public void signUpManually() {
		getDriver().get(homePage.HomePageUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		basePage.movingToElement(homePage.MYACCOUNT);
		basePage.clickOnElement(homePage.SignUpButton);
		getDriver().switchTo().window(basePage.windowHandling().get(0));
		basePage.writeText(signUpPage.Name, "Taufiqur Rahaman");
		basePage.writeText(signUpPage.Email, "taufiqrahaman@gmail.com");
		basePage.writeText(signUpPage.Password, "123456taufiq");
		basePage.writeText(signUpPage.ConfirmPassword, "123456taufiq");
		basePage.clickOnElement(signUpPage.TermsConditions);
		basePage.takeScreenShot("sign up info");
		basePage.clickOnElement(signUpPage.CreateMyAccountButton);
		basePage.takeScreenShot("after clicking Create My Account Button");
		assertEquals(getDriver().getCurrentUrl(), homePage.HomePageUrl);
	}
	
}
