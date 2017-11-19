package adminpanel;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

public class Adminconfirmed extends Admintestflowthroughmyordersinhomepage {
	@BeforeMethod
	public void setup() throws IOException {
		init1();

	}

	/*
	public void adminflowinconfirmation() throws Exception {
		Admintestflowthroughmyordersinhomepage ah=new Admintestflowthroughmyordersinhomepage();
		ah.adminflowthroughmyorders();
		Adminconfirmed ac=new Adminconfirmed();
		ac.confirmation();
	}*/
		
		public void confirmation() throws InterruptedException{
			
		//con\firm button
		 driver.findElement(By.xpath("//*[@id='content']/md-content/md-table-container/table/tbody/tr[1]/td[8]/button[1]/span")).click(); 
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//input[@placeholder='Enter date']")).clear();
		  driver.findElement(By.xpath("//input[@placeholder='Enter date']")).sendKeys("09/20/17");
		 
		
		  driver.findElement(By.xpath("//input[@aria-label='Start time']")).sendKeys("01:03");
		  driver.findElement(By.xpath("//input[@aria-label='Start time']")).sendKeys("AM");
		  
		  driver.findElement(By.xpath("//input[@aria-label='End time']")).sendKeys("03:03");
		  driver.findElement(By.xpath("//input[@aria-label='End time']")).sendKeys("PM");
		  driver.findElement(By.xpath("//input[@ng-model='status.comments']")).sendKeys("GOOD CUSTOMER");
		 driver.findElement(By.xpath("//span[@ng-click='addConfirmItem()']")).click();
		 //procure button in confirmation page
		 List<WebElement> listprocure=driver.findElements(By.xpath("//button[@ng-click='toProcure(order)']"));
		 System.out.println("list is " +listprocure.size()); 
		 for(int m=0;m<listprocure.size();m++){ 
			 listprocure.get(0).click(); 
			 break;
		  }
		
		//GIVIG ID
		 driver.findElement(By.xpath("//input[@class='ng-pristine ng-untouched ng-scope ng-empty ng-valid ng-valid-required']")).click(); 
		 driver.findElement(By.xpath("//input[@class='ng-pristine ng-untouched ng-scope ng-empty ng-valid ng-valid-required']")).sendKeys("RF0169"); 
			driver.findElement(By.xpath("//span[contains(text(),'RF0169')]")).click();
		driver.findElement(By.xpath("//button[@aria-label='Add Item']")).click();
		
		
		
		
	
		
	
}
}	

