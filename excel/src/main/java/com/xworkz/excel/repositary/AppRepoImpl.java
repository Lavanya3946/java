package com.xworkz.excel.repositary;

import com.xworkz.excel.dto.AppDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AppRepoImpl implements AppRepo {

    private static final String URL = "jdbc:mysql://localhost:3306/excel";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    @Override
    public void save(AppDto appDto) {
        String sql = "insert into app2_data(app4_id,app4_name,app4_version,owned_by,date) values (?,?,?,?,?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, appDto.getId());
            statement.setString(2, appDto.getName());
            statement.setString(3, appDto.getVersion());
            statement.setString(4, appDto.getOwnedBy());
            statement.setString(5, appDto.getDate());
            statement.executeUpdate();
        } catch (Exception ex) {

            System.out.println("In SQL ID " + appDto.getId() + " Already inserted");
        }
    }

    @Override
    public void batchSave(List<AppDto> appDtoList) {
        String sql = "insert into app2_data(app4_id,app4_name,app4_version,owned_by,date) values (?,?,?,?,?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            for (AppDto appDto : appDtoList) {
                statement.setInt(1, appDto.getId());
                statement.setString(2, appDto.getName());
                statement.setString(3, appDto.getVersion());
                statement.setString(4, appDto.getOwnedBy());
                statement.setString(5, appDto.getDate());
                statement.addBatch();
            }
            statement.executeBatch();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<AppDto> getAll() {
        List<AppDto> appDtoList = new ArrayList<>();
        String sql = "select *from app2_data";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                AppDto appDto = new AppDto();
                appDto.setId(resultSet.getInt("app4_id"));
                appDto.setName((resultSet.getString("app4_name")));
                appDto.setVersion(resultSet.getString("app4_version"));
                appDto.setOwnedBy(resultSet.getString("owned_by"));
                appDto.setDate(resultSet.getString("date"));
                appDtoList.add(appDto);
            }
            for (AppDto appDto : appDtoList) {
                System.out.println(appDto);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return appDtoList;
    }
}
