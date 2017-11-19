package com.guaren.ecommerce.excelreader;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Products {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");        
        WebDriver driver = new ChromeDriver();       
		
		driver.get("https://staging.guarented.com/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='profile_white']")).click();
		//login drodown
		driver.findElement(By.xpath("//*[@id='profile_tab']/ul/li[1]/a")).click();
		Thread.sleep(3000);
		//email
		driver.findElement(By.xpath("//*[@id='input_14']")).sendKeys("naresh@guarented.com");
		//password
		driver.findElement(By.xpath("//*[@id='input_15']")).sendKeys("neethu23");
		//submit
		driver.findElement(By.xpath("//*[@id='tab-content-12']/div/md-content/form/button")).click();
		//text in home page
		Thread.sleep(10000);
		String value1=driver.findElement(By.xpath(".//*[@id='container']/div[2]/div/div[1]/h1")).getText();
		String expected1="GUARENTED";
		System.out.println("the page validation is  "+value1);
		Assert.assertEquals(value1, expected1);
		System.out.println("tha validation success in home page ");
		
		driver.findElement(By.xpath("//span[contains(text(),'PRODUCTS')]")).click();
		//1st image
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='product']/div[3]/div/div[2]/div/div[1]/a[2]/div/md-card/img")).click();
		//add to cart button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='fea']/div[2]/div[2]/button[1]")).click();
		//String confirmation_message_toaddingcart=driver.findElement(By.xpath(".//*[@id='fea']/md-toast/div/div/p[1]")).getText();
		//System.out.println("confirmation message is "+confirmation_message_toaddingcart);
		driver.findElement(By.xpath("//*[@id='fea']/div[2]/div[2]/button[2]")).click();	   
		driver.findElement(By.xpath("//*[@id='fea']/div[2]/div[2]/button[2]")).click();
		Thread.sleep(5000);

	
By mySelector = By.xpath("//span[@class='ng-scope']");
		
		List<WebElement> myElements = driver.findElements(mySelector);
		for(WebElement e : myElements) {
		  System.out.println("values are  "+  e.getText());
		  Thread.sleep(6000);
		  
		  
		  			  
		
		if( e.getText().equals("NEXT"))
			e.click();
		}
		//mobile number
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='input_55']")).sendKeys("3434343434");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='input_59']")).sendKeys("3434");
		Thread.sleep(5000);
By mySelector1 = By.xpath("//*[@id='action-button']");
		
		List<WebElement> myElements1 = driver.findElements(mySelector);
		for(WebElement e1 : myElements1) {
		  System.out.println("values are payment  "+  e1.getText());
		  Thread.sleep(6000);
		  
		  if( e1.getText().equals("NEXT"))
			e1.click();
		}
		Thread.sleep(5000);
		//card on delivery
		driver.findElement(By.xpath("//*[@id='radio_10']/div[1]/div")).click();
	
	
	
	
	}

}
