package fotf_DDF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelLib {
	
	public static Workbook wrkBook;
	public static Sheet sheet;
	public static Hashtable dict=new Hashtable();
	public static Hashtable flaggedMethod=new Hashtable();
	
	public ExcelLib(String path) throws IOException, BiffException{
			
			wrkBook=Workbook.getWorkbook(new File(path));
			sheet=wrkBook.getSheet("Testcase");
		
			columnDictionary();
		
	}
	// Returns the Sum of Rows in the Excel 
	public static int rowCount(){
		return sheet.getRows();
	}
	
	// Returns the Cell value by taking row and column as argument
	public static String getCellValue(int colNumber, int rowNumber){
		
		return sheet.getCell(colNumber, rowNumber).getContents();
		
	}
	
	public static String readCell(String colName, int rowNumber){
		return getCellValue(getCell(colName),rowNumber);
	}
	
	// Create Column Dictionary to hold all the Column Names
	public static void columnDictionary(){
		for(int col=0; col<sheet.getColumns(); col++){
			dict.put(getCellValue(col,0), col);
		}
	}
	
	// Read Column Names
	public static int getCell(String colName){
		try{
		int value;
		value=((Integer) dict.get(colName)).intValue();
		return value;
		}catch(NullPointerException e){
			return(0);
		}
		
	}
	
	// Get all the Flagged methods from Excel Sheet
	public static Hashtable getFlaggedMethods(String columnName){
		try{
			int methodcount=1; // Key count Flag will track of method count
			for(int row=0;row<rowCount();row++){
				if(readCell(columnName, row).equals("EXECUTE")){
				// put method key count and the key name
				flaggedMethod.put(methodcount, readCell("TestcaseMethods", row)
						+";"+ readCell("ExcelName", row));
					methodcount++;
				}
			}
		}catch(Exception e){
			
		}
		return flaggedMethod;
		
	}
}
