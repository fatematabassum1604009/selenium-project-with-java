package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage{
public By confirmOrder=By.xpath("//span[@id='submitBtmText']");
public By proceedtocheckout=By.xpath("//a[contains(text(),'proceed to checkout')]");
public By shippingName=By.xpath("//input[@id='name']");
public By shippingaddress=By.xpath("//textarea[@id='address']");
public By shippingSelectDistrict=By.xpath("//span[@id='select2-district-container']");
public By allDistricts=By.xpath("//select[@id='district']/option");
public By shippingSelectZip=By.xpath("//span[@id='select2-zip-container']");
public By allZips=By.xpath("//select[@id='zip']/option");
public By shippingmobile=By.xpath("//input[@id='mobile']");
public By shippingmail=By.xpath("//input[@id='mail-address']");
public By BillingAddress=By.xpath("//strong[contains(text(),'Billing Address')]");
public By billingSameAddressShipping=By.xpath("//input[@id='billingSameAddressShipping']");
public void selectDistrict(String district) {
	clickOnElement(shippingSelectDistrict);
	List<WebElement>alloptions=getElements(allDistricts);
	for(int i=0; i<alloptions.size(); i++) {
		if(alloptions.get(i).getText().contains(district)) {
			alloptions.get(i).click();
			break;
} }
}
public void selectZip(String zip) {
	clickOnElement(shippingSelectZip);
	List<WebElement>alloptions=getElements(allZips);
	for(int i=0; i<alloptions.size(); i++) {
		if(alloptions.get(i).getText().contains(zip)) {
			alloptions.get(i).click();
			break;
} }
}
}
