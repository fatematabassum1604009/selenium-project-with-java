package pages;

import org.openqa.selenium.By;

public class SignUpPage {
	
	public By Name=By.xpath("//input[@id='full_name']");
	public By Email=By.xpath("//input[@id='signup-email']");
	public By Password=By.xpath("//input[@id='signup-password']");
	public By ConfirmPassword=By.xpath("//input[@id='confirmpassword']");
	public By  TermsConditions=By.xpath("//input[@id='terms_condition']");
	public By CreateMyAccountButton=By.xpath("//span[contains(text(),'Create My Account')]");
	public By GoogleButton=By.xpath("//body/div[@id='authModal']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]");
	public By EmailorPhoneGoogle=By.xpath("//input[@id='identifierId']");
	public By PasswordGoogle=By.xpath("//input[@name='password']");
	public By NextButtonGoogle=By.xpath("//span[contains(text(),'Next')]");
}
