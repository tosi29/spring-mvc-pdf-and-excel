package com.example.demo;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

public class MyExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Sheet sheet = workbook.createSheet("MyTestSheet");
		
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(3);
		cell.setCellValue("0,3");
		cell = row.createCell(0);
		cell.setCellValue((String)model.get("mydata"));

		row = sheet.createRow(11);
		cell = row.createCell(0);
		cell.setCellValue("11,0");

		row = sheet.createRow(1);
		cell = row.createCell(1);
		cell.setCellValue("1,1");
		
		cell = row.createCell(10);
		cell.setCellValue("1,10");
	}
	
}
