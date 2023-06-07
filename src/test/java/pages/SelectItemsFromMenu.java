package pages;

import static utilities.DriverSetup.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectItemsFromMenu extends BasePage{
	public By mainMenu=By.xpath("//ul[@class='nav nav-mega-menu d-none d-lg-flex']/li");
	public By allAccessories=By.xpath("//*[@id=\"gng-main-menu\"]/div/div/div/ul/li[4]/div/ul/li");
	public By allCasesAndScreenProtectors=By.xpath("//*[@id=\"gng-main-menu\"]/div/div/div/ul/li[4]/div/ul/li[1]/ul/li");
	public By allApple=By.xpath("//*[@id=\"gng-main-menu\"]/div/div/div/ul/li[4]/div/ul/li[1]/ul/li[1]/ul/li");
	public String UrlAfterClickiPhone14ProMaxCases="https://gadgetandgear.com/category/iphone-14-pro-max";
	public By Accessories=By.xpath("//ul[@class='nav nav-mega-menu d-none d-lg-flex']/li[4]");
	public By CasesScreenProtector=By.linkText("Cases & Screen Protector");
	public By Apple=By.linkText("Apple");
	public By iPhone14ProMaxCases=By.xpath("//*[@id=\"gng-main-menu\"]//a[text()='iPhone 14 Pro Max Cases']");
	
	public void getAMainMenu(String menu) {
		List<WebElement>alloptions=getElements(mainMenu);
		for(int i=0; i<alloptions.size(); i++) {
			if(alloptions.get(i).getText().contains(menu)) {
				Actions action=new Actions(getDriver());
				action.moveToElement(alloptions.get(i)).perform();
				break;
	} }
	}
	public void getOneFromallAccessories(String menu) {
		List<WebElement>alloptions=getElements(allAccessories);
		for(int i=0; i<alloptions.size(); i++) {
			if(alloptions.get(i).getText().contains(menu)) {
				Actions action=new Actions(getDriver());
				action.moveToElement(alloptions.get(i)).perform();
				break;
	} }
	}
	public void getOneFromallCasesAndScreenProtectors(String menu) {
		List<WebElement>alloptions=getElements(allCasesAndScreenProtectors);
		for(int i=0; i<alloptions.size(); i++) {
			if(alloptions.get(i).getText().contains(menu)) {
				Actions action=new Actions(getDriver());
				action.moveToElement(alloptions.get(i)).perform();
				break;
	} }
	}
	public void clickOneFromallApple(String menu) {
		List<WebElement>alloptions=getElements(allApple);
		for(int i=0; i<alloptions.size(); i++) {
			if(alloptions.get(i).getText().contains(menu)) {
				alloptions.get(i).click();
				break;
	} }
	}
}
