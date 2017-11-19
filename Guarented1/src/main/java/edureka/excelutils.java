package edureka;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutils {
	public static String path;
		
		public static XSSFWorkbook excelwbook;
		public static XSSFSheet excelwsheet;

		public static XSSFCell cell;

		public static void setexcelfile(String Path,String sheetname) throws IOException {
			path = Path;
		
				FileInputStream excelfile = new FileInputStream(Path);
				excelwbook = new XSSFWorkbook(excelfile);
				excelwsheet=excelwbook.getSheet(sheetname);
		}
		
		

		public static  String getCellData(int rownum, int colnum) {
			cell=excelwsheet.getRow(rownum).getCell(colnum);
			String celldata=cell.getStringCellValue();
			return celldata;
			}
		public int getrowcount(){
			int rowcount=excelwsheet.getLastRowNum();
			rowcount=rowcount+1;
			return rowcount;
			
		}
		public void writeDExcelresults(Map<String,String>mapexcelcousetitle)
		{
			Sheet resultsheet=excelwbook.createSheet("results11");
			int rowindex=0;
			Row headerrow=resultsheet.createRow(rowindex++);
			headerrow.createCell(0).setCellValue("coursetitle");
			headerrow.createCell(1).setCellValue("result");
			Iterator<Entry<String,String>> it=mapexcelcousetitle.entrySet().iterator();
			while(it.hasNext()){
				Row row=resultsheet.createRow(rowindex++);
				Map.Entry pair=(Map.Entry)it.next();
				int cellindex=0;
				row.createCell(cellindex++).setCellValue(pair.getKey().toString());
				row.createCell(cellindex++).setCellValue(pair.getValue().toString());
				}
				try{
					FileOutputStream input=new FileOutputStream(path);
					excelwbook.write(input);
					input.close();
					System.out.println(path  +  "  is success written");
				
				
			}
				catch(FileNotFoundException e){
					e.printStackTrace();
					}
				catch(IOException e){
					e.printStackTrace();
					}
				
				
				}
				
			
			
			
		}
		
		
		
		
		
		
		
			
		
