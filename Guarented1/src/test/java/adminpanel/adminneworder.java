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

public class adminneworder extends TestBase2 {
	@BeforeMethod
	public void setup() throws IOException {
		init1();

	}
	@Test
public void adminflowthroughmyordersfornewpage() throws Exception {

		LoginPageUtils1 lu = new LoginPageUtils1();
		lu.loginToApplication("naresh2345smailbox@rediffmail.com", "neethu23");
		Thread.sleep(8000);
		HomePageUtils1 hu = new HomePageUtils1();
		
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
		//	System.out.println("data in staging" + " " + k + "is :"+list.get(k).getText());

		}

		String idttextinstaging = list.get(1).getText();
	
		String result = idttextinstaging.replaceAll("#", "");
	
		String final11 = result.trim();
	
		 String emailinsttaging = list.get(5).getText();
		
		 String mobilenumber = list.get(6).getText();
	
			String afterreplacemobilenumber=mobilenumber.substring(4);

		 String data3 = list.get(3).getText();
		// System.out.println("data3 value staging is " + data3);
		Thread.sleep(5000);
		driver.navigate().to("http://admin-staging.guarented.com");
		Thread.sleep(4000);
		driver.findElement(By.id("input_0")).sendKeys("9916678544");
		driver.findElement(By.id("input_1")).sendKeys("roxyproxy");
		driver.findElement(By.xpath("//*[@id='show_error']/form/button/span"))
				.click();
		Thread.sleep(8000);

		List<WebElement> listdatainadmin = driver.findElements(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td"));
	//	System.out.println("list in adminpanel " + listdatainadmin.size());
		for (int k = 0; k < listdatainadmin.size(); k++) {
			// System.out.println("data  in admin panel" + " " + k + " " +"is :"+ listdatainadmin.get(k).getText());
		}

		String idtextinadmin = listdatainadmin.get(0).getText();
		
		 String firstcoloumnadmindata = listdatainadmin.get(1).getText();
		// System.out.println("the total values are      " + firstcoloumnadmindata);
		 Assert.assertTrue(final11.contains(idtextinadmin),   "ids are not same in staging and admin");
		 System.out.println("ids are  same in staging and admin");
		 Assert.assertTrue(firstcoloumnadmindata.contains(emailinsttaging), "email ids are  not same in both admin and staging");
		 System.out.println("email ids are  same in staging and admin");
		 Assert.assertTrue(firstcoloumnadmindata.contains(afterreplacemobilenumber), "mobile numbers are  not same in both admin and staging");
		 System.out.println("mobile numbers  are  same in staging and admin");
		 Assert.assertTrue(firstcoloumnadmindata.contains(data3), "names are  not same in both admin and staging");
		 System.out.println("names  are  same in staging and admin");
		//search bar
		 driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[3]/div/md-card/md-toolbar[1]/div/button/md-icon")).click();
		 //slidebar
		 driver.findElement(By.xpath("//*[@id='parent-cont']/div/div[3]/div/md-card/md-toolbar[4]/div/div/md-switch/div[1]")).click();
	
		 Thread.sleep(2000);
		 
		 
		 List<WebElement> listsearchbar = driver.findElements(By.xpath("//input[@ng-model='searchText']"));
			System.out.println("listsearchbar in admin " + listsearchbar.size());
			for (int k = 0; k < listsearchbar.size(); k++) {
				// System.out.println("listsearchbar" + " " + k + " " +"is :"+ listsearchbar.get(k).getText());
				// listsearchbar.get(1).click();
				
				 
			} 
			 listsearchbar.get(1).sendKeys(final11);
			 Thread.sleep(2000);
			 List<WebElement> listdataaftersearch = driver.findElements(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td"));
				System.out.println("listdataaftersearch" + listdataaftersearch.size());
				for (int k = 0; k < listdataaftersearch.size(); k++) {
					 //System.out.println("listdataaftersearch" + " " + k + " " +"is :"+ listdataaftersearch.get(k).getText());
				}
				String idtextinadminaftersearch = listdataaftersearch.get(0).getText();
			
				 String firstcoloumnadmindataaftersearch = listdataaftersearch.get(1).getText();
				// System.out.println("firstcoloumnadmindataaftersearch are      " + firstcoloumnadmindataaftersearch);
				
				
				
				
				
				Assert.assertTrue(final11.contains(idtextinadminaftersearch),   "ids are not same in staging and adminsearch");
				 System.out.println("ids are  same in staging and admin after search with id");
				 Assert.assertTrue(firstcoloumnadmindataaftersearch.contains(emailinsttaging), "email ids are  not same in both adminsearch and staging");
				 System.out.println("email ids are  same in staging and admin after search with id");
				 Assert.assertTrue(firstcoloumnadmindataaftersearch.contains(afterreplacemobilenumber), "mobile numbers are  not same in both adminsearch and staging");
				 System.out.println("mobile numbers  are  same in staging and admin after search with id");
				 Assert.assertTrue(firstcoloumnadmindataaftersearch.contains(data3), "names are  not same in both admin search and staging");
				 System.out.println("names  are  same in staging and admin after search with id");
			 
		
	}
	}




