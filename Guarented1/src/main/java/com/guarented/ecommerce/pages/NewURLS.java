package com.guarented.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewURLS  {
	
	/*public void setUP() throws IOException{
		init1();
		}*/
	
	WebDriver driver;
	@BeforeMethod
	public void browser(){
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}

	
		
	
	/*@Test
	public void furniture() throws InterruptedException{
		Thread.sleep(6000);
	driver.navigate().to("https://staging.guarented.com/bangalore/furniture?nicks=furniture&parent=furniture");
	Thread.sleep(6000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/furniture-on-rent?nicks=furniture&parent=furniture"));
	System.out.println("furniturte url passed");
	
	System.out.println("furniture title is  "+driver.getTitle());
	Assert.assertTrue(driver.getTitle().equals("Branded Furniture on Rent in Bangalore - Guarented Rentals"));
	System.out.println("furniturte title passed");
	
	}*/
	
	
	
	
/*@Test
	public void appliances() throws InterruptedException{
	Thread.sleep(4000);
	driver.navigate().to("https://staging.guarented.com/bangalore/appliances?nicks=appliances&parent=appliances");
	Thread.sleep(16000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/appliances-on-rent?nicks=appliances&parent=appliances"));
	System.out.println("appliances url passed");
	System.out.println("appliances title is  "+driver.getTitle());
	Assert.assertTrue(driver.getTitle().equals("Home Appliances on Rent In Bangalore - GuaRented Rentals"));
	System.out.println("appliances title passed");
	
	
	}*/

/*@Test
public void diningset() throws InterruptedException{
Thread.sleep(4000);
driver.navigate().to("https://staging.guarented.com/bangalore/dining-set?nicks=furn-din-set&parent=furniture");
Thread.sleep(16000);
Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/dining-set-on-rent?nicks=furn-din-set&parent=furniture"));
System.out.println("dining set  url passed");
System.out.println("dining set title is  "+driver.getTitle());
//Branded Dining Tables on Rent in Bangalore  - Guarented Rentals
Assert.assertTrue(driver.getTitle().equals("Branded Dining Table on Rent in Bangalore - Guarented Rentals"));
System.out.println("dining set title passed");
}*/

/*	
@Test
		public void sofas() throws InterruptedException{
	Thread.sleep(4000);
	driver.navigate().to("https://staging.guarented.com/bangalore/sofas?nicks=furn-sofa&parent=furniture");
	Thread.sleep(16000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/sofas-on-rent?nicks=furn-sofa&parent=furniture"));
	System.out.println("sofas url passed");
	System.out.println("sofas title is  "+driver.getTitle());
	Assert.assertTrue(driver.getTitle().equals("Premium Quality Sofa Set on Rent in Bangalore - GuaRented Rentals"));
	System.out.println("sofas title passed");*/
	
	//Premium Quality Sofa Set on Rent in Bangalore - Guarented Rentals
	
	//}
/* @Test
		
	public void beds() throws InterruptedException{
	 Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com/bangalore/beds?nicks=furn-bed&parent=furniture");
	Thread.sleep(14000);
	System.out.println("beds url  passed");
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/beds-on-rent?nicks=furn-bed&parent=furniture"));
	System.out.println("beds title is  "+driver.getTitle());
	Assert.assertTrue(driver.getTitle().equals("Premium Quality Beds on Rent in Bangalore - GuaRented Rentals"));
	//Premium Quality Beds on Rent in Bangalore  - Guarented Rentals
	System.out.println("beds title passed");
	
	System.out.println("beds passed");
	}*/
		
/* @Test
		public void recliners() throws InterruptedException{
			Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com/bangalore/recliners?nicks=furn-recl&parent=furniture");
	Thread.sleep(13000);
	System.out.println("recliners new url is "+driver.getCurrentUrl());
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/recliners-on-rent?nicks=furn-recl&parent=furniture"));
	System.out.println("recliners  url passed");
System.out.println("recliners title is "+driver.getTitle());
Assert.assertTrue(driver.getTitle().equals("Branded Recliners on Rent in Bangalore - Guarented Rentals"));
//Branded Recliners on Rent in Bangalore - Guarented Rentals
System.out.println("recliners  title passed");
System.out.println("recliners passed");
 }*/
/*	@Test
	public void storage() throws InterruptedException{
		Thread.sleep(3000);
	
	driver.navigate().to("https://staging.guarented.com/bangalore/storage?nicks=furn-strg&parent=furniture");
	Thread.sleep(13000);
	System.out.println("storage new url is "+driver.getCurrentUrl());
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/storage-on-rent?nicks=furn-strg&parent=furniture"));
	System.out.println("storage url passed");
	System.out.println("storage title is  "+driver.getTitle());
	Assert.assertTrue(driver.getTitle().equals("Storage Furniture on Rent in Bangalore - Guarented Rentals"));
	//Storage Furniture on Rent in Bangalore - Guarented Rentals
	System.out.println("storage  title passed");
	System.out.println("storage passed");
	}*/
/*	@Test
	public void mattresses() throws InterruptedException{
		Thread.sleep(3000);
		
		driver.navigate().to("https://staging.guarented.com/bangalore/mattresses?nicks=furn-mtrs&parent=furniture");
		Thread.sleep(13000);
		System.out.println("mattresses new url is "+driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/mattresses-on-rent?nicks=furn-mtrs&parent=furniture"));
		System.out.println("mattresses url passed");
		System.out.println("mattresses title is  "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals("Brand New Mattresses on Rent in Bangalore - Guarented Rentals"));
		//Brand New Mattresses on Rent in Bangalore - Guarented Rentals
		System.out.println("mattresses  title passed");
		System.out.println("mattresses passed");
		}*/
/*	@Test
	public void sttudychairs() throws InterruptedException{
Thread.sleep(3000);
		
		driver.navigate().to("https://staging.guarented.com/bangalore/study-chairs?nicks=furn-stdy-chr&parent=furniture");
		Thread.sleep(13000);
		System.out.println("study chairs new url is "+driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/study-chairs-on-rent?nicks=furn-stdy-chr&parent=furniture"));
		System.out.println("study chairs url passed");
		System.out.println("study chairs title is  "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals("Branded Study Chair on Rent in Bangalore - Guarented Rentals"));
		//Branded Study Chair on Rent in Bangalore - Guarented Rentals
		System.out.println("study chairs  title passed");
		System.out.println("study chairs passed");}*/
/*	@Test
	public void studytable() throws InterruptedException{
Thread.sleep(3000);
		
		driver.navigate().to("https://staging.guarented.com/bangalore/study-tables?nicks=furn-stdy-tbl&parent=furniture");
		Thread.sleep(13000);
		System.out.println("study table new url is "+driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/study-tables-on-rent?nicks=furn-stdy-tbl&parent=furniture"));
		System.out.println("study table url passed");
		System.out.println("study table title is  "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals("Study Tables on Rent In Bangalore - GuaRented Rentals"));
		////Study Tables on Rent in Bangalore - GuaRented Rentals
		System.out.println("study table  title passed");
		System.out.println("study table passed");}*/
	/*@Test
	public void furnpackages() throws InterruptedException{
Thread.sleep(3000);
		
		driver.navigate().to("https://staging.guarented.com/bangalore/packages?nicks=furn-pack&parent=furniture");
		Thread.sleep(13000);
		System.out.println("furn packages new url is "+driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/packages-on-rent?nicks=furn-pack&parent=furniture"));
		System.out.println("furn packages url passed");
		System.out.println("furn packages title is  "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals("Branded Furniture Packages on Rent in Bangalore - GuaRented Rentals"));
		////Branded Furniture Packages on Rent in Bangalore - Guarented Rentals
		System.out.println("furn packages  title passed");
		System.out.println("furn packages passed");}*/
/*	@Test
	public void applpackages() throws InterruptedException{
Thread.sleep(3000);
		
		driver.navigate().to("https://staging.guarented.com/bangalore/packages?nicks=app-pack&parent=appliances");
		Thread.sleep(13000);
		System.out.println("appl packages new url is "+driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/packages-on-rent?nicks=app-pack&parent=appliances"));
		System.out.println("appl packages url passed");
		System.out.println("appl packages title is  "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals("Home Appliances Rental Package In Bangalore - GuaRented Rentals"));
		/////////Appliance packages on rent in Bangalore - Guarented Rentals
		System.out.println("appl packages  title passed");
		System.out.println("appl packages passed");}*/
	/*@Test
	public void television() throws InterruptedException{
Thread.sleep(3000);
		
		driver.navigate().to("https://staging.guarented.com/bangalore/refrigerator?nicks=fridge&parent=appliances");
		Thread.sleep(13000);
		System.out.println("television new url is "+driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/refrigerator-on-rent?nicks=fridge&parent=appliances"));
		System.out.println("television url passed");
		System.out.println("television title is  "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals("Fridge for Rent in Bangalore | Rent Refrigerator - Guarented Rentals"));
		/////////Fridge on Rent in Bangalore | Rent Refrigerator - Guarented Rentals
		System.out.println("television  title passed");
		System.out.println("television passed");}*/
	
/*@Test
	public void microwave() throws InterruptedException{
	Thread.sleep(3000);
	
	driver.navigate().to("https://staging.guarented.com/bangalore/microwave?nicks=microwave&parent=appliances");
	Thread.sleep(13000);
	System.out.println("microwave new url is "+driver.getCurrentUrl());
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/microwave-on-rent?nicks=microwave&parent=appliances"));
	System.out.println("microwave url passed");
	System.out.println("microwave title is  "+driver.getTitle());
	Assert.assertTrue(driver.getTitle().equals("Microwave on Rent In Bangalore - GuaRented Rentals"));
	/////////Microwave on Rent in Bangalore - Guarented Rentals
	System.out.println("microwave  title passed");
	System.out.println("microwave passed");}*/
/*@Test
	public void washingmachine () throws InterruptedException{
Thread.sleep(3000);
	
	driver.navigate().to("https://staging.guarented.com/bangalore/washing-machine?nicks=washer&parent=appliances");
	Thread.sleep(13000);
	System.out.println("washing machine new url is "+driver.getCurrentUrl());
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/washing-machine-on-rent?nicks=washer&parent=appliances"));
	System.out.println("washing machine url passed");
	System.out.println("washing machine title is  "+driver.getTitle());
	Assert.assertTrue(driver.getTitle().equals("Washing Machines on Rent in Bangalore - GuaRented Rentals"));
	///////////////Automatic Washing Machine on Rent in Bangalore - Guarented Rentals
	System.out.println("washing machine  title passed");
	System.out.println("washing machine passed");}*/
/*@Test
	public void tables() throws InterruptedException{
Thread.sleep(3000);
	
	driver.navigate().to("https://staging.guarented.com/bangalore/tables?nicks=furn-tbl&parent=furniture");
	Thread.sleep(13000);
	System.out.println("tables new url is "+driver.getCurrentUrl());
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/tables-on-rent?nicks=furn-tbl&parent=furniture"));
	System.out.println("tables url passed");
	System.out.println("tables title is  "+driver.getTitle());
	Assert.assertTrue(driver.getTitle().equals("Premium Quality Tables on Rent in Bangalore - Guarented Rentals"));
	///////////////Premium Quality Tables on Rent in Bangalore  - Guarented Rentals
	System.out.println("tables  title passed");
	System.out.println("tables machine passed");}*/
	
	
	
//url fail and title passed	
/*@Test
	public void elitecamillasinglebed () throws InterruptedException{
Thread.sleep(3000);
	
	driver.navigate().to("https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture");
	Thread.sleep(13000);
	System.out.println("elite camilla single bed new url is "+driver.getCurrentUrl());
	//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/wrought-iron-single-bed?param=elite-cmla-sng-bd&parent=furniture"));
	System.out.println("elite camilla single bed url passed");
	/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
	System.out.println("elite camilla single bed title is  "+driver.getTitle());
	Assert.assertTrue(driver.getTitle().equals("Wrought Iron Single Bed on Rent in Bangalore - Guarented Rentals"));
	///////////////Wrought Iron Single Bed on Rent in Bangalore - Guarented Rentals
	System.out.println("elite camilla single bed  title passed");
	System.out.println("elite camilla single bed  passed");}
	*/
//url fail and title pass 	
@Test
	public void fourglassdiningset () throws InterruptedException{
	Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
	Thread.sleep(13000);
	///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
	
	System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
	//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
	System.out.println("four glass dining set url passed");
	/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
	System.out.println("four glass dining set title is  "+driver.getTitle());
	Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
	///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
	System.out.println("four glass dining set  title passed");
	System.out.println("four glass dining set  passed");}
	
	
@Test
	public void elitedoublebed() throws InterruptedException {
	Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
	Thread.sleep(13000);
	///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
	
	System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
	//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
	System.out.println("four glass dining set url passed");
	/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
	System.out.println("four glass dining set title is  "+driver.getTitle());
	Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
	///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
	System.out.println("four glass dining set  title passed");
	System.out.println("four glass dining set  passed");;
	}

	@Test
	public void elitecoltonsinglebed() throws InterruptedException{
		Thread.sleep(3000);
		driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
		Thread.sleep(13000);
		///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
		
		System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
		//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
		System.out.println("four glass dining set url passed");
		/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
		System.out.println("four glass dining set title is  "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
		///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
		System.out.println("four glass dining set  title passed");
		System.out.println("four glass dining set  passed");;
	}
	@Test
	public void elitecoltondoublebed() throws InterruptedException{	
		Thread.sleep(3000);
		driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
		Thread.sleep(13000);
		///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
		
		System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
		//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
		System.out.println("four glass dining set url passed");
		/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
		System.out.println("four glass dining set title is  "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
		///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
		System.out.println("four glass dining set  title passed");
		System.out.println("four glass dining set  passed");}
		
		
		@Test 
	public void brandnewsinglebed() throws InterruptedException{
			Thread.sleep(3000);
			driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
			Thread.sleep(13000);
			///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
			
			System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
			//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
			System.out.println("four glass dining set url passed");
			/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
			System.out.println("four glass dining set title is  "+driver.getTitle());
			Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
			///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
			System.out.println("four glass dining set  title passed");
			System.out.println("four glass dining set  passed");
	}
		@Test
		public void brandnewdoublebed() throws InterruptedException{	
			Thread.sleep(3000);
			driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
			Thread.sleep(13000);
			///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
			
			System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
			//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
			System.out.println("four glass dining set url passed");
			/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
			System.out.println("four glass dining set title is  "+driver.getTitle());
			Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
			///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
			System.out.println("four glass dining set  title passed");
			System.out.println("four glass dining set  passed");}
		
				
				@Test
		public void elite5sofa() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
				
				@Test
		public void elitesofa3() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
				
				@Test
			public void royalrecliner() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
				
				@Test
			public void brandnewstudychairs() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
	
				
				@Test
			public void elitestudychairs() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
				
				
				@Test
			public void brandnewsinglematteress() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
	
				
				@Test
			public void brandnewdoublemattresses() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
				
				

				@Test
			public void elitewardrobe() throws InterruptedException {
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
	
				
				@Test
			public void sixglassdiningtable() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
				
				@Test
			public void royalbroadbanddesk() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
			
	
				
				@Test
			public void elitecentertable() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
				
				@Test
			public void elitesttudytable() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
	
				
				@Test
			public void elitebedtable() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
				
				
				@Test
			public void coltondoublebedroompackage() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");;}
				
				@Test
				public void coltonsinglebedroompackage() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
			
	
				
				@Test
			public void coltontwinpackage() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
				
				@Test
			public void brandnewstudystudypackage() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
	
				
				@Test
			public void elitestudypackage() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");;}
				
				
				@Test
			public void smalltv() throws InterruptedException {
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
	
				
				@Test
			public void mediumtv() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
				
				@Test
			public void largetv() throws InterruptedException {
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
	
				
				@Test
			public void toploadwashingmachine() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
				
				@Test
			public void  frontloadashingmachine() throws InterruptedException {
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
	
				
				@Test
			public void  brandnewtoploadwashingmachine() throws InterruptedException {
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" four glass dining set new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("four glass dining set url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("four glass dining set title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("four glass dining set  title passed");
					System.out.println("four glass dining set  passed");}
				
				
				//@Test
			public void brandnewfrontloadwashingmachine() throws InterruptedException {
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
				Thread.sleep(13000);
				///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
				
				System.out.println("brand new front load washing machine new url is "+driver.getCurrentUrl());
				//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
				System.out.println("brand new front load washing machine url passed");
				/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
				System.out.println("brand new front load washing machine title is  "+driver.getTitle());
				Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
				///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
				System.out.println("brand new front load washing machine  title passed");
				System.out.println("brand new front load washing machine  passed");}
	
				
				@Test
			public void Doubledoorfridge() throws InterruptedException {
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println("Double door fridge new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("Double door fridge url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("Double door fridge title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("Double door fridge  title passed");
					System.out.println("Double door fridge  passed");}
				
				@Test
			public void fridgesingledoor() throws InterruptedException{ 
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println("fridge single door new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("fridge single door url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("fridge single door title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("fridge single door  title passed");
					System.out.println("fridge single door passed");}
	
				
				@Test
			public void brandnewsingledoor() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println("brand new single door new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("brand new single door url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("brand new single door title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("brand new single door title passed");
					System.out.println("brand new single door  passed");}
				
				
				@Test
			public void convectionmicrowave() throws InterruptedException {
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println("convection microwave new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("convection microwave url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("convection microwave title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("convection microwave title passed");
					System.out.println("convection microwave passed");}
	
				
				@Test
			public void solomicrowave() throws InterruptedException {
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" solo microwave new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("solo microwave url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("solo microwave title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("solo microwave  title passed");
					System.out.println("solo microwave  passed");}
				
				
				@Test
			public void basicappliancespackage() throws InterruptedException {
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" basic appliances package new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("basic appliances package url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("basic appliances package title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("basic appliances package  title passed");
					System.out.println("basic appliances package  passed");}
	
				
				@Test
			public void basickitchenpackage() throws InterruptedException {
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println("basic kitchen package new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("basic kitchen package url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("basic kitchen package title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("basic kitchen package  title passed");
					System.out.println("basic kitchen package  passed");}
				
				@Test
			public void royalappliancespackage() throws InterruptedException {
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println("royal appliances package new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("royal appliances package url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("royal appliances package title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("royal appliances package  title passed");
					System.out.println("royal appliances package  passed");}
	
				
				@Test
			public void completepackage() throws InterruptedException {
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println("complete package new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("complete package url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("complete package title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("complete package  title passed");
					System.out.println("complete package  passed");}
				
				@Test
			public void royalappliancepackage() throws InterruptedException {
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture");
					Thread.sleep(13000);
					///////////////////////////////https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal&parent=furniture
					
					System.out.println(" royal appliance package new url is "+driver.getCurrentUrl());
					//Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solid-wood-4-seater-dining-table?param=furn-din-4-royal&parent=furniture"));
					System.out.println("royal appliance package url passed");
					/////////////////////////https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd&parent=furniture
					System.out.println("royal appliance package title is  "+driver.getTitle());
					Assert.assertTrue(driver.getTitle().equals("Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals"));
					///////////////Solid Wood 4 Seater Dining Table Set on Rent in Bangalore - Guarented Rentals
					System.out.println("royal appliance package  title passed");
					System.out.println("royal appliance package  passed");}}
	
				
		/*		//@Test
			public void appliances package {
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/app-pack-comp");
				Thread.sleep(3000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/app-pack-comp"));
				System.out.println(" appliances package passed");}*/
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	


