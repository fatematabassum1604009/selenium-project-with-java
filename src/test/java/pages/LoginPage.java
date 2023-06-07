package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	public By passwordFieldGoogle=By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
	public By nextBtnGoogle=By.xpath("//span[contains(text(),'Next')]");
	public By emailFieldGoogle=By.xpath("//input[@id='identifierId']");
	public By googleBtn=By.xpath("//*[@id=\"userLogin\"]/div[1]/div/div[4]/div[2]/a");
	public By emailField=By.xpath("//input[@id='email']");
	public By passwordField=By.xpath("//input[@id='password']");
	public By SignInButton=By.xpath("//button[@id='sign-in']");
	public By ErrorMsgInvalidCredential=By.xpath("//div[contains(text(),'Invalid credentials provided.')]");
	public By ErrorMsgInvalidEmail=By.xpath("//*[@id=\"logIn\"]/div[1]/div");
	public By ErrorMsgInvalidPassword=By.xpath("//*[@id=\"logIn\"]/div[2]/div");
	
	public void doLogin(String email, String password) throws InterruptedException {
		writeText(emailField, email);
		Thread.sleep(5000);
		writeText(passwordField, password);
		takeScreenShot("login info");
		clickOnElement(SignInButton);
	}
}
