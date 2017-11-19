package adminpanel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleadmin extends Admintestflowthroughmyordersinhomepage{
	
	

	public By new_button = By
			.xpath("md-tab-item[contains(@class,'md-tab ng-scope ng-isolate-scope md-ink-ripple')][1]");
	/*
	public void aaa(){
		CommonUtils1 cu=new CommonUtils1();
		cu.isElementPreset(new_button, driver);
	}
	*/

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:admin-staging.guarented.com");
		Thread.sleep(4000);
		driver.findElement(By.id("input_0")).sendKeys("9916678544");
		driver.findElement(By.id("input_1")).sendKeys("roxyproxy");
		driver.findElement(By.xpath("//*[@id='show_error']/form/button/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//md-tab-item[contains(@class,'md-tab ng-scope ng-isolate-scope md-ink-ripple')][3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[3]/div/md-card/md-toolbar[1]/div/button/md-icon")).click();
		
		Thread.sleep(4000);

		List<WebElement> listsearchbar1 = driver.findElements(By.xpath("//input[@ng-model='searchText']"));
		// System.out.println("listsearchbar in admin " + listsearchbar.size());
		for (int k = 0; k < listsearchbar1.size(); k++) {
			// System.out.println("listsearchbar" + " " + k + " " +"is :"+
		
		}
		listsearchbar1.get(1).sendKeys("6239");
		Thread.sleep(4000);
		List<WebElement> listdataafterprocurement = driver.findElements(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td"));
		System.out.println("listdataaftersearch" + listdataafterprocurement.size());
		
		for (int k = 0; k < listdataafterprocurement.size(); k++) {
			 System.out.println("listdatafterprocurement" + " " + k + " " +"is :"+listdataafterprocurement.get(k).getText());
		}
		
		
		
		
		

/*		
		List<WebElement> listdatainadmin = driver.findElements(By.xpath(" [@id='content']/md-content/md-table-container/table/tbody/tr[1]/td"));
			int rowdata=listdatainadmin.size();
			System.out.println("datta is  "+rowdata);*/
			
			// System.out.println("list in adminpanel " + listdatainadmin.size());
		//*[@id="content"]/md-content/md-table-container/table/tbody/tr[1]/td[1]
		
		
		/*
			WebElement ele=driver.findElement(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[1]"));
			String orderidinnew=ele.getText();
			System.out.println("order id in new page is "+orderidinnew);
			driver.findElement(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[8]/button[1]/span")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@placeholder='Enter date']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Enter date']")).sendKeys("09/21/17");

			driver.findElement(By.xpath("//input[@aria-label='Start time']")).sendKeys("01:03");
			driver.findElement(By.xpath("//input[@aria-label='Start time']")).sendKeys("AM");

			driver.findElement(By.xpath("//input[@aria-label='End time']")).sendKeys("03:03");
			driver.findElement(By.xpath("//input[@aria-label='End time']")).sendKeys("PM");
			driver.findElement(By.xpath("//input[@ng-model='status.comments']")).sendKeys("GOOD CUSTOMER one");
			driver.findElement(By.xpath("//span[@ng-click='addConfirmItem()']")).click();
			Thread.sleep(4000);
		 driver.findElement(By.xpath("//md-tab-item[contains(@class,'md-tab ng-scope ng-isolate-scope md-ink-ripple')][1]")).click();
		Thread.sleep(3000);	
		 driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[3]/div/md-card/md-toolbar[1]/div/button/md-icon")).click();
Thread.sleep(3000);
			List<WebElement> listsearchbar = driver.findElements(By
					.xpath("//input[@ng-model='searchText']"));
			// System.out.println("listsearchbar in admin " + listsearchbar.size());
			for (int k = 0; k < listsearchbar.size(); k++) {
				// System.out.println("listsearchbar" + " " + k + " " +"is :"+
			
			}
			listsearchbar.get(1).sendKeys(orderidinnew);
			Thread.sleep(2000)*/;
			
		
		
		
			/*driver.findElement(By.xpath("//md-tab-item[contains(@class,'md-tab ng-scope ng-isolate-scope md-ink-ripple')][3]")).click();
		Thread.sleep(4000);
		//click tasks button
				driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[1]/div/div[2]/div[3]/div[1]")).click();
				//all buttton in tasks
				driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[1]/div/div[2]/div[3]/div[2]/div/div[1]")).click();
				Thread.sleep(4000);
		//side buttton
				driver.findElement(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[10]/button/md-icon")).click();
		Thread.sleep(4000);
		//fullfilled buttton in drop down
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]")).click();
		Thread.sleep(4000);
		System.out.println("********************************************************************");
		///////////full fill order page/////////////////////////////////////////////
		driver.findElement(By.name("incharge")).clear();
		driver.findElement(By.name("incharge")).sendKeys("asdfs"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter date']")).clear();
driver.findElement(By.xpath("//input[@placeholder='Enter date']")).sendKeys("09/21/17");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Enter date']")).sendKeys(Keys.TAB);
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id='dialogContent_complete-dialog']/div[4]/md-content/form/div[1]/md-input-container[2]/md-datepicker/div[1]/button")).sendKeys(Keys.TAB);
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@ng-model='comp.sec']")).clear();
driver.findElement(By.xpath("//input[@ng-model='comp.sec']")).sendKeys("2000");
 Thread.sleep(1000);
 driver.findElement(By.xpath("//input[@ng-model='comp.amount']")).clear();
 driver.findElement(By.xpath("//input[@ng-model='comp.amount']")).sendKeys("2999");
 Thread.sleep(2000);
 driver.findElement(By.xpath("//md-select[@ng-model='comp.mode']")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//md-option[@value='cash']")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//button[@aria-label='Add Item']")).click();
 
 
 
				  

		
	/*List<WebElement> listdatainadmin = driver.findElements(By.xpath(" [@id='content']/md-content/md-table-container/table/tbody/tr[1]/td"));
		int rowdata=listdatainadmin.size();
		System.out.println("datta is  "+rowdata);
		
		 System.out.println("list in adminpanel " + listdatainadmin.size());
		WebElement ele=driver.findElement(By.xpath(" [@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[1]"));
		String orderidinnew=ele.getText();
		boolean ispresent=driver.findElement(By.xpath(" [@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[1]")).isDisplayed();
		for (int k = 0; k < listdatainadmin.size(); k++) {
			 System.out.println("data  in admin panel" + " " + k + " "
			 +"is :"+ listdatainadmin.get(k).getText());
		}

		WebElement ele1=driver.findElement(By.xpath(" [@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[1]"));
		String orderidinnew1=ele.getText();
		System.out.println("order id new page is "+orderidinnew);
		//confirm
		 driver.findElement(By.xpath(" [@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[8]/button[1]/span")).click(); 
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("input[@placeholder='Enter date']")).clear();
		  driver.findElement(By.xpath("input[@placeholder='Enter date']")).sendKeys("09/20/17");
		 
		
		  driver.findElement(By.xpath("input[@aria-label='Start time']")).sendKeys("01:03");
		  driver.findElement(By.xpath("input[@aria-label='Start time']")).sendKeys("AM");
		  
		  driver.findElement(By.xpath("input[@aria-label='End time']")).sendKeys("03:03");
		  driver.findElement(By.xpath("input[@aria-label='End time']")).sendKeys("PM");
		  driver.findElement(By.xpath("input[@ng-model='status.comments']")).sendKeys("GOOD CUSTOMER");
		 driver.findElement(By.xpath("span[@ng-click='addConfirmItem()']")).click();
		Thread.sleep(2000);
		
		// new button

		
		 driver.findElement(By.xpath("md-tab-item[contains(@class,'md-tab ng-scope ng-isolate-scope md-ink-ripple')][1]")).click();
		Thread.sleep(4000);
//search string/
//search bar
driver.findElement(By.xpath(" [@id='parent-cont']/div/div[3]/div/md-card/md-toolbar[1]/div/button/md-icon")).click();
//slidebar
Thread.sleep(3000);
driver.findElement(By.xpath(" [@id='parent-cont']/div/div[3]/div/md-card/md-toolbar[4]/div/div/md-switch/div[1]")).click();

Thread.sleep(2000);
List<WebElement> searchbar = driver.findElements(By.xpath("input[@ng-model='searchText']"));
System.out.println("listsearchbar in admin " + searchbar.size());
for (int k = 0; k < searchbar.size(); k++) {


}
searchbar.get(1).sendKeys(orderidinnew);


Thread.sleep(2000);*/
/*WebElement ispresent1=driver.findElement(By.xpath(" [@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[1]"));
if(ispresent1.isDisplayed()){
	System.out.println("the details displaying new state only till after confirm the order");
	}
else{
	System.out.println("the details are not displaying in new page  after confirm the order");
}
	 
	*/	 
		
		
		
		//click tasks button
		// driver.findElement(By.xpath(" [@id='parent-cont']/div/div[1]/div/div[2]/div[3]/div[1]")).click();
		//all buttton in tasks
		//driver.findElement(By.xpath(" [@id='parent-cont']/div/div[1]/div/div[2]/div[3]/div[2]/div/div[1]")).click(); /
		
	
		
				
			
				
				 
			} 
		
		
	

	}


