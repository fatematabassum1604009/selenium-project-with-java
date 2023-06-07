package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
	public By closepopup=By.xpath("//*[@id=\"tawk-mpreview-close\"]");
	public By SignIn=By.xpath("//button[contains(text(),'Sign In')]");
	public By AlreadyAMemberSignIn=By.xpath("//a[@id='backToLoginIn']");
	public By SignUpButton=By.xpath("//button[contains(text(),'Sign Up')]");
	public String HomePageUrl="https://gadgetandgear.com/";
	public String AboutUsUrl="https://gadgetandgear.com/about-us";
	public By AboutUs=By.xpath("//a[contains(text(),'About Us')]");
	public By Logo=By.xpath("//div[@class='mr-3']");
	public By StoreLocator=By.xpath("//div[@class='gng-header__buttons']/a");
	public By SearchBox=By.xpath("//div[@class='gng-header__right']/form/div/input");
	public By SearchButton=By.xpath("//div[@class='gng-header__right']/form/div/div/button");
	public By MYACCOUNT=By.xpath("//div[@class='gng-header__btn gng-header__btn__myaccount ml-16']");
	
	public void clickSignIn() {
		movingToElement(MYACCOUNT);
		clickOnElement(SignIn);
	}
	public void clickSignInFromSignUpPage() {
		movingToElement(MYACCOUNT);
		clickOnElement(SignUpButton);
		movingToElement(AlreadyAMemberSignIn);
		clickOnElement(AlreadyAMemberSignIn);
	}
	public void searchProduct(String text) {
		writeText(SearchBox,text);
		clickOnElement(SearchButton);
	}
}
