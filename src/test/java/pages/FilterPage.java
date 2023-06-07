package pages;

import org.openqa.selenium.By;

public class FilterPage extends BasePage{
	public By brands=By.xpath("//div[@id='brands_filter']");
	public By Apple3=By.xpath("//*[@id=\"brands\"]//span[text()='Apple (3)']");
	public By spigen=By.xpath("//input[@name='brands:21:spigen']");
	public By CaseMate9=By.xpath("//*[@id=\"brands\"]//input[@name='brands:105:case-mate']");
	public String FilterPageUrl="https://gadgetandgear.com/category/iphone-14-pro-max";
	public By NextPage=By.xpath("//ul[@class='pagination justify-content-center']/li[6]/a");
}
