package walmartHomepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;

	}

	public int findHomePagelinks() {

		// driver.get("https://www.walmart.com/");
		List<WebElement> links1 = driver.findElements(By.xpath(".//*[contains(@class,'header-GlobalEyebrowNav-link')]"));
		// return links1.size();
		int result = links1.size();
		System.out.println("Total links on header are :" + result);
		return result;
	}

	/*
	 * public String findAttributeAltTag(){ driver.get("https://walmart.com");
	 * driver.findElements(By.xpath(
	 * ".//*[@class='header-GlobalEyebrowNav-link']"));
	 */

	/*
	 * //click signin
	 * 
	 * public String checksignINlink(){ driver.get("https://walmart.com");
	 * WebDriverWait wait1= new WebDriverWait( driver, 20); //My Account we need
	 * to click
	 * wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
	 * ".header-GlobalAccountFlyout-flyout-link.dropdown-link.font-bold.display-block.btn-fake-link"
	 * ))); WebElement web1= driver.findElement(By.cssSelector(
	 * ".header-GlobalAccountFlyout-flyout-link.dropdown-link.font-bold.display-block.btn-fake-link"
	 * )); web1.click();
	 * 
	 * Actions ac= new Actions(driver); ac.moveToElement(web1).perform();//move
	 * to menu of sign in, create register
	 * wait1.until(ExpectedConditions.visibilityOfElementLocated(By.
	 * linkText("Sign in"))).click(); return driver.getTitle();//Walmart.com:
	 * Free 2-Day Shipping on Millions of Items
	 * 
	 * } //click register
	 */

}
