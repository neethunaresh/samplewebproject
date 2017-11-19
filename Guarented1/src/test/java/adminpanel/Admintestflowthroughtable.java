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

public class Admintestflowthroughtable extends TestBase2 {
	@BeforeMethod
	public void setup() throws IOException{
		init1();
		
	}
	
	
	

	@Test
	public void adminflowthroughmyorders() throws Exception{
	
		LoginPageUtils1 lu=new LoginPageUtils1();
		lu.loginToApplication("naresh2345smailbox@rediffmail.com", "neethu23");
		Thread.sleep(8000);
		HomePageUtils1 hu=new HomePageUtils1();
		hu.verifyGuarentedtextinhomepage();
		Thread.sleep(4000);
	
		
		//my orders in home page direct for my orders page from home page
		driver.findElement(By.xpath("//*[@id='btn_user']/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='profile_tab']/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(), 'View Details')]")).click();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@id='orders_section']/div[3]/div[1]/div[1]/p"));
		System.out.println("list in staging " +list.size());
		for(int k=0;k<list.size();k++){
			System.out.println("data in staging" +" "+k+  "is :"   +list.get(k).getText());
	
		}
		String  data3=list.get(3).getText();
		System.out.println("data3 value staging is "+data3);
		String splitvalueinsttaging=data3.substring(0, 6);
		System.out.println("split name is "+splitvalueinsttaging);
		
		
		
		//admin panel
		
		Thread.sleep(5000);
		driver.navigate().to("http://admin-staging.guarented.com");
		Thread.sleep(4000);
		driver.findElement(By.id("input_0")).sendKeys("9916678544");
		driver.findElement(By.id("input_1")).sendKeys("roxyproxy");
		driver.findElement(By.xpath("//*[@id='show_error']/form/button/span")).click();
		Thread.sleep(8000);
		//get rows
		 int Row_count = driver.findElements(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr")).size();
		 System.out.println("Number Of Rows = "+Row_count);
		//Get number of columns In table.
		 int Col_count = driver.findElements(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td")).size();
		 System.out.println("Number Of Columns = "+Col_count);
		 
		 //divided xpath In three parts to pass Row_count and Col_count values.
		 String first_part = "//*[@id='content']/md-content/md-table-container/table/tbody/tr[";
		 String second_part = "]/td[";
		 String third_part = "]";
		 
		 //Used for loop for number of rows.
		 for (int i=1; i<2; i++){
		  //Used for loop for number of columns.
		  for(int j=1; j<=Col_count; j++){
		   //Prepared final xpath of specific cell as per values of i and j.
		   String final_xpath = first_part+i+second_part+j+third_part;
		   //Will retrieve value from located cell and print It.
		   String Table_data = driver.findElement(By.xpath(final_xpath)).getText();
		   System.out.print(Table_data     +"  ");   
		  }
		   System.out.println(" ");
		 
		 } }}
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	


