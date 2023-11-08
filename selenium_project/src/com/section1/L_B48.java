package com.section1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class L_B48 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream("C:\\\\Users\\\\Jaskirat Singh\\\\Desktop\\\\college\\\\book2.xlsx");
		Workbook book= WorkbookFactory.create(fs);
		Sheet sheet = book.getSheet("sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String un = cell.getStringCellValue();
		Cell pass = row.getCell(1);
		String password = pass.getStringCellValue();
		System.out.println(un);
		System.out.println(password);
		
	}
}

