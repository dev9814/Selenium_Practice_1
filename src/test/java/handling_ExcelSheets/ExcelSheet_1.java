package handling_ExcelSheets;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet_1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fil = new FileInputStream("E:\\SSQuare_Testing\\Book1.xlsx");
		
		// created a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		
		// selected the first sheet
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		
		XSSFRow s1row1 = sheet1.getRow(0);
		
		XSSFCell s1r1cella = s1row1.getCell(0);
		
		XSSFCell s1r1cellb = s1row1.getCell(1);
		
		System.out.println(s1r1cella);
		System.out.println(s1r1cellb);
		
		Thread.sleep(2000);
		// break 1
		
		// selected the second sheet
		XSSFSheet sheet2 = workbook.getSheetAt(1);
		
		XSSFRow s2row1 = sheet2.getRow(0);
		
		XSSFCell s2r1cella = s2row1.getCell(0);
		XSSFCell s2r1cellb = s2row1.getCell(1);
		XSSFCell s2r1cellc = s2row1.getCell(2);
		
		XSSFRow s2row2 = sheet2.getRow(1);
		
		XSSFCell s2r2cella = s2row2.getCell(0);
		XSSFCell s2r2cellb = s2row2.getCell(1);
		XSSFCell s2r2cellc = s2row2.getCell(2);
		
		XSSFRow s2row3 = sheet2.getRow(2);
		
		XSSFCell s2r3cella = s2row3.getCell(0);
		XSSFCell s2r3cellb = s2row3.getCell(1);
		XSSFCell s2r3cellc = s2row3.getCell(2);
		
		System.out.println(s2r1cella +" "+  s2r1cellb +" " + s2r1cellc);
		
		System.out.println( s2r2cella +" "+  s2r2cellb +" " + s2r2cellc );
		
		System.out.println( s2r3cella +" "+  s2r3cellb +" " + s2r3cellc );
		
		
		//
		//
		//

	}

}
