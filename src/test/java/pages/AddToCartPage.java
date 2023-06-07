package pages;

import org.openqa.selenium.By;

public class AddToCartPage {
public By successMsg=By.xpath("//p[text()='Product successfully added to cart. Click here to ']");
public By rom=By.xpath("//span[contains(text(),'256GB')]");
public By black=By.xpath("//label[@class='mr-2 mb-1']/div");
public By color=By.xpath("//*[@id=\"addToCart\"]//div[@class='box p-2  color ']/span//span[@data-pt-title='Silver']");
public By addToCartButton=By.xpath("//button[@id='add-to']");
public String addToCartUrl="https://gadgetandgear.com/product/ipad-pro-12-9-inch-m2-chip";

}
