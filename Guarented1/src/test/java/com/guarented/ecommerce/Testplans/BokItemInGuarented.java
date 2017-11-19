package com.guarented.ecommerce.Testplans;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.guarented.ecommerce.pageUtils.HomePageUtils1;
import com.guarented.ecommerce.pageUtils.LoginPageUtils1;
import com.guarented.ecommerce.pages.emailconfiguration;
import com.guarented.reportsbaseclass.BaseTest;

public class BokItemInGuarented extends BaseTest {

	

	
	
	//@BeforeMethod
	//public void setUP() throws IOException, InterruptedException{
		
		
		
	
	
		//init1();
		//selectBrowser1(browsername);
		
		
		//}
	@BeforeMethod
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
	
	
	
	
	
	
	
	
	 
	@Test
	public void bookitemthroughwholesearch() throws Exception{
		
	    test = extent.createTest("bookitemthroughwholesearch started");
		
		
		System.out.println("book item through wholesearch testcase started");
		
		LoginPageUtils1 lpu=new LoginPageUtils1();
		System.out.println("login page started");
		lpu.loginToApplication("naresh@guarented.com", "neethu23");
		
		Thread.sleep(5000);
		System.out.println("********************************");
		System.out.println("login page ended");
		HomePageUtils1 hpu=new HomePageUtils1();
		System.out.println("home page started");
		Thread.sleep(3000);
		hpu.verifyGuarentedtextinhomepage();
		
		Thread.sleep(5000);
	hpu.clickWholeSearchIcon();
		Thread.sleep(5000);
		hpu.clickAndSendDataToWholeSearchBar("front loading washing machine");
		Thread.sleep(5000);
		System.out.println("***************************");
		System.out.println("home page ended");
		hpu.bookIteminGuarented();
		emailconfiguration ec=new emailconfiguration();
		ec.emailconfigurationmethod();
		System.out.println("bookitemthroughwholesearch testcase ended");
}	
	
@Test
public void bookItemthroughSearch() throws Exception{
	 test=extent.createTest("bookitemthroughsearch testcase started");
	System.out.println("bookitemthroughsearch testcase started");
	LoginPageUtils1 lpu=new LoginPageUtils1();
	System.out.println("login page started");
	
	lpu.loginToApplication("naresh@guarented.com", "neethu23");
	Thread.sleep(5000);
	System.out.println("********************************");
	System.out.println("login page ended");
	HomePageUtils1 hpu=new HomePageUtils1();
	test.log(Status.INFO,"home page started");
	System.out.println("home page started");
	//test.log(LogStatus.INFO, );
	Thread.sleep(3000);
	hpu.verifyGuarentedtextinhomepage();
	Thread.sleep(8000);
	hpu.clickAndSendDataToSearchBar("solo microwave");
	System.out.println("***************************");
	System.out.println("home page ended");
	hpu.bookIteminGuarented();
	emailconfiguration ec=new emailconfiguration();
	ec.emailconfigurationmethod();
	test.log(Status.INFO,"email sent successfully");
	//test.log(LogStatus.INFO, );
	System.out.println("bookitemthroughsearch testcase ended");
}

///@Test(priority = 3, enabled = true, description = "book item through products")
@Test
public void bookIteminthroughproducts() throws Exception{
	 test=extent.createTest("bookitemthroughproducts testcase started");

	System.out.println("bookitemthroughproducts testcase started");
	LoginPageUtils1 lpu=new LoginPageUtils1();
	System.out.println("login page started");
	lpu.loginToApplication("naresh@guarented.com", "neethu23");
	Thread.sleep(3000);
	System.out.println("********************************");
	System.out.println("login page ended");
	HomePageUtils1 hpu=new HomePageUtils1();
	Thread.sleep(3000);
	System.out.println("home page started");
	
	hpu.verifyGuarentedtextinhomepage();
	Thread.sleep(9000);
/*
	hpu.bookitemthroughproducts();
	System.out.println("***************************");
	System.out.println("home page ended");
	hpu.bookIteminGuarented();
	System.out.println("bookitemthroughproducts testcase ended");*/
}
@Test
public void bookItemthroughRENTTOOWN() throws Exception{
	 test=extent.createTest("bookitemthroughrenttoown testcase started");
	 System.out.println("bookitemthroughrenttoown testcase started");
	LoginPageUtils1 lpu=new LoginPageUtils1();
	System.out.println("login page started");
	lpu.loginToApplication("naresh@guarented.com", "neethu23");
	Thread.sleep(3000);
	HomePageUtils1 hpu=new HomePageUtils1();
	System.out.println("home page started");
	Thread.sleep(3000);
	hpu.verifyGuarentedtextinhomepage();
	Thread.sleep(9000);
	hpu.clickRenttoown();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='second_nav_bar']/ul/li[1]/button/p")).click();
	//click tables
	//Thread.sleep(5000);
	//driver.findElement(By.xpath("//*[@id='accordiongroup-919-5479-panel']/div/p[9]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(".//*[@id='product']/div[3]/div/div[2]/div/div[2]/a[2]/div/md-card/img")).click();
    
	System.out.println("***************************");
	System.out.println("home page ended");
	
	
	
	hpu.bookIteminGuarented();
     System.out.println("bookitemthroughrenttoown testcase ended");
}

//(priority = 4, enabled = true, description = "book item through cart when cart is empty")
@Test		
public void bookitemthroughcartwhencartisempty() throws Exception{
	 test=extent.createTest("bookitemthroughcartwhencartisempty testcase started");
	System.out.println("bookitemthroughcartwhencartisempty testcase started");
	LoginPageUtils1 lpu=new LoginPageUtils1();
	System.out.println("login page started");
	lpu.loginToApplication("naresh@guarented.com", "neethu23");
	System.out.println("********************************");
	System.out.println("login page ended");
			Thread.sleep(5000);
			HomePageUtils1 hpu=new HomePageUtils1();
			System.out.println("home page started");
			hpu.verifyGuarentedtextinhomepage();
		
			Thread.sleep(9000);
			System.out.println("***************************");
			System.out.println("home page ended");
			hpu.bookitemthroughcartwhencartempty();
			
			hpu.bookIteminGuarented();
			System.out.println("bookitemthroughcartwhencartisempty testcase ended");
		}
		
		
		
		
		
		
}
		
