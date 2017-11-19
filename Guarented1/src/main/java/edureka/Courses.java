package edureka;

import java.util.ArrayList;
import java.util.List;

public class Courses {
	
	
public static List<String>courses=new ArrayList<String>();

public static List<String>getcourse(int coursecount){
	for(int coursecounter=1;coursecounter<coursecount;coursecounter++){
		String coursenames=excelutils.getCellData(coursecounter,0);
		System.out.println("coursenames are "+coursenames.length());
		if(!coursenames.isEmpty())
			courses.add(coursenames);
		
	}
	return courses;
	
}




}
