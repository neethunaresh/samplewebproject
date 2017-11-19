package com.guarented.ecommerce.commonUtilss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils1 {
	public static final long maxWaitTime=300; //in seconds
	
	static long TIMEOUT_S = 60;
	static int INT_TIMEOUT_S = Integer.parseInt(Long.toString(TIMEOUT_S));
	static long WAIT_TIMEOUT = 30L;
	public CommonUtils1() {

	}
	
	public boolean isElementPreset(By object,WebDriver driver) {

		try {
			return driver.findElement(object).isDisplayed();
		} catch (Exception e) {
			return false;
		}

	}
	
	public static void waitForSeconds(WebDriver driver, int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
	public static void waitForElementToBeVisible(final WebDriver driver, final By locator) throws RuntimeException {
		Wait<WebDriver> wait = new WebDriverWait(driver, WAIT_TIMEOUT);
		try {
			wait.until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver driver) {
					// driver.switchTo().defaultContent();
					WebElement element = driver.findElement(locator);
					if (element.isDisplayed()) {
						return element;
					}
					return null;
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(
					"Exception while waiting for " + locator + ". Exception:" + e + " on " + driver.getCurrentUrl());
		}
	}



	public WebElement addedItemInList(String ID, WebDriver driver) {
		Select sel = new Select(driver.findElement(By.id(ID)));
		return sel.getOptions().get(0);

	}

	public void removeItemFromList(String ID, WebDriver driver) {

		addedItemInList(ID, driver).click();
		Actions act = new Actions(driver);
		act.doubleClick(addedItemInList(ID, driver)).build().perform();
	}

	public String addedItemText(String ID, WebDriver driver) {
		return addedItemInList(ID, driver).getText().trim();
	}

	public void clickItemFromList(String itemText, WebDriver driver) {
		//Logging.log("clicking item from List");
		driver.findElement(By.xpath("//div[text()='" + itemText + "']"))
				.click();
	}

	public void clickByDefaultSelectedItemInDropDownList(WebDriver driver) {

		driver.findElement(
				By.xpath(".//div[@class='x-combo-list-item x-combo-selected']"))
				.click();
	}

	public String textofByDefaultSelectedItemInDropDownList(WebDriver driver) {

		return driver
				.findElement(
						By.xpath(".//div[@class='x-combo-list-item x-combo-selected']"))
				.getText();
	}
	
	/**
	 * 
	 * @param driver
	 * @return
	 * This method returns the list of parent and child windows, 0th element will be parent window and 1st element will be child window
	 */
	public ArrayList<String> getWindows(WebDriver driver){
		String parentWindow,childWindow;
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		parentWindow=it.next();
		childWindow=it.next();
		ArrayList<String>al=new ArrayList<String>();
		al.add(parentWindow);
		al.add(childWindow);
		return al;
	}
	
	/**
	 * 
	 * @param driver
	 * @param seconds
	 * An implicit wait is to tell WebDriver to poll the DOM for a certain amount of time.
	 */
	public void implicitWait(WebDriver driver,Long seconds){
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);		
	}
	
	/**
	 * 
	 * @param driver
	 * @param elementTowait
	 * @param seconds
	 * An explicit wait is code you define to wait for a certain condition to occur before proceeding further in the code.
	 */
	public void explicitWait(WebDriver driver,By elementTowait,Long seconds){
		//System.out.println("Waiting for Element for maximum "+seconds+" seconds");
		new WebDriverWait(driver, seconds)
		  .until(ExpectedConditions.presenceOfElementLocated(elementTowait));		
	}
	
	/**
	 * 
	 * @param driver
	 * @param elementTowait
	 * @param maxWaitTime
	 * An explicit unified wait for whole application
	 */
	
	public void explicitWait(WebDriver driver,By elementTowait){
		System.out.println("Waiting for Element for maximum "+maxWaitTime+" seconds");
		new WebDriverWait(driver, maxWaitTime)
		  .until(ExpectedConditions.presenceOfElementLocated(elementTowait));		
	}
	
	/*public String getCustomerName(){
		String customerName=ContextManager.getThreadContext().getInstance();
		return customerName;
	}
	*/
	public void moveVerticalScrollBar(WebDriver driver, int pix ){
		WebElement scrollbar=driver.findElement(By.xpath("//div[@class='ps-scrollbar-y']"));
		//WebElement scrollbar=driver.findElement(By.xpath("//div[@class='scroller-advance-search']"));
		
		Actions action = new Actions(driver);		
		action.clickAndHold(scrollbar).moveByOffset(0, pix).release().perform();
		
	}
	
	public void mouseOverToElement(WebDriver driver, WebElement we){
		Actions action = new Actions(driver);
		action.moveToElement(we).build().perform();
	}
	
	public void selectANDOperator(WebDriver driver){
		driver.findElement(By.xpath("//span[text()='AND']")).click();
	}
	
	public void selectOROperator(WebDriver driver){
		driver.findElement(By.xpath("//span[text()='OR']")).click();
	}
	
	public String[] getMatchCloudArray(String commaSeparatedCloudString){
		String []cloudArr=commaSeparatedCloudString.split(",");
		for(String cloud:cloudArr){
		System.out.println("Cloud String : "+cloud);
		//Logging.log("Cloud String : "+cloud);
		}
		return cloudArr;
	}

	
	public static void getpagetime(){
		
	WebDriver driver;
		long start=System.currentTimeMillis();
		System.out.println("start time is "+start);
		//driver.get("https://www.guarented.com/");
		long finaltime=System.currentTimeMillis();
		System.out.println("final time is "+finaltime);
		long pagetime=finaltime-start;
		System.out.println("page time to load the page is "+pagetime);
			}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");        
        WebDriver driver = new ChromeDriver(); 
        long start=System.currentTimeMillis();
		System.out.println("start time is "+start);
		driver.get("https://staging.guarented.com/");
		driver.manage().window().maximize();
		long finaltime=System.currentTimeMillis();
		System.out.println("final time is "+finaltime);
		long pagetime=finaltime-start;
		System.out.println("page time to load the page is "+pagetime);
			}
	
	
	
	
/*	public Guarente_loginpage(WebDriver driver){
		this.driver=driver;
		
	}
	public void logout(){
		try{
			boolean isdisplayed=driver.findElement(signout).isdisplayed();
			if(isdisplayed){
				driver.findElement(signout).click();
			}}
		catch(Exception e){
			Assert.assertrue(false,"signout button is not displayed");
		}
			}
		}
	}
	
	
	


	public void clickonSignIn(){
		System.out.println("Clicking the login  button in home page ");
		driver.findElement(loginbutton).click();
		  
	  }
	public void clickonSignIndropdown(){
		System.out.println("Clicking the login drop down button in home page ");
		driver.findElement(logindropdownbutton).click();
		  
	  }
	public void enterAllreadyRegisterUserEmail(){
		  
		  System.out.println("Entering the email field");
			driver.findElement(allreadyRegEmailAddr).sendKeys("naresh@guarented.com");
	  }
 public void enterAllreadyRegisterUserPass(){
		  
		  System.out.println("Entering the password field");
			driver.findElement(allReadyRegPass).sendKeys("neethu23");
	  }
	  public void clickSubmitButtton(){
		  System.out.println("Clicking the submit button");
			driver.findElement(submitButton).click();
		  
		  
	  }
}
	*/
	/*public void enterfirstnar(String name){
		  log.info("entering 1st name");
		  this.fistname.sendkeys(name)
		  
	  }*/
	
	
	
	
	
	
	/*verification purpose
	
	public boolean verifylogo(){
		  log.info("verifying logo in main on ui");
try{
		  element.displayed();
		  return true;}
catch(Exception e){
	return false;
}
	  }

}*/
	
	
	
	/*
	
	 public static String capturescreenshot(WebDriver driver,String screenshotname)
	 {
	 try{
	 	TakesScreenshot ts=(TakesScreenshot)driver;
	 	

	 	// Take screenshot and store as a file format
	 	File src= ts.getScreenshotAs(OutputType.FILE);
	 	String dest="D:\\git\\Guarented1\\screenshots"+screenshotname+".png";
	 File destination=new File(dest);
	 FileUtils.copyFile(src, destination);
	 System.out.println("screen shot taken ");

	 	return dest;
	 	
	 }
	 catch(Exception e){
	 	System.out.println("exception while taking screen shot "+e.getMessage());
	 	return e.getMessage();
	 }


	 	
	 	


	  
	 }}*/
	
	
	
	
	
	
	
/*	Email email = new SimpleEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator("nareshnavaneethu@gmail.com", "navanetH%"));
	email.setSSLOnConnect(true);
	email.setFrom("abc@gmail.com");
	email.setSubject("TestMail2");
	email.setMsg("This is a test mail  sdcddcdcdzcsdd ... :-)");
	email.addTo("naresh@guarented.com");
	email.send();
	System.out.println("ended");
	

}}*/

	
	
	
	
	
	
	
	
	/*int r=driver.findElements(By.xpath(".//*[@id='cart_table']/tbody/tr")).size();

	System.out.println("rows are  "+r);
	int c=driver.findElements(By.xpath(".//*[@id='cart_table']/thead/tr/th")).size();
	System.out.println("coloums are  "+c);
	for(int i=1;i<=r;i++){
		for(int j=1;j<=c;j++){
			System.out.print(driver.findElement(By.xpath(".//*[@id='cart_table']/tbody/tr["+i+"]/td["+j+"]")).getText()+"   ");
			
		}
		System.out.println();
	}*/


/*By mySelector = By.xpath("//span[@class='ng-scope']");
	
	List<WebElement> myElements = driver.findElements(mySelector);
	for(WebElement e : myElements) {
	  System.out.println("values are  "+  e.getText());
	  Thread.sleep(6000);
	  
	  
	  			  
	
	if( e.getText().equals("NEXT"))
		e.click();
	}*/
	
/*
	driver.findElement(By.xpath("//*[@id='cart_tab']/md-icon")).click();
	Thread.sleep(5000);
	
	
	int r=driver.findElements(By.xpath(".//*[@id='cart_table']/tbody/tr")).size();

	System.out.println("rows are  "+r);
	int c=driver.findElements(By.xpath(".//*[@id='cart_table']/thead/tr/th")).size();
	System.out.println("coloums are  "+c);
	for(int i=1;i<=r;i++){
		for(int j=1;j<=c;j++){
			System.out.print(driver.findElement(By.xpath(".//*[@id='cart_table']/tbody/tr["+i+"]/td["+j+"]")).getText()+"   ");
			
		}
		System.out.println();
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//driver.manage().deleteAllCookies();
	
	
	
	
	
	
	/*Set<Cookie> cookie=driver.manage().getCookies();
	Iterator<Cookie>cookieset=cookie.iterator();
	while(cookieset.hasNext()){
		System.out.println("the cookies are "+cookieset.next());
	}
	
	
	
	
	
//WebElement ele=	driver.findElement(By.id("cart_table"));
	
	
	
	
	/*List<WebElement>ele=driver.findElements(By.tagName("tr"));

     System.out.println("rows are  "+ele.size());
     List<WebElement>elebodyrows=driver.findElements(By.xpath(".//*[@id='cart_table']/tbody/tr"));
 	
     System.out.println("rows are  "+elebodyrows.size());
     List<WebElement>eletds=driver.findElements(By.tagName("td"));
 	
     System.out.println("rows are  "+eletds.size());
     
     */
     
     
     
     
     
	
	
	
	
	
	
	
	/*String value1=driver.findElement(By.xpath(".//*[@id='container']/div[2]/div/div[1]/h1")).getText();
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*waitForElementToBeVisible(driver, activityExpand);
	
	
	public void verifyProfilePositionsNotNull() {
		Assert.assertTrue(isElementVisiable(driver, profileEducation));
	}
	
	
	
	public String getSkills() {
		return this.driver.findElement(skills).getText();
	}
	
	
	
	public void getpricedetailsofproductincart(){

		public WebElement getPrimarySkillTextBox() {
			commonUtils.explicitWait(driver, PrimarySkillTextBox, 30L);
			return this.driver.findElement(PrimarySkillTextBox);
		}

		public WebElement getSLLTextBox() {
			commonUtils.explicitWait(driver, SLLTextBox, 30L);
			return this.driver.findElement(SLLTextBox);

		}

		public WebElement getLocationTextBox() {
			commonUtils.explicitWait(driver, LocationTextBox, 30L);
			return this.driver.findElement(LocationTextBox);
		}

		public WebElement getDownloadJDIcon() {
			commonUtils.explicitWait(driver, DownloadJDIcon, 30L);
			return this.driver.findElement(DownloadJDIcon);
		}

		public WebElement getRequisitionNoTextBox() {
			//commonUtils.explicitWait(driver, RequisitionNoTextBox, 30L);
			return this.driver.findElement(RequisitionNoTextBox);
		}

		public void getPopularPoolLabel() {
			driver.findElement(popularPoolLabel);
		}

		public void getOpenRequisitionLabel() {
			driver.findElement(openRequisitionLabel);
		}

		public WebElement clickFiltersIcon() {
			return driver.findElement(FiltersIcon);
		}

		public void clickLogout() {
			driver.findElement(logoutButton).click();
		}

		public void typeInUniversalSearch(String searchString) throws InterruptedException {
			System.out.println("Typing in Universal search");
			driver.findElement(universalSearch).sendKeys(searchString);
			Thread.sleep(5000);
		}
		public WebElement getPassiveCandidatesIcon(){
			commonUtils.explicitWait(driver, PassiveCandidatesIcon, 30L);
	    	return this.driver.findElement(PassiveCandidatesIcon);
		}
		public List<WebElement> getAutoSuggestListInUniversalSearch(String searchString) throws InterruptedException {

			typeInUniversalSearch(searchString);
			Thread.sleep(7000);

			return driver.findElements(autoSuggestList);
		}

		public void typeEnterInSRStausBox() throws InterruptedException {
			System.out.println("Typing in SR Status Box");
			driver.findElement(srStatusTextBox).sendKeys(Keys.ENTER);
			driver.findElement(srStatusTextBox).sendKeys(Keys.ENTER);
			Thread.sleep(15000);
		}
		
		public List<WebElement> getSrStatusList() throws InterruptedException {
			Thread.sleep(10000);// waiting for graph to load after that only drop
								// down list is coming
			typeEnterInSRStausBox();

			return driver.findElements(srStatusListInDropdown);
		}
		Actions actions = new Actions(driver);
		WebElement refinesearch = driver.findElement(By.xpath(".//*[@id='ngViewDiv']/div/div[1]/div[1]"));
		actions.moveToElement(refinesearch);

		WebElement experience = driver.findElement(By.xpath(".//*[@id='ngViewDiv']/div/div[1]/div[2]/div[1]/ul[3]"));
		actions.moveToElement(experience);
		actions.click().build().perform();
		
		public void clickexperienceinCandidateListView() {
			this.driver.findElement(experienceinCandidateListView).click();
		}

		public void clicksourcenameinCandidateListView() {
			this.driver.findElement(sourcenameinCandidateListView).click();
		}

		
			Assert.assertEquals(idcdemandchartlables.contains("Total"), true);
   			Assert.assertEquals(idcdemandchartlables.contains("Automatched"), true);
   			Assert.assertEquals(idcdemandchartlables.contains("Tagged"), true);
		public void clickCallndarYearMonth() {
			this.driver.findElement(callendar_YearMonth).click();	
		}
		public void clickCallndarYear() {
			this.driver.findElement(callendar_Year).click();	
		}
		public void clickCallndarYearAny() {
			this.driver.findElement(callendar_Year_One).click();	
		}
		public void clickCallndarMonth() {
			this.driver.findElement(callendar_Month).click();	
		}
		public void clickAdvancedSearchLink() {
			commonUtils.explicitWait(driver, advancedSearchLink, 10L);
			this.driver.findElement(advancedSearchLink).click();
			Logging.log("Advanced Search link is clicked.");
		}

		
		
		public void typeInUniversalSearch(String searchString) throws InterruptedException {
			System.out.println("Typing in Universal search");
			driver.findElement(universalSearch).sendKeys(searchString);
			Thread.sleep(5000);
		}

		public List<WebElement> getSrStatusList() throws InterruptedException {
			Thread.sleep(10000);// waiting for graph to load after that only drop
								// down list is coming
			typeEnterInSRStausBox();

			return driver.findElements(srStatusListInDropdown);
		}

		public List<WebElement> getSrStatusListInResultGrid() throws InterruptedException {

			return driver.findElements(srStatusListInResultGrid);
		}

		
		
		
		
		
		
		public void clickelementinIndianServiceLeader() throws InterruptedException {

			Thread.sleep(3000);
			Actions actions = new Actions(driver);
			WebElement Textbox = driver.findElement(By.xpath("//div[@class='col-md-12 col-sm-12 col-xs-12 ng-scope']"));
			actions.moveToElement(Textbox);
			actions.moveToElement(getIndianServiceLeaderInFacet());
			actions.click().build().perform();
			Logging.log("clicking IndianServiceLeader in Facet");
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/label/span/img"))
					.click();
			clickFiltersIcon();
			Thread.sleep(3000);
			String expectedresult = driver.findElement(By.xpath("//label[contains(@id,'candCbLabel_0_1')]")).getText();
			System.out.println("expectedresult :" + expectedresult);
			String Actualresult = driver.findElement(By.xpath("//label[contains(@id,'candCbLabel_0_1')]")).getText();
			System.out.println("Actualresult :" + Actualresult);
			Assert.assertEquals(Actualresult, expectedresult);
			System.out.println("test case pass");
			clickDropdownMenuToGetLogoutButton();
			commonUtils.explicitWait(driver, By.xpath("//div[contains(text(),'Requisition I')]/following-sibling::div/div/div/div/div/input"), 30L); 
			Actions actions = new Actions(driver);
		    WebElement Textbox = driver.findElement(By.xpath("//div[contains(text(),'Requisition I')]/following-sibling::div/div/div/div/div/input"));
		    actions.moveToElement(Textbox);
		    actions.click().build().perform();	
		}

		cu.explicitWait(driver, By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[6]"), 30L);
		commonUtils.explicitWait(driver,
				By.xpath("//div[contains(@title,'Designation')] | //div[contains(text(),'Title')] | //div[contains(@title,'Requisition Title')] | //div[contains(@ng-if,'JOB_TITLE')]/input"), 30L);
		commonUtils.explicitWait(driver, By.xpath("//label[@id='candCbLabel_4_1']"), 30L);
		commonUtils.mouseOverToElement(this.driver, driver.findElement(By.xpath("//label[@id='candCbLabel_4_1']")));
		commonUtils.moveVerticalScrollBar(driver, 300);
		driver.findElement(By.xpath("//label[@id='candCbLabel_4_1']")).click();
		
		
		Assert.assertTrue(cu.isElementPreset(NEXT_button, driver), "");
		cu.explicitWait(driver, itemprice, 30L);
	cu.mouseOverToElement(driver, t);
	public void clickFirstReqInDropDownList(String customerName) throws InterruptedException {

		List<WebElement> wl = getReqSuggestedListWebElement(customerName);
		WebElement we = wl.get(0);
		commonUtils.mouseOverToElement(driver, we);
		we.click();
	}*/
        
		
		
	
	
	
	
	
	
	
	}
