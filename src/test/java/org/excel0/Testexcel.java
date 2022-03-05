package org.excel0;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Testexcel {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Mvn1\\Excel\\Dataprovider demo.xlsx");

		FileInputStream finput = new FileInputStream(f);
              Workbook w = new XSSFWorkbook(finput);
              org.apache.poi.ss.usermodel.Sheet sheet = w.getSheet("Sheet1");
              Row row = sheet.getRow(1);
              Cell cell = row.getCell(1);
              String stringCellValue = cell.getStringCellValue();
              System.out.println(stringCellValue);
              
	}

}
