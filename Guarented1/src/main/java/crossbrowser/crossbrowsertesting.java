package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsertesting {
	WebDriver driver;
	
	
	
	
	@Test
	@Parameters("browser")
	public void selectBrowser1(String browser) throws InterruptedException {
		if (browser.equals("firefox") || browser.equals("FIREFOX")) {
			System.out.println("firefox started");
			System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			
			//return driver;
		} else if (browser.equals("chrome") || browser.equals("CHROME")) {
			System.out.println("chrome browser");
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\com\\actiTime\\BrowserDrivers\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			//return driver;
		} else if (browser.equals("ie") || browser.equals("IE")) {
			driver = new InternetExplorerDriver();
			
			//return driver;
		}
		//return null;
		driver.manage().window().maximize();
		driver.get("https://staging.guarented.com/");
		Thread.sleep(10000);
		System.out.println(driver.getTitle());
		
	}
	
	
	
	
	
	
	
	

}
