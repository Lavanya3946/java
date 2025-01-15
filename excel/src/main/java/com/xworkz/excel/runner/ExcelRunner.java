package com.xworkz.excel.runner;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRunner {
    public static void main(String[] args) throws IOException {
        // File path of the Excel file
        String excelFilePath = "C:\\Users\\lavan\\Downloads\\excel1.xlsx";

        // Creating a Workbook from the Excel file
        FileInputStream fileInputStream = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(fileInputStream);

        // Retrieving the first sheet of the Excel file
        Sheet sheet = workbook.getSheetAt(0);

        // Printing header once
        System.out.printf("%-10s %-17s %-15s %-10s %-15s%n", "App_id", "App_name", "App_version", "Version", "Owned by");

        // Iterating through each row and cell in the sheet
        boolean isFirstRow = true;
        for (Row row : sheet) {
            // Skip the header row
            if (isFirstRow) {
                isFirstRow = false;
                continue;
            }
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.printf("%-15s", cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.printf("%-15s", cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.printf("%-15s", cell.getBooleanCellValue());
                        break;
                    case FORMULA:
                        System.out.printf("%-15s", cell.getCellFormula());
                        break;
                    case BLANK:
                        System.out.printf("%-15s", "");
                        break;
                    default:
                        System.out.printf("%-15s", "Unknown cell type");
                        break;
                }
            }
            System.out.println();
        }

        // Closing the workbook and file input stream
        workbook.close();
        fileInputStream.close();
    }
}
