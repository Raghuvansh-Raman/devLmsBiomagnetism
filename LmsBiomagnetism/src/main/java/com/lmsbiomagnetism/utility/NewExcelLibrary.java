package com.lmsbiomagnetism.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcelLibrary {
    private String path = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\TestData.xlsx";

    private FileInputStream fis = null;
   // private FileOutputStream fileOut = null;
    private XSSFWorkbook workbook = null;
    private XSSFSheet sheet = null;
    private XSSFRow row = null;
    private XSSFCell cell = null;

    // Constructor
    public NewExcelLibrary() {
        this(System.getProperty("user.dir") + "");
    }

    // Parameterized Constructor
    public NewExcelLibrary(String path) {
        try {
            this.path = path;
            fis = new FileInputStream(path);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheetAt(0);
        } catch (IOException e) {
            System.err.println("Error loading Excel file: " + e.getMessage());
            e.printStackTrace();
        } finally {
            closeFileInputStream();
        }
    }

    // Close FileInputStream to prevent resource leak
    private void closeFileInputStream() {
        try {
            if (fis != null) {
                fis.close();
            }
        } catch (IOException e) {
            System.err.println("Error closing FileInputStream: " + e.getMessage());
        }
    }

    // Get row count in a sheet
    public int getRowCount(String sheetName) {
        int index = workbook.getSheetIndex(sheetName);
        if (index == -1) return 0;
        
        sheet = workbook.getSheetAt(index);
        return sheet.getLastRowNum() + 1;
    }
    
    public int getColumnCount(String sheetName)
    {
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(0);
        int colCount = row.getLastCellNum();
        return colCount;
    }

    
    
    // Get cell data by column name
    public String getCellData(String sheetName, String colName, int rowNum) {
        try {
            if (rowNum <= 0) return "";

            int index = workbook.getSheetIndex(sheetName);
            if (index == -1) return "";

            sheet = workbook.getSheetAt(index);
            row = sheet.getRow(0);
            
            int colNum = -1;
            for (int i = 0; i < row.getLastCellNum(); i++) {
                if (row.getCell(i).getStringCellValue().trim().equals(colName.trim())) {
                    colNum = i;
                    break;
                }
            }
            
            if (colNum == -1) return "";

            row = sheet.getRow(rowNum - 1);
            if (row == null) return "";

            cell = row.getCell(colNum);
            if (cell == null) return "";

            return processCellValue(cell);
        } catch (Exception e) {
            e.printStackTrace();
            return "Row " + rowNum + " or column " + colName + " does not exist in Excel";
        }
    }

    // Get cell data by column number
    public String getCellData(String sheetName, int colNum, int rowNum) {
        try {
            if (rowNum <= 0) return "";

            int index = workbook.getSheetIndex(sheetName);
            if (index == -1) return "";

            sheet = workbook.getSheetAt(index);
            row = sheet.getRow(rowNum - 1);
            if (row == null) return "";

            cell = row.getCell(colNum);
            if (cell == null) return "";

            return processCellValue(cell);
        } catch (Exception e) {
            e.printStackTrace();
            return "Row " + rowNum + " or column " + colNum + " does not exist in Excel";
        }
    }

    // Process cell value based on its type
    private String processCellValue(XSSFCell cell) {
        CellType cellType = cell.getCellType();
        
        switch (cellType) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
            case FORMULA:
                if (DateUtil.isCellDateFormatted(cell)) {
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(DateUtil.getJavaDate(cell.getNumericCellValue()));
                    
                    String year = String.valueOf(cal.get(Calendar.YEAR)).substring(2);
                    return (cal.get(Calendar.MONTH) + 1) + "/" + 
                           cal.get(Calendar.DAY_OF_MONTH) + "/" + 
                           year;
                }
                return String.valueOf(cell.getNumericCellValue());
            case BLANK:
                return "";
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            default:
                return "";
        }
    }

    // Set cell data
  
    @SuppressWarnings("resource")
	public boolean setCellData(String sheetName, String colName, int rowNum, String data) {
        try {
            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            fis.close();
            
            if (rowNum <= 0) return false;
            
            int index = workbook.getSheetIndex(sheetName);
            if (index == -1) return false;

            
            XSSFSheet sheet = workbook.getSheetAt(index);
            XSSFRow row = sheet.getRow(0);
            
            int colNum = -1;
            for (int i = 0; i < row.getLastCellNum(); i++) {
                if (row.getCell(i).getStringCellValue().trim().equals(colName)) {
                    colNum = i;
                    break;
                }
            }
            
            if (colNum == -1) return false;
            
            sheet.autoSizeColumn(colNum);
            row = sheet.getRow(rowNum - 1);
            if (row == null) row = sheet.createRow(rowNum - 1);
            
            XSSFCell cell = row.getCell(colNum);
            if (cell == null) cell = row.createCell(colNum);
            
            cell.setCellValue(data);
            
            FileOutputStream fileOut = new FileOutputStream(path);
            workbook.write(fileOut);
            workbook.close();
            fileOut.close();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}