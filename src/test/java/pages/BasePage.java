package pages;

import static utilities.DriverSetup.getDriver;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.qameta.allure.Allure;

public class BasePage {
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}
	public List<WebElement> getElements(By locator) {
		return getDriver().findElements(locator);
	}
	public boolean isDisplayedElement(By locator) {
		return getElement(locator).isDisplayed();
	}
	public void writeText(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	public void closePopUp(By locator) throws InterruptedException {
		getDriver().switchTo().frame("chat widget");
		getElement(locator).click();
		Thread.sleep(2000);
		getDriver().switchTo().parentFrame();
	}
	public void movingToElement(By locator) {
		Actions action=new Actions(getDriver());
		action.moveToElement(getElement(locator)).perform();
	}
	public List<String> windowHandling(){
		Set<String> windowHandles=getDriver().getWindowHandles();
		ArrayList<String> windowHandleList=new ArrayList<String>(windowHandles);
		//int size=windowHandleList.size();
		//System.out.println("window or tab number: "+size);
		return windowHandleList;
		}
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
	}
}
