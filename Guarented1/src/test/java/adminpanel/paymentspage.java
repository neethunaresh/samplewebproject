package adminpanel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.guarented.reportsbaseclass.BaseTest;

public class paymentspage extends BaseTest{
	/*@BeforeMethod
	public void setupp() throws IOException{
		init1();
		
	}*/
	
	
	
	
	
	@Test
	public void adminpaymentflow() throws Exception{
	
	
		
	    test = extent.createTest("payment started");
	    System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    
	    /*LoginPageUtils1 lu=new LoginPageUtils1();
		lu.loginToApplication("naresh2345smailbox@rediffmail.com", "neethu23");
		Thread.sleep(8000);*/
	   // driver.navigate().to("http://admin-staging.guarented.com");
	    driver.get("http://admin-test.guarented.com/");
	    
	    
		Thread.sleep(4000);
		driver.findElement(By.id("input_0")).sendKeys("9916678544");
		driver.findElement(By.id("input_1")).sendKeys("roxyproxy");
		driver.findElement(By.xpath("//*[@id='show_error']/form/button/span")).click();
		Thread.sleep(8000);
		//driver.findElement(By.xpath("//md-tab-item[contains(@class,'md-tab ng-scope ng-isolate-scope md-ink-ripple')][2]")).click();
		
		/*
		
		List<WebElement> listdatainadmin=driver.findElements(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td"));
		System.out.println("list is " +listdatainadmin.size());
		for(int k=0;k<listdatainadmin.size();k++){
			System.out.println("data admin" +" "+k+ " " + "is :"   +listdatainadmin.get(k).getText());
		
			}
		Thread.sleep(5000);*/
		
		//payment button in side bar
		//driver.findElement(By.xpath("//div[contains(text(),'Payments')]")[0]"));"
				//driver.findElement(By.xpath("//div[contains(text(),'Payments'][0]")).click();
				driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[1]/div/div[2]/div[1]/div[2]/div/div[2]")).click();
				Thread.sleep(3000);
				
				
				
				
				driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[3]/div/md-card/md-toolbar[7]/div/md-input-container[1]/md-datepicker/div/button/div")).click();
				WebElement datepicker=driver.findElement(By.xpath(""));
				List<WebElement> dates=datepicker.findElements(By.tagName("td"));
				for(WebElement element:dates){
					String caldate=element.getAttribute("");
					element.click();
					break;
				}
				
				
				
				
				
				/*driver.findElement(By.xpath("//input[@placeholder='Select Start date']")).clear();
				driver.findElement(By.xpath("//input[@placeholder='Select Start date']")).sendKeys("09/05/2017");
				driver.findElement(By.xpath("//input[@placeholder='Select Start date']")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@placeholder='Select Start date']")).sendKeys(Keys.TAB);*/
				/*driver.findElement(By.xpath("//input[@placeholder='Select Start date']")).sendKeys(Keys.TAB);
				driver.findElement(By.xpath("//input[@placeholder='Select Start date']")).sendKeys(Keys.TAB);
				driver.findElement(By.xpath("//input[@placeholder='Select Start date']")).sendKeys(Keys.TAB);
				driver.findElement(By.xpath("//input[@placeholder='Select Start date']")).sendKeys(Keys.TAB);*/
				
				//driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[3]/div/md-card/md-toolbar[7]/div/button/span")).click();
				
	}
	    
	    
	    
	    

}
