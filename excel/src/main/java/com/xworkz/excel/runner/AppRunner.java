package com.xworkz.excel.runner;

import com.xworkz.excel.service.AppService;
import com.xworkz.excel.serviceImpl.AppServiceImpl;

public class AppRunner {
    public static void main(String[] args) {
        String filePath="C:\\Users\\lavan\\OneDrive\\Desktop\\Read11.xlsx";
        AppService appService=new AppServiceImpl();
        appService.readExcelAndSaveData(filePath);

    }
}
