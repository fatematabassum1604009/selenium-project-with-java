package testcases;
import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.FilterPage;
import utilities.DriverSetup;

public class FilterTest extends DriverSetup{
	FilterPage filterPage=new FilterPage();
	BasePage basePage=new BasePage();
	@Test
public void filterBrands() {
	getDriver().get(filterPage.FilterPageUrl);
	getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	basePage.clickOnElement(filterPage.brands);
	basePage.clickOnElement(filterPage.Apple3);
	basePage.clickOnElement(filterPage.brands);
	basePage.clickOnElement(filterPage.CaseMate9);
	basePage.takeScreenShot("filtering");
	assertEquals(getDriver().getCurrentUrl(),"https://gadgetandgear.com/category/iphone-14-pro-max?filters=0:brands:5:apple,1:brands:105:case-mate");
}
	@Test
	public void scrollAndGoNextPage() {
		getDriver().get(filterPage.FilterPageUrl);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		basePage.movingToElement(filterPage.NextPage);
		basePage.clickOnElement(filterPage.NextPage);
		basePage.takeScreenShot("after clicking next button to go to next page");
		assertEquals(getDriver().getCurrentUrl(), "https://gadgetandgear.com/category/iphone-14-pro-max?page=2");
	}
}
