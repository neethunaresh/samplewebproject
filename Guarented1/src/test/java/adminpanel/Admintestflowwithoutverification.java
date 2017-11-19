package adminpanel;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guarented.ecommerce.TestBase.TestBase2;
import com.guarented.ecommerce.pageUtils.HomePageUtils1;
import com.guarented.ecommerce.pageUtils.LoginPageUtils1;

public class Admintestflowwithoutverification extends TestBase2 {
	@BeforeMethod
	public void setup() throws IOException{
		init1();
		
	}
	
	

	@Test
	public void adminflow() throws Exception{
	
		LoginPageUtils1 lu=new LoginPageUtils1();
		lu.loginToApplication("naresh2345smailbox@rediffmail.com", "neethu23");
		Thread.sleep(2000);
		HomePageUtils1 hu=new HomePageUtils1();
		hu.verifyGuarentedtextinhomepage();
	
		
		//my orders in home page direct for my orders page from home page
		//driver.findElement(By.xpath("//*[@id='btn_user']/span")).click();
		//driver.findElement(By.xpath("//*[@id='profile_tab']/ul/li[2]/a")).click();
		//String orderinmyorders=driver.findElement(By.xpath("//*[@id='tab-content-96']/div/md-content/div[1]/div/div[2]/div[1]/div[1]/p[2]")).getText();
		
	
		List<WebElement> listview=driver.findElements(By.xpath("//span[contains(text(), 'View Details')]"));
		System.out.println("no of orders in page is  "+listview.size());
		for(int j=0;j<listview.size();j++){
			listview.get(0).click();
			break;
			
		
		}
		
			
	

		//*[@id='orders_section']/div[3]/div[1]/div[1]/p
		Thread.sleep(2000);
		driver.navigate().to("http://admin-staging.guarented.com");
		Thread.sleep(2000);
		driver.findElement(By.id("input_0")).sendKeys("9916678544");
		driver.findElement(By.id("input_1")).sendKeys("roxyproxy");
		driver.findElement(By.xpath("//*[@id='show_error']/form/button/span")).click();
		Thread.sleep(8000);
		//driver.findElement(By.xpath("//md-tab-item[contains(@class,'md-tab ng-scope ng-isolate-scope md-ink-ripple')][2]")).click();
		
		
		
		
		//payment button in side bar
		//driver.findElement(By.xpath("//div[contains(text(),'Payments')]")[0]"));"
				//driver.findElement(By.xpath("//div[contains(text(),'Payments'][0]")).click();
				//driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[1]/div/div[2]/div[1]/div[2]/div/div[2]"))
				
				
	//	con\firm button
driver.findElement(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[8]/button[1]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter date']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter date']")).sendKeys("12/31/17");

		
	
		driver.findElement(By.xpath("//input[@aria-label='Start time']")).sendKeys("01:03");
		driver.findElement(By.xpath("//input[@aria-label='Start time']")).sendKeys("AM");
		
		driver.findElement(By.xpath("//input[@aria-label='End time']")).sendKeys("03:03");
		driver.findElement(By.xpath("//input[@aria-label='End time']")).sendKeys("PM");
		driver.findElement(By.xpath("//input[@ng-model='status.comments']")).sendKeys("GOOD CUSTOMER");
		driver.findElement(By.xpath("//span[@ng-click='addConfirmItem()']")).click();
		//procure
		Thread.sleep(4000);
		List<WebElement> listprocure=driver.findElements(By.xpath("//button[@ng-click='toProcure(order)']"));
		System.out.println("list is " +listprocure.size());
		for(int m=0;m<listprocure.size();m++){
			listprocure.get(0).click();
			break;
		}
		
	driver.findElement(By.xpath("//input[@class='ng-pristine ng-untouched ng-scope ng-empty ng-valid ng-valid-required']")).click();
				driver.findElement(By.xpath("//input[@class='ng-pristine ng-untouched ng-scope ng-empty ng-valid ng-valid-required']")).sendKeys("RF0002");
				Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id='ul-62']/li/md-autocomplete-parent-scope/span")).click();
	driver.findElement(By.xpath("//span[contains(text(),'RF0002')]")).click();
		
		
		//REVENUE_YEAR[starts-with(.,'2552')]/text()
		
		//*[@id="ul-61"]/li/md-autocomplete-parent-scope/span
		
	
		driver.findElement(By.xpath("//button[@aria-label='Add Item']")).click();
		}
	}
		
/*		driver.findElement(By.xpath("//md-tab-item[contains(@class,'md-tab ng-scope ng-isolate-scope md-ink-ripple')][3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[8]/button[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("incharge")).sendKeys("asdfs");
	Actions action=new Actions(driver);
	action.keyDown(Keys.TAB);
	
	//ele.sendKeys(Keys.TAB);
	driver.findElement(By.name("incharge")).sendKeys(Keys.TAB);*/
	//action.moveToElement(ele).click().build().perform();
	//Thread.sleep(1000);
	//driver.findElement(By.xpath("//*[@id='dialogContent_complete-dialog']/div[2]/md-content/form/div[1]/md-input-container[2]/md-datepicker/button")).click();
	//Thread.sleep(1000);
	//Alert alart=driver.switchTo().alert();
	
	//driver.findElement(By.xpath("//*[@id='md-4-month-2017-8-7']/span")).click();
	
	//*[@id="md-4-month-2017-8-8"]/span
	
	//*[@id="md-1-month-2017-8-7"]/span
	
/*	
	driver.findElement(By.xpath("//input[@placeholder='Enter date']")).clear();
	driver.findElement(By.xpath("//input[@placeholder='Enter date']")).sendKeys("09/07/17");
	driver.findElement(By.xpath("//input[@name='sec']")).sendKeys("2000");
	driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("2999");
	*/

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	


