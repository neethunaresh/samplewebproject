package com.guarented.ecommerce.Testplans;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guaren.ecommerce.excelreader.Excel_Reader;
import com.guarented.ecommerce.pageUtils.Delivery1utls;
import com.guarented.ecommerce.pageUtils.LoginPageUtils1;
import com.guarented.ecommerce.pageUtils.cartpageUtils1;
import com.guarented.ecommerce.pageUtils.productdetailsutils1;
import com.guarented.ecommerce.pages.Homepage1;
import com.guarented.reportsbaseclass.BaseTest;

public class DeliveryPageTestPlan extends BaseTest {
	
	@BeforeMethod
	public void setUP() throws IOException {
		init1();
	}
	
	public Object[][] getData(String ExcelName, String testcase) {
		Excel_Reader Data = new Excel_Reader(System.getProperty("user.dir")
				+ "//src//test//resources//" + ExcelName);
		int rowNum = Data.getRowCount(testcase);
		System.out.println(rowNum);
		int colNum = Data.getColumnCount(testcase);
		Object sampleData[][] = new Object[rowNum - 1][colNum];
		for (int i = 2; i <= rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				sampleData[i - 2][j] = Data.getCellData(testcase, j, i);
			}
		}
		return sampleData;
	}
	@DataProvider
	public Object[][] DeliverypageData() {
		Object[][] data = getData("GuarentedData.xlsx", "DeliveryData");
		return data;
	}
	@DataProvider
	public Object[][] DeliverypageDatawithinvalid() {
		Object[][] data = getData("GuarentedData.xlsx", "DeliveryDatainvaliddata");
		return data;
	}
	@Test(dataProvider = "DeliverypageData")
	public void customerdetailsindeliverypagewithvaliddetails(String TestCaseName, String pincode,
			String address, String mobilenumber, String area,String Societyname )
			throws InterruptedException {
		test = extent.createTest("customer details in delivery page with validdetails testcase started");
		System.out.println("customer details in delivery page with validdetails testcase started");
		Thread.sleep(6000);
		LoginPageUtils1 lu = new LoginPageUtils1();
		System.out.println("login page started");
		lu.loginToApplication("naresh@guarented.com", "neethu23");
		Thread.sleep(9000);
		System.out.println("***********************************");
		System.out.println("login page ended");
		Homepage1 gh = new Homepage1();
		System.out.println("home page started");
		gh.verifyGuarentedtextinhomepage();
		gh.bookitemthroughproducts();
		System.out.println("home page ended");
		productdetailsutils1 pu = new productdetailsutils1();
		System.out.println("product details page started");
		pu.click_Addtocart_Button();
		Thread.sleep(5000);
		pu.clickCheckoutButton();
		Thread.sleep(5000);
		System.out.println("*************************************");
		System.out.println("product details page ended");
		cartpageUtils1 ca = new cartpageUtils1();
		System.out.println("cart page started");
		Thread.sleep(5000);
		ca.click_Next_Buttonincart();
		Thread.sleep(5000);
		System.out.println("cart page ended");
		Delivery1utls du = new Delivery1utls();
		System.out.println("delivery page started");
		Thread.sleep(8000);
		du.sendcustomerdetailsindeliverypage(pincode, address, mobilenumber, area,Societyname);
		System.out.println("customer details in delivery page with validdetails testcase ended");
	
	}
	@Test(dataProvider = "DeliverypageDatawithinvalid")
	public void customerdetailsindeliverypageinvaliddetails(String TestCaseName, String pincode,
			String address, String mobilenumber, String area,String Societyname )
			throws InterruptedException {
		test = extent.createTest("customer details in delivery page invalid details testcase started");
		System.out.println("customer details in delivery page invalid details testcase started");
		Thread.sleep(6000);
		LoginPageUtils1 lu = new LoginPageUtils1();
		System.out.println("login page started");
		lu.loginToApplication("naresh@guarented.com", "neethu23");
		Thread.sleep(9000);
		System.out.println("**************************************");
		System.out.println("login page ended");
		Homepage1 gh = new Homepage1();
		System.out.println("home page started");
		gh.verifyGuarentedtextinhomepage();
		gh.bookitemthroughproducts();
		System.out.println("home page endedd");
		productdetailsutils1 pu = new productdetailsutils1();
		pu.click_Addtocart_Button();
		Thread.sleep(5000);
		pu.clickCheckoutButton();
		Thread.sleep(5000);
		cartpageUtils1 ca = new cartpageUtils1();
		Thread.sleep(5000);
		ca.click_Next_Buttonincart();
		Thread.sleep(5000);
		Delivery1utls du = new Delivery1utls();
		Thread.sleep(8000);
		du.sendcustomerdetailsindeliverypage(pincode, address, mobilenumber, area,Societyname);
		String errormessageinmobileindeliverypage=driver.findElement(By.xpath("//*[@id='address']/div/div[2]/div/div/form/div[2]/md-input-container[1]/div[2]/div")).getText();
	System.out.println("errror message is  "+errormessageinmobileindeliverypage);
	Assert.assertTrue(errormessageinmobileindeliverypage.equals("Please enter 10 digit mobile num."), "mobile number error  is not displaying");
	System.out.println("delivery page is displaying correct validation to mobile field");
	System.out.println("customer details in delivery page invalid details testcase ended");
	}
	
	
	
	
	
	
	

	


}
