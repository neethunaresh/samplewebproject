package edureka;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demoscriptclass {
	WebDriver driver;
	
@BeforeTest 
public void setup() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.edureka.co/");
	Thread.sleep(9000);
	
}


@Test
public void headercode() throws IOException, InterruptedException{
	String vcousetitles;
	excelutils utils=new excelutils();
	int colnumber;
	String searchtext="git";
	String exceldata;
	String coursename;
	boolean flag=true;
	Map<String,String>mapexistcousetitle=new HashMap<String,String >();
	courseselector course=new courseselector();
	colnumber=course.selectcourse(searchtext);
	String spath="D:\\webbbb\\Guarented1\\src\\test\\resources\\testscript.xlsx";

	excelutils.setexcelfile(spath, "Courses");
	int coursecount=utils.getrowcount();
	System.out.println("coursecount are  "+coursecount);
	List<String>listcourses=Courses.getcourse(coursecount);
	System.out.println("cousetxt is" +listcourses.size());
	
	excelutils.setexcelfile(spath, "dataset");
	Iterator<String> it=listcourses.iterator();
	while(it.hasNext()){
		searchtext=it.next();
		colnumber=course.selectcourse(searchtext);
		System.out.println("colnum is  "+colnumber);
		
			driver.findElement(By.id("homeSearchBar")).sendKeys(searchtext);
			System.out.println("sending");
			Thread.sleep(8000);
			driver.findElement(By.id("homeSearchBarIcon")).click();
			System.out.println("clicked");
			Thread.sleep(8000);
			
			
		
		List<WebElement>optioncount=driver.findElements(By.xpath("//*[@id='layoutmain']/ul/li"));
		System.out.println("the total keyword"+optioncount.size());
		for(int counter=1;counter<optioncount.size();counter++){
			WebElement coursetitle=driver.findElement(By.xpath(".//*[@id='layoutmain']/ul/li["+counter+"]/div/div/div[3]/div/h3/a"));
			vcousetitles=coursetitle.getText();
			System.out.println("text is   "+vcousetitles);
			System.out.println("conternum is" +counter);
			
			exceldata=excelutils.getCellData(counter, colnumber);
			System.out.println(exceldata.equals(vcousetitles)? vcousetitles+ "\tpass" : vcousetitles +"\tfail ");
		
			
			
			
			mapexistcousetitle.put(vcousetitles, exceldata.equals(vcousetitles)? "pass ":"fail");
			}
		Thread.sleep(2000);
	}
		
	
		
	
			
		utils.writeDExcelresults(mapexistcousetitle);	
		
		
	}
			
}
	

	



