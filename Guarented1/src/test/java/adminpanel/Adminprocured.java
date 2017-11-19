package adminpanel;


import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Adminprocured extends Adminconfirmed {
	@BeforeMethod
	public void setup() throws IOException {
		init1();

	}

	@Test
	public void adminflowthroughmyordersinprocuredpage() throws Exception {
		Admintestflowthroughmyordersinhomepage ah=new Admintestflowthroughmyordersinhomepage();
		ah.adminflowthroughmyorders();
		Adminconfirmed acf=new Adminconfirmed();
		acf.confirmation();
		
		

	
		
	}}

