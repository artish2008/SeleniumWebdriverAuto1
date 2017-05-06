package walmartHomepage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass1;

public class StoreAvailability {

	WebDriver driver;

	public StoreAvailability(WebDriver driver) {
		this.driver = driver;
	}

	public String Storeavailability1() {

		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arti\\workspace1\\walmart12\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();*/

		driver.get("https://www.walmart.com/search/?query=laptop");

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Store availability"))).click();

		// enter zipcode senkeys 94538
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement zipcode = driver.findElement(By.xpath(".//*[@title='Enter zip code']"));
		zipcode.sendKeys("94538");

		// click go button
		WebElement gobutton = driver.findElement(By.id("button"));
		gobutton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// display 5 stores for zipcode 94538
		// driver.findElement(By.xpath(".//*[@title='all stores near
		// 94538']")).click();

		// 5 matching nodes store .//*[@class='option option-small']
		List<WebElement> stores = driver.findElements(By.xpath(".//*[@class='option option-small']"));
		System.out.println(stores.size());
		for (WebElement ww : stores) {
			String storeTitle = ww.getAttribute("aria-label");
			System.out.println(" print 5 locations " + storeTitle);
			// if (storeTitle.contains("Osgood Rd"))
			if (ww.getText().contains("Osgood Rd")) {

				System.out.println("Nearest store is Osgood");
				// ww.getText());

				break;
			}

		}

		return driver.getPageSource();

	}
}
