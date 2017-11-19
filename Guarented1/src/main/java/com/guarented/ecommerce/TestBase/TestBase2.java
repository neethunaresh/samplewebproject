package com.guarented.ecommerce.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBase2 {

	public static Properties Repository = new Properties();
	public File f;
	public FileInputStream FI;
	public static WebDriver driver;
	/*public TestBase2(WebDriver driver){
		this.driver=driver;
	}*/
	

	public void init1() throws IOException {
         loadPropertiesFile();
		selectBrowser(Repository.getProperty("browser"));
		driver.get(Repository.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void loadPropertiesFile() throws IOException {
		f = new File(System.getProperty("user.dir") + "//src//test//java//config//config.properties");
		FI = new FileInputStream(f);
		Repository.load(FI);

		}
	
	
	/*@Test
	@Parameters("browser")
	public void selectBrowser1(String browsername) throws InterruptedException {
		if (browsername.equals("firefox") || browsername.equals("FIREFOX")) {
			System.out.println("firefox started");
			System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			
			//return driver;
		} else if (browsername.equals("chrome") || browsername.equals("CHROME")) {
			System.out.println("chrome browser");
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\com\\actiTime\\BrowserDrivers\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			//return driver;
		} else if (browsername.equals("ie") || browsername.equals("IE")) {
			driver = new InternetExplorerDriver();
			
			//return driver;
		}
		//return null;
		driver.manage().window().maximize();
		driver.get("https://staging.guarented.com/");
		Thread.sleep(10000);
		
	}


	
	
	
	
	
	
	*/

	/**
	 * This method initialize browser object
	 * 
	 * @param browser
	 * @return browser driver
	 */
	
	
	
	
	
	
	
	
	public WebDriver selectBrowser(String browser) {
		if (browser.equals("firefox") || browser.equals("FIREFOX")) {
			System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		} else if (browser.equals("chrome") || browser.equals("CHROME")) {
			System.out.println("chrome browser");
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\com\\actiTime\\BrowserDrivers\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		} else if (browser.equals("ie") || browser.equals("IE")) {
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		}
		return null;
	}



	public void closeBrowser() {
		//driver = null;
		driver.close();
	}


	
		
		
		
		
		
		
		

}
