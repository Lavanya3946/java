package com.xworkz.excel.repositary;

import com.xworkz.excel.dto.AppDto;

import java.util.List;

public interface AppRepo {
    void save(AppDto appDto);
    void batchSave(List<AppDto> appDtoList);
    List<AppDto> getAll();
}
