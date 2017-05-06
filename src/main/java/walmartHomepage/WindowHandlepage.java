package walmartHomepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class WindowHandlepage {
	WebDriver driver;
	@BeforeClass
	
	public void beforeclass(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arti\\workspace1\\walmart12\\Resources\\chromedriver.exe" );
		driver= new ChromeDriver();
		
	}
	
	
	//click on payment checkout
	
	//driver.get()
	
}
