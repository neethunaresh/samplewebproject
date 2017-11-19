package adminpanel;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guarented.ecommerce.TestBase.TestBase2;
import com.guarented.ecommerce.pageUtils.HomePageUtils1;
import com.guarented.ecommerce.pageUtils.LoginPageUtils1;

public class Admintestflow extends TestBase2 {
	@BeforeMethod
	public void setup() throws IOException {
		init1();

	}

	public By new_button = By.xpath("//md-tab-item[contains(@class,'md-tab ng-scope ng-isolate-scope md-ink-ripple')][1]");
	public By cancelled = By.xpath("//md-tab-item[contains(@class,'md-tab ng-scope ng-isolate-scope md-ink-ripple')][6]");
	public By procured_replacements = By.xpath(" //md-tab-item[contains(@class,'md-tab ng-scope ng-isolate-scope md-ink-ripple')][5]");
	public By replacements = By.xpath(" //md-tab-item[contains(@class,'md-tab ng-scope ng-isolate-scope md-ink-ripple')][4]");
	public By procured_orders = By.xpath(" //md-tab-item[contains(@class,'md-tab ng-scope ng-isolate-scope md-ink-ripple')][3]");
	public By confirmed = By.xpath("//md-tab-item[contains(@class,'md-tab ng-scope ng-isolate-scope md-ink-ripple')][2]");

	@Test
	public void adminflow() throws Exception {

		LoginPageUtils1 lu = new LoginPageUtils1();
		lu.loginToApplication("raki123@gmail.com", "neethu23");
		Thread.sleep(8000);
		HomePageUtils1 hu = new HomePageUtils1();
		hu.verifyGuarentedtextinhomepage();
		hu.bookitemthroughwholesearch();
		hu.bookIteminGuarented();

		List<WebElement> listview = driver.findElements(By.xpath("//span[contains(text(), 'View Details')]"));
		// System.out.println("no of orders in page is  "+listview.size());
		for (int j = 0; j < listview.size(); j++) {
			listview.get(0).click();
			break;

		}
		String itemnameinstaging=driver.findElement(By.xpath("//*[@id='orders_section']/div[3]/div[2]/div[1]/div/div[2]/span/p")).getText();
		//System.out.println("item name in staging is    "+itemnameinstaging);
		System.out.println("***************************************************");
		List<WebElement> listinstaging = driver.findElements(By.xpath("//*[@id='orders_section']/div[3]/div[1]/div[1]/p"));
		//System.out.println("list in staging " + listinstaging.size());
		for (int k = 0; k < listinstaging.size(); k++) {
			// System.out.println("data in staging" + " " + k +"is :"+listinstaging.get(k).getText());

		}
		String emailidinstaging=listinstaging.get(5).getText();
		System.out.println("email id in staging is   "+emailidinstaging);
		String idttextinstaging = listinstaging.get(1).getText();

		String result = idttextinstaging.replaceAll("#", "");

		String staging_order_id = result.trim();
		// System.out.println("order id in staging in order details page is "+staging_order_id);
	

		String mobilenumber = listinstaging.get(6).getText();

		String afterreplacemobilenumber = mobilenumber.substring(4);
		// System.out.println("mobile number is in staging in order details page  "+afterreplacemobilenumber);

		String name_in_staging = listinstaging.get(3).getText();
		// System.out.println("name_in_ staging is " + name_in_staging);
		Thread.sleep(5000);
		driver.navigate().to("http://admin-staging.guarented.com");
		Thread.sleep(4000);
		driver.findElement(By.id("input_0")).sendKeys("9916678544");
		driver.findElement(By.id("input_1")).sendKeys("roxyproxy");
		driver.findElement(By.xpath("//*[@id='show_error']/form/button/span"))
				.click();
		Thread.sleep(8000);
		System.out.println("**************************************************************************************");
System.out.println("**********admin panel new page***********************");
		//////////////////////////////////new page//////////////////////////////////////////////////////////////////////
		List<WebElement> listdatainadmin = driver.findElements(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td"));
		// System.out.println("list in adminpanel " + listdatainadmin.size());
		WebElement ele=driver.findElement(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[1]"));
		String orderidinnew=ele.getText();
		for (int k = 0; k < listdatainadmin.size(); k++) {
			//
	//System.out.println("data  in admin panel" + " " + k + " "+"is :"+ listdatainadmin.get(k).getText());
		}
		
		
		
		String itemnameinnewpage=listdatainadmin.get(5).getText();
		//System.out.println("item in new page is:  "+itemnameinnewpage);

		String id_in_new_page = listdatainadmin.get(0).getText();

		String mobno_name_emailid_name_in_new_page = listdatainadmin.get(1).getText();
	//System.out.println("mobno_name_emailid_in_name_in_new_page are      " +mobno_name_emailid_name_in_new_page);
	System.out.println("******************************************************************");
		Assert.assertTrue(staging_order_id.contains(id_in_new_page),"ids are not same in staging and admin");
		System.out.println("ids are  same in staging and admin");
		Assert.assertTrue(itemnameinnewpage.contains(itemnameinstaging),"product names are not same in staging and admin");
		System.out.println("product names are  same in staging and admin");
		Assert.assertTrue(mobno_name_emailid_name_in_new_page.contains(emailidinstaging),"email ids are  not same in both admin and staging");
		System.out.println("email ids are  same in staging and admin");
		Assert.assertTrue(mobno_name_emailid_name_in_new_page.contains(afterreplacemobilenumber),"mobile numbers are  not same in both admin and staging");
		System.out.println("mobile numbers  are  same in staging and admin");
		Assert.assertTrue(mobno_name_emailid_name_in_new_page.contains(name_in_staging),"names are  not same in both admin and staging");
		System.out.println("customer names  are  same in staging and admin");
		////////////////////search string/////////////////////////////////////////////////////
		// search bar
		driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[3]/div/md-card/md-toolbar[1]/div/button/md-icon")).click();
		
System.out.println("*************************************************");		
		
		// slidebar
		//driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[3]/div/md-card/md-toolbar[4]/div/div/md-switch/div[1]")).click();

		Thread.sleep(2000);

		List<WebElement> listsearchbar = driver.findElements(By.xpath("//input[@ng-model='searchText']"));
		// System.out.println("listsearchbar in admin " + listsearchbar.size());
		for (int k = 0; k < listsearchbar.size(); k++) {
			// System.out.println("listsearchbar" + " " + k + " " +"is :"+
		
		}
		listsearchbar.get(1).sendKeys(staging_order_id);
		Thread.sleep(2000);
		List<WebElement> listdataaftersearch = driver.findElements(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td"));
		//System.out.println("listdataaftersearch" + listdataaftersearch.size());
		
		for (int k = 0; k < listdataaftersearch.size(); k++) {
			// System.out.println("listdataaftersearch" + " " + k + " " +"is :"+listdataaftersearch.get(k).getText());
		}
		String id_in_new_pageaftersearch = listdataaftersearch.get(0).getText();

		String mobno_name_emailid_in_new_pageaftersearch = listdataaftersearch.get(1).getText();
		// System.out.println("mobno_name_emailid_in_new_pageaftersearch are      " +mobno_name_emailid_in_new_pageaftersearch);
		String productnames_in_new_pageaftersearch = listdataaftersearch.get(5).getText();
		// System.out.println("product names_in_new_pageaftersearch are      " +productnames_in_new_pageaftersearch);
		 System.out.println("********************************************************");

		Assert.assertTrue(staging_order_id.contains(id_in_new_pageaftersearch),"ids are not same in staging and adminsearch");
		System.out.println("ids are  same in staging and admin after search with id");
		Assert.assertTrue(mobno_name_emailid_in_new_pageaftersearch.contains(emailidinstaging),"email ids are  not same in both adminsearch and staging");
		System.out.println("email ids are  same in staging and admin after search with id");
		Assert.assertTrue(mobno_name_emailid_in_new_pageaftersearch.contains(afterreplacemobilenumber),"mobile numbers are  not same in both adminsearch and staging");
		System.out.println("mobile numbers  are  same in staging and admin after search with id");
		Assert.assertTrue(mobno_name_emailid_in_new_pageaftersearch.contains(name_in_staging),"customer names are  not same in both admin search and staging");
		System.out.println("customer names  are  same in staging and admin after search with id");
		
		Assert.assertTrue(productnames_in_new_pageaftersearch.contains(itemnameinstaging),"product names are  not same in both admin search and staging");
		System.out.println("product names  are  same in staging and admin after search with id");
		/////////////////////////////////////////////////// confirm page//////////////////////////////////////////
		System.out.println("*******************************************************************************************");
	

		driver.findElement(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[8]/button[1]/span")).click();
		Thread.sleep(5000);
		System.out.println("*******************************************************");
		System.out.println("*************confirm date slot page***********************");
	
		
		driver.findElement(By.xpath("//input[@placeholder='Enter date']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter date']")).sendKeys("09/21/17");

		driver.findElement(By.xpath("//input[@aria-label='Start time']")).sendKeys("01:03");
		driver.findElement(By.xpath("//input[@aria-label='Start time']")).sendKeys("AM");

		driver.findElement(By.xpath("//input[@aria-label='End time']")).sendKeys("03:03");
		driver.findElement(By.xpath("//input[@aria-label='End time']")).sendKeys("PM");
		driver.findElement(By.xpath("//input[@ng-model='status.comments']")).sendKeys("GOOD CUSTOMER");
		driver.findElement(By.xpath("//span[@ng-click='addConfirmItem()']")).click();
		System.out.println("*******************************************");
		System.out.println("***********confirm page******************************");
		
		Thread.sleep(5000);
		// search bar
		driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[3]/div/md-card/md-toolbar[1]/div/button/md-icon")).click();
		// slidebar
		//driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[3]/div/md-card/md-toolbar[4]/div/div/md-switch/div[1]")).click();

		Thread.sleep(4000);

		List<WebElement> listsearchbar1 = driver.findElements(By.xpath("//input[@ng-model='searchText']"));
		// System.out.println("listsearchbar in admin " + listsearchbar.size());
		for (int k = 0; k < listsearchbar1.size(); k++) {
			// System.out.println("listsearchbar" + " " + k + " " +"is :"+
		
		}
		listsearchbar1.get(1).sendKeys(staging_order_id);
		Thread.sleep(4000);
		
		List<WebElement> customerdatainconfirmpage = driver.findElements(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td"));
		//System.out.println("confirmdata" + customerdatainconfirmpage.size());
		for (int k = 0; k < customerdatainconfirmpage.size(); k++) {
			 //System.out.println("customer data in confirm page" + " " + k + " " +"is :"+customerdatainconfirmpage.get(k).getText());
		}
		String orderidinconfirmationpage=customerdatainconfirmpage.get(0).getText();
		String nameinconfirmationpage=customerdatainconfirmpage.get(1).getText();
		String productnameinconfirmationpage=customerdatainconfirmpage.get(6).getText();
		//System.out.println("product name inconfirmationpage is  "+productnameinconfirmationpage);
		System.out.println("*******************************************************************");
	
		Assert.assertTrue(staging_order_id.contains(id_in_new_pageaftersearch)&&(id_in_new_page.contains(orderidinconfirmationpage)),"ids are not same in staging,new page and confirmation page");
		System.out.println("ids are  same in staging and new page and confirmation page ");
		Assert.assertTrue(mobno_name_emailid_name_in_new_page.contains(name_in_staging)&&(mobno_name_emailid_in_new_pageaftersearch.contains(name_in_staging)),"names are  not same in  new page, staging and confirm page");
		System.out.println("customer names  are  same in staging,new page and confirmation page");
		Assert.assertTrue(productnames_in_new_pageaftersearch.contains(itemnameinstaging)&&(productnameinconfirmationpage.contains(productnames_in_new_pageaftersearch)),"product names are  not same in both admin search,confirmation page and staging");
		System.out.println("product names  are  same in staging,confirmation page and admin after search with id");
		
		
		System.out.println("**********************************************************************");
		
		// procure button in confirmation page
		List<WebElement> listprocure = driver.findElements(By.xpath("//button[@ng-click='toProcure(order)']"));
		//System.out.println("list is " + listprocure.size());
		for (int m = 0; m < listprocure.size(); m++) {
			listprocure.get(0).click();
			break;
		}
		//System.out.println("******************************************************************");

/////////////////////add itms page/////////////////////////////////////////////
		//System.out.println("*****************************************************");
		//System.out.println("*****************add items page**********");
		// GIVIG ID
		driver.findElement(By.xpath("//input[@class='ng-pristine ng-untouched ng-scope ng-empty ng-valid ng-valid-required']")).click();
		driver.findElement(By.xpath("//input[@class='ng-pristine ng-untouched ng-scope ng-empty ng-valid ng-valid-required']")).sendKeys("RF0787");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[contains(text(),'RF0787')]")).click();
		driver.findElement(By.xpath("//button[@aria-label='Add Item']")).click();
		//System.out.println("*******************************************************************************");
		Thread.sleep(4000);
		System.out.println("********procured  page************************");
		//search string
		driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[3]/div/md-card/md-toolbar[1]/div/button/md-icon")).click();
		
		Thread.sleep(2000);

		List<WebElement> listsearchbar4 = driver.findElements(By.xpath("//input[@ng-model='searchText']"));
		// System.out.println("listsearchbar in admin " + listsearchbar.size());
		for (int k = 0; k < listsearchbar4.size(); k++) {
			// System.out.println("listsearchbar" + " " + k + " " +"is :"+
		
		}
		listsearchbar4.get(1).sendKeys(staging_order_id);
		
		Thread.sleep(4000);
		List<WebElement> listdataafterprocurement = driver.findElements(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td"));
	//	System.out.println("listdatafterprocurement" + listdataafterprocurement.size());
		
		for (int l = 0; l < listdataafterprocurement.size(); l++) {
			//System.out.println("listdatafterprocurement" + " " + l + " " +"is :"+listdataafterprocurement.get(l).getText());
		}
		String product_name_in_procurementpage=listdataafterprocurement.get(5).getText();
		//System.out.println("product_name_in_procurementpage  is   "+product_name_in_procurementpage);
		
		String id_in_procurementpage=listdataafterprocurement.get(0).getText();
		//System.out.println("id_in_procurementpage  is   "+id_in_procurementpage);
		String name_mobilenumber_in_procurementpage=listdataafterprocurement.get(1).getText();
		//System.out.println("name_mobilenumber_in_procurementpage  is  "+name_mobilenumber_in_procurementpage);
		System.out.println("validations in procured page");
		System.out.println("**************************************************************");
		Assert.assertTrue(staging_order_id.contains(id_in_new_pageaftersearch)&&(id_in_new_page.contains(orderidinconfirmationpage)&&(id_in_new_page.contains(id_in_procurementpage))),"ids are not same in staging,new page, confirmation page and procured page");
		System.out.println("ids are  same in staging and new page,procured page and confirmation page ");
		Assert.assertTrue(mobno_name_emailid_name_in_new_page.contains(name_in_staging)&&(mobno_name_emailid_in_new_pageaftersearch.contains(name_in_staging)&&(mobno_name_emailid_in_new_pageaftersearch.contains(name_mobilenumber_in_procurementpage))),"names are  not same in  new page, staging,confirm page and procured page");
		System.out.println("names  are  same in staging,new page,procured page and confirmation page");
	
		Assert.assertTrue(productnames_in_new_pageaftersearch.contains(itemnameinstaging)&&(productnameinconfirmationpage.contains(productnames_in_new_pageaftersearch)&&(product_name_in_procurementpage.contains(itemnameinstaging))),"product names are  not same in both admin search,confirmation page,procured page and staging");
		System.out.println("product names  are  same in staging,confirmation page,procured page and admin after search with id");
		Assert.assertTrue(name_mobilenumber_in_procurementpage.contains(afterreplacemobilenumber)&&(mobno_name_emailid_in_new_pageaftersearch.contains(afterreplacemobilenumber)),"mobile numbers names are  not same in both admin search,procured page and staging");
		System.out.println("mobile numbers are  same in staging,procured page and admin after search with id");

		
		
		///////////////////////////////////////////////////side bar//////////////////////////////////////////////////////////
		
		
		System.out.println("*******************************************************");
		//click tasks button
		driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[1]/div/div[2]/div[3]/div[1]")).click();
		//all buttton in tasks
		driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[1]/div/div[2]/div[3]/div[2]/div/div[1]")).click();
		Thread.sleep(4000);

Thread.sleep(4000);
// search bar
driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[3]/div/md-card/md-toolbar[1]/div/button/md-icon")).click();

Thread.sleep(5000);

List<WebElement> listsearchbar2 = driver.findElements(By.xpath("//input[@ng-model='searchText']"));
// System.out.println("listsearchbar in admin " + listsearchbar.size());
for (int k = 0; k < listsearchbar2.size(); k++) {
	// System.out.println("listsearchbar" + " " + k + " " +"is :"+

}
listsearchbar2.get(1).sendKeys(staging_order_id);
Thread.sleep(4000);
//side buttton
driver.findElement(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[10]/button/md-icon")).click();
Thread.sleep(3000);
		//fullfilled buttton in drop down
String fullfilledtext=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]")).getText();

driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]")).click();
System.out.println("fullfilled text is   "+fullfilledtext);
Thread.sleep(4000);
System.out.println("********************full fill ordered page************************************************");
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



//procurement button in side bar
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[1]/div/div[2]/div[1]/div[1]")).click();
Thread.sleep(5000);
//payment in dropdown of procurement
driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[1]/div/div[2]/div[1]/div[2]/div/div[2]")).click();
Thread.sleep(5000);
//payment page searchbar
//search bar
driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[3]/div/md-card/md-toolbar[1]/div/button/md-icon")).click();

Thread.sleep(5000);

List<WebElement> listsearchbar5 = driver.findElements(By.xpath("//input[@ng-model='searchText']"));
//System.out.println("listsearchbar in admin " + listsearchbar.size());
for (int k = 0; k < listsearchbar5.size(); k++) {
	// System.out.println("listsearchbar" + " " + k + " " +"is :"+

}
listsearchbar5.get(1).sendKeys(staging_order_id);
Thread.sleep(4000);
List<WebElement> listdatainpayment = driver.findElements(By.xpath("//*[@id='parent-cont']/div/div[3]/div/md-card/ui-view/md-content/md-table-container/table/tbody/tr[1]/td"));

//System.out.println("listdatainpayment is  "+ listdatainpayment.size());

for (int p = 0; p < listdatainpayment.size(); p++) {
	//System.out.println("listdatainpayment" + " " + p + " " +"is :"+listdatainpayment.get(p).getText());
}
String id_in_paymentpage=listdatainpayment.get(0).getText();
//System.out.println("id_in_paymentpage  is   "+id_in_paymentpage);
String name_mobilenumber_in_paymentpage=listdatainpayment.get(1).getText();
//System.out.println("name_mobilenumber_in_paymentpage  is  "+name_mobilenumber_in_paymentpage);
//System.out.println("validations in payment page");
System.out.println("*******************************************************************8888");
Assert.assertTrue(staging_order_id.contains(id_in_new_pageaftersearch)&&(id_in_new_page.contains(orderidinconfirmationpage)&&(id_in_new_page.contains(id_in_procurementpage))&&(id_in_paymentpage.contains(id_in_new_page))),"ids are not same in staging,new page, confirmation page,payment page and procured page");
System.out.println("ids are  same in staging and new page,procured page,payment page and confirmation page ");
Assert.assertTrue(mobno_name_emailid_name_in_new_page.contains(name_in_staging)&&(mobno_name_emailid_in_new_pageaftersearch.contains(name_in_staging)&&(mobno_name_emailid_in_new_pageaftersearch.contains(name_mobilenumber_in_procurementpage))&&(mobno_name_emailid_in_new_pageaftersearch.contains(name_mobilenumber_in_paymentpage))),"names are  not same in  new page, staging,confirm page,payment page and procured page");
System.out.println("names  are  same in staging,new page,procured page,payment page and confirmation page");
Assert.assertTrue(id_in_paymentpage.contains(fullfilledtext),"both are status displaying wrong");
System.out.println("order is fullfilled");
Assert.assertTrue(name_mobilenumber_in_procurementpage.contains(afterreplacemobilenumber)&&(mobno_name_emailid_in_new_pageaftersearch.contains(afterreplacemobilenumber)&&(name_mobilenumber_in_paymentpage.contains(afterreplacemobilenumber))),"mobile numbers names are  not same in both admin search,payment page,procured page and staging");
System.out.println("mobile numbers are  same in staging,procured page,payment and admin after search with id");

System.out.println("**********************************************************************");







/*driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[3]/div/md-card/ui-view/md-content/md-table-container/table/tbody/tr[1]/td[2]/p[2]")).click();

		*/








		
		

	}
}
