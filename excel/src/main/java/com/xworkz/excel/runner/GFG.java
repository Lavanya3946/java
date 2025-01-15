package com.xworkz.excel.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GFG {
    public static void main(String[] args) {

        try {
            // Reading file from local directory
            FileInputStream file = new FileInputStream(new File("C:\\Users\\lavan\\Downloads\\Book1.xlsx"));

            // Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            // Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Iterate through each row one by one
            Iterator<Row> rowIterator = sheet.iterator();

            // Print the header once
            if (rowIterator.hasNext()) {
                Row headerRow = rowIterator.next();
                Iterator<Cell> headerCellIterator = headerRow.cellIterator();
                while (headerCellIterator.hasNext()) {
                    Cell headerCell = headerCellIterator.next();
                    System.out.print(headerCell.getStringCellValue() + "\t");
                }
                System.out.println();
            }

            // Iterate through the rows
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                // For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    // Checking the cell type and format accordingly
                    switch (cell.getCellType()) {
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        case FORMULA:
                            System.out.print(cell.getCellFormula() + "\t");
                            break;
                        case BLANK:
                            System.out.print("\t");
                            break;
                        default:
                            System.out.print("Unknown cell type" + "\t");
                            break;
                    }
                }
                System.out.println();
            }

            // Closing file input stream and workbook
            workbook.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
