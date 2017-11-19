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

public class Adminpaymentts extends TestBase2 {
	@BeforeMethod
	public void setup() throws IOException {
		init1();

	}

	@Test
	public void adminflowthroughmyorders() throws Exception {

		LoginPageUtils1 lu = new LoginPageUtils1();
		lu.loginToApplication("naresh2345smailbox@rediffmail.com", "neethu23");
		Thread.sleep(8000);
		HomePageUtils1 hu = new HomePageUtils1();
		// hu.verifyGuarentedtextinhomepage();
		Thread.sleep(4000);

		// my orders in home page direct for my orders page from home page
		driver.findElement(By.xpath("//*[@id='btn_user']/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='profile_tab']/ul/li[2]/a"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(), 'View Details')]"))
				.click();
		List<WebElement> list = driver.findElements(By
				.xpath("//*[@id='orders_section']/div[3]/div[1]/div[1]/p"));
		System.out.println("list in staging " + list.size());
		for (int k = 0; k < list.size(); k++) {
			System.out.println("data in staging" + " " + k + "is :"+
			 list.get(k).getText());

		}

		String vasi = list.get(1).getText();
		//System.out.println("1st page of id                " + vasi);
		String result = vasi.replaceAll("#", "");
	//	System.out.println("after change of special char                "+ result);
		String final11 = result.trim();
		//System.out.println("after trimmmmm       " + final11);
		 String srinivas = list.get(5).getText();
		// System.out.println("1st page of emailid                " + srinivas);
		 String mobilenumber = list.get(6).getText();
		// System.out.println("1st page of mobile number                " + mobilenumber);
			String afterreplacemobilenumber=mobilenumber.substring(4);
			//System.out.println("mobile is in staging is "+afterreplacemobilenumber);
		 String data3 = list.get(3).getText();
		 System.out.println("data3 value staging is " + data3);
		Thread.sleep(5000);
		driver.navigate().to("http://admin-staging.guarented.com");
		Thread.sleep(4000);
		driver.findElement(By.id("input_0")).sendKeys("9916678544");
		driver.findElement(By.id("input_1")).sendKeys("roxyproxy");
		driver.findElement(By.xpath("//*[@id='show_error']/form/button/span"))
				.click();
		Thread.sleep(8000);

		List<WebElement> listdatainadmin = driver.findElements(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td"));
		System.out.println("list in adminpanel " + listdatainadmin.size());
		for (int k = 0; k < listdatainadmin.size(); k++) {
			 System.out.println("data  in admin panel" + " " + k + " " +"is :"+ listdatainadmin.get(k).getText());
		}

		String vasi1 = listdatainadmin.get(0).getText();
		//System.out.println("2nd page of id      " + vasi1);
		 String vasi2 = listdatainadmin.get(1).getText();
		 System.out.println("the total values are      " + vasi2);
		 Assert.assertTrue(final11.contains(vasi1),   "ids are not same in staging and admin");
		 System.out.println("ids are  same in staging and admin");
		 Assert.assertTrue(vasi2.contains(srinivas), "email ids are  not same in both admin and staging");
		 System.out.println("email ids are  same in staging and admin");
		 Assert.assertTrue(vasi2.contains(afterreplacemobilenumber), "mobile numbers are  not same in both admin and staging");
		 System.out.println("mobile numbers  are  same in staging and admin");
		 Assert.assertTrue(vasi2.contains(data3), "names are  not same in both admin and staging");
		 System.out.println("names  are  same in staging and admin");
		 
	}}

// payment button in side bar
// driver.findElement(By.xpath("//div[contains(text(),'Payments')]")[0]"));"
// driver.findElement(By.xpath("//div[contains(text(),'Payments'][0]")).click();
// driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[1]/div/div[2]/div[1]/div[2]/div/div[2]"))

// con\firm button
/*
 * driver.findElement(By.xpath(
 * "//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[8]/button[1]/span"
 * )).click(); Thread.sleep(5000);
 * driver.findElement(By.xpath("//input[@placeholder='Enter date']")).clear();
 * driver
 * .findElement(By.xpath("//input[@placeholder='Enter date']")).sendKeys("12/31/17"
 * );
 */
// driver.findElement(By.xpath("//*[@id='dialogContent_27']/div[2]/md-content/div/div/form/md-input-container/md-datepicker/button")).click();
// driver.findElement(By.xpath("//*[@id='md-2-month-2017-8-7']/span")).click();

/*
 * driver.findElement(By.xpath("//input[@aria-label='Start time']")).sendKeys(
 * "01:03");
 * driver.findElement(By.xpath("//input[@aria-label='Start time']")).sendKeys
 * ("AM");
 * 
 * driver.findElement(By.xpath("//input[@aria-label='End time']")).sendKeys("03:03"
 * );
 * driver.findElement(By.xpath("//input[@aria-label='End time']")).sendKeys("PM"
 * );
 * driver.findElement(By.xpath("//input[@ng-model='status.comments']")).sendKeys
 * ("GOOD CUSTOMER");
 * driver.findElement(By.xpath("//span[@ng-click='addConfirmItem()']")).click();
 * //procure Thread.sleep(4000); List<WebElement>
 * listprocure=driver.findElements
 * (By.xpath("//button[@ng-click='toProcure(order)']"));
 * System.out.println("list is " +listprocure.size()); for(int
 * m=0;m<listprocure.size();m++){ listprocure.get(0).click(); break; }
 */
// driver.findElement(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[9]/button[1]/span")).click();

// Thread.sleep(5000);

// placeholder="Search query

// button[@ng-click='toProcure(order)']
/*
 * driver.findElement(By.xpath(
 * "//input[@class='ng-pristine ng-untouched ng-scope ng-empty ng-valid ng-valid-required']"
 * )).click(); driver.findElement(By.xpath(
 * "//input[@class='ng-pristine ng-untouched ng-scope ng-empty ng-valid ng-valid-required']"
 * )).sendKeys("TV0005"); driver.findElement(By.xpath(
 * "//*[@id='ul-54']/li/md-autocomplete-parent-scope/span")).click();
 * driver.findElement(By.xpath("//span[@aria-label='Add Item']")).click();}}
 * 
 * driver.findElement(By.xpath(
 * "//md-tab-item[contains(@class,'md-tab ng-scope ng-isolate-scope md-ink-ripple')][3]"
 * )).click(); Thread.sleep(4000); driver.findElement(By.xpath(
 * "//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[8]/button[1]"
 * )).click(); Thread.sleep(3000);
 * driver.findElement(By.name("incharge")).sendKeys("asdfs"); Actions action=new
 * Actions(driver); action.keyDown(Keys.TAB);
 * 
 * //ele.sendKeys(Keys.TAB);
 * driver.findElement(By.name("incharge")).sendKeys(Keys.TAB);
 */
// action.moveToElement(ele).click().build().perform();
// Thread.sleep(1000);
// driver.findElement(By.xpath("//*[@id='dialogContent_complete-dialog']/div[2]/md-content/form/div[1]/md-input-container[2]/md-datepicker/button")).click();
// Thread.sleep(1000);
// Alert alart=driver.switchTo().alert();

// driver.findElement(By.xpath("//*[@id='md-4-month-2017-8-7']/span")).click();

// *[@id="md-4-month-2017-8-8"]/span

// *[@id="md-1-month-2017-8-7"]/span

/*
 * driver.findElement(By.xpath("//input[@placeholder='Enter date']")).clear();
 * driver
 * .findElement(By.xpath("//input[@placeholder='Enter date']")).sendKeys("09/07/17"
 * ); driver.findElement(By.xpath("//input[@name='sec']")).sendKeys("2000");
 * driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("2999");
 */

