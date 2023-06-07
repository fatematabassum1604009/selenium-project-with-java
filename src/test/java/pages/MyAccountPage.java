package pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage{
public By Dashboard=By.xpath("//a[contains(text(),'Dashboard')]");
public By MyCoupons=By.xpath("//a[contains(text(),'My Coupons')]");
public By MyAccountAfterLogin=By.xpath("//div[@class='myaccount-dropdown']/a[1]");
}
