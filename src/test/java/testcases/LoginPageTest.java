package testcases;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;
import utilities.DriverSetup;
import utilities.InvalidEmail;
import utilities.InvalidEmail;
import utilities.InvalidPassword;
import utilities.LoginDataset;

public class LoginPageTest extends DriverSetup{
	SignUpPage signUpPage=new SignUpPage();
	BasePage basePage=new BasePage();
	HomePage homePage=new HomePage();
	LoginPage loginPage=new LoginPage();
	@Test(description = "sign In Manually with Valid Credentials")
	@Description("sign In Manually with Valid Credentials")
	public void signInManuallyValidCredentials() throws InterruptedException {
		getDriver().get(homePage.HomePageUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		basePage.movingToElement(homePage.MYACCOUNT);
		basePage.clickOnElement(homePage.SignIn);
		getDriver().switchTo().window(basePage.windowHandling().get(0));
		Thread.sleep(2000);
		loginPage.doLogin("taufiqrahaman@gmail.com", "123456taufiq");
		basePage.takeScreenShot("after cliccking login button");
		assertEquals(getDriver().getCurrentUrl(), homePage.HomePageUrl);
	}
	@Test(dataProvider = "invalidCredentials",dataProviderClass = LoginDataset.class,description = "sign In Manually with inValid Credentials")
	public void signInManuallyInvalidCredentials(String username, String password, String errormsg) throws InterruptedException {
		getDriver().get(homePage.HomePageUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		basePage.movingToElement(homePage.MYACCOUNT);
		basePage.clickOnElement(homePage.SignIn);
		getDriver().switchTo().window(basePage.windowHandling().get(0));
		Thread.sleep(2000);
		loginPage.doLogin(username, password);
		assertEquals(basePage.getElement(loginPage.ErrorMsgInvalidCredential).getText(), errormsg);
	}
	@Test(dataProvider = "invalidCredentialEmail",dataProviderClass = LoginDataset.class,description = "sign In Manually with inValid Credentials")
	public void signInManuallyInvalidEmail(String username, String password, String errormsg) throws InterruptedException {
		getDriver().get(homePage.HomePageUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		basePage.movingToElement(homePage.MYACCOUNT);
		basePage.clickOnElement(homePage.SignIn);
		getDriver().switchTo().window(basePage.windowHandling().get(0));
		Thread.sleep(2000);
		loginPage.doLogin(username, password);
		assertEquals(basePage.getElement(loginPage.ErrorMsgInvalidEmail).getText(), errormsg);
	}
	@Test(dataProvider = "invalidCredentialPassword",dataProviderClass = LoginDataset.class,description = "sign In Manually with inValid Credentials")
	public void signInManuallyInvalidPassword(String username, String password, String errormsg) throws InterruptedException {
		getDriver().get(homePage.HomePageUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		basePage.movingToElement(homePage.MYACCOUNT);
		basePage.clickOnElement(homePage.SignIn);
		getDriver().switchTo().window(basePage.windowHandling().get(0));
		Thread.sleep(2000);
		loginPage.doLogin(username, password);
		assertEquals(basePage.getElement(loginPage.ErrorMsgInvalidPassword).getText(), errormsg);
	}
	@Test(description = "sign In Manually with inValid Credentials")
	public void signInWithGoogle() throws InterruptedException {
		getDriver().get(homePage.HomePageUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		basePage.movingToElement(homePage.MYACCOUNT);
		basePage.clickOnElement(homePage.SignIn);
		getDriver().switchTo().window(basePage.windowHandling().get(0));
		basePage.clickOnElement(loginPage.googleBtn);
		basePage.writeText(loginPage.emailFieldGoogle, "u1604009@student.cuet.ac.bd");
		Thread.sleep(2000);
		basePage.clickOnElement(loginPage.nextBtnGoogle);
		basePage.writeText(loginPage.passwordFieldGoogle, "Allah1604009");
		Thread.sleep(5000);
		basePage.clickOnElement(loginPage.nextBtnGoogle);
		Thread.sleep(2000);
		assertEquals(getDriver().getCurrentUrl(), homePage.HomePageUrl);
	}
}
