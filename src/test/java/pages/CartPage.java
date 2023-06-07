package pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage{
public By proceedtocheckout=By.xpath("//a[contains(text(),'proceed to checkout')]");
public By successMsg=By.xpath("//p[text()='Product successfully added to cart.']");
public By cartBtn=By.xpath("//div[@class='gng-header__btn gng-header__btn__cart ml-16']");
public By plus=By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div/div[2]/div[1]/div/a[2]");
public By UNITPRICE=By.xpath("//div[@class='row mb-3 mb-lg-0']/p[2]");
public By SubTotal=By.xpath("//p[@class=' col mb-0 text-right text-bold']");

public double getUNITPRICE() {
	String UnitPrice=getElement(UNITPRICE).getText();
	UnitPrice=UnitPrice.replaceAll("[^0-9]", "");
	double finalUnitPrice=Double.parseDouble(UnitPrice);
	return finalUnitPrice;
}
public double getSubTotal() {
	String SubTotalPrice=getElement(SubTotal).getText();
	SubTotalPrice=SubTotalPrice.replaceAll("[^0-9]", "");
	double finalSubTotalPrice=Double.parseDouble(SubTotalPrice);
	return finalSubTotalPrice;
}
}
