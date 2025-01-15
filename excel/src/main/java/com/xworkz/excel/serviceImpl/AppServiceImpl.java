package com.xworkz.excel.serviceImpl;

import com.xworkz.excel.dto.AppDto;
import com.xworkz.excel.repositary.AppRepo;
import com.xworkz.excel.repositary.AppRepoImpl;
import com.xworkz.excel.service.AppService;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppServiceImpl implements AppService {
    private AppRepo repo = new AppRepoImpl();

    @Override
    public void readExcelAndSaveData(String filePath) {
        boolean isHeaderRow = true;
        List<AppDto> appDtoList = new ArrayList<>();

        try (FileInputStream file = new FileInputStream(new File(filePath));
             XSSFWorkbook workbook = new XSSFWorkbook(file)) {
            XSSFSheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                if (isHeaderRow) {
                    isHeaderRow = false; // Skip the first row (header row)
                    continue;
                }

                Iterator<Cell> cellIterator = row.cellIterator();
                AppDto dto = new AppDto();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    switch (cell.getColumnIndex()) {
                        case 0:
                            if (cell.getCellType() == CellType.NUMERIC) {
                                dto.setId((int) cell.getNumericCellValue());
                            } else if (cell.getCellType() == CellType.STRING) {
                                dto.setId(Integer.parseInt(cell.getStringCellValue()));
                            }
                            break;
                        case 1:
                            if (cell.getCellType() == CellType.STRING) {
                                dto.setName(cell.getStringCellValue());
                            } else if (cell.getCellType() == CellType.NUMERIC) {
                                dto.setName(String.valueOf(cell.getNumericCellValue()));
                            }
                            break;
                        case 2:
                            if (cell.getCellType() == CellType.STRING) {
                                dto.setVersion(cell.getStringCellValue());
                            } else if (cell.getCellType() == CellType.NUMERIC) {
                                dto.setVersion(String.valueOf(cell.getNumericCellValue()));
                            }
                            break;
                        case 3:
                            if (cell.getCellType() == CellType.STRING) {
                                dto.setOwnedBy(cell.getStringCellValue());
                            } else if (cell.getCellType() == CellType.NUMERIC) {
                                dto.setOwnedBy(String.valueOf(cell.getNumericCellValue()));
                            }
                            break;
                        case 4:
                            if (cell.getCellType() == CellType.STRING) {
                                dto.setDate(cell.getStringCellValue());
                            } else if (cell.getCellType() == CellType.NUMERIC) {
                                dto.setDate(String.valueOf(cell.getNumericCellValue()));
                            }
                            break;
                    }
                }
//                repo.save(dto);
                appDtoList.add(dto);
            }
            repo.batchSave(appDtoList);
            repo.getAll();
            System.out.println("New Data has been inserted successfully!");
        } catch (Exception e) {
            System.out.println("service: " + e.getMessage());
        }
    }
}
