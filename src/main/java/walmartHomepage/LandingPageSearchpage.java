package walmartHomepage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPageSearchpage {
	
	WebDriver driver;
	
	public void searchPage(){
		
		//List<WebElement> links= driver.findElements("")
		
	}

	
	
	//Topbrands  xpath .//*[@id='checkbox-40'] website https://www.walmart.com/search/?query=laptop%20computers&typeahead=laptop
    public void checkBrands(){
    	
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.walmart.com/search/?query=laptop%20computers&typeahead=laptop");
	
	WebElement ee= driver.findElement(By.xpath(".//*[@id='mainSearchContent']/div[1]/div[4]/div[1]/div[3]/button"));
	ee.click();
	
    driver.getTitle();
	
    try {
		driver.manage().wait(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
    WebDriverWait  wait = new WebDriverWait(driver, 200);
WebElement rr=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='checkbox-0']")));
	rr.click();
	
	driver.navigate().to("https://www.walmart.com/search/?facet=brand%3AHP&page=1&query=laptop+computers&typeahead=laptop#searchProductResult");
	
	}
}

