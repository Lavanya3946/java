package com.xworkz.excel.runner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static java.lang.Integer.parseInt;

public class ExcelReader {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/excel";
        String USER = "root";
        String PASSWORD = "root";

        String filePath = "C:\\Users\\lavan\\OneDrive\\Desktop\\excel1.csv";
        int batchSize = 20;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.setAutoCommit(false);
            String sql = "insert into app_data(id,name,version,owned_by,date) values (?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            BufferedReader lineReader = new BufferedReader(new FileReader(filePath));
            String lineText = null;
            int count = 0;
            lineReader.readLine();
            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");

                if (data.length < 5) {
                    continue;
                }

                String id = data[0];
                String name = data[1];
                String version = data[2];
                String owned_by = data[3];
                String date = data[4];


                String checkQuery = "select count(*) FROM app_data WHERE id = ?";
                PreparedStatement checkStmt = connection.prepareStatement(checkQuery);
                checkStmt.setInt(1, parseInt(id));
                ResultSet resultSet = checkStmt.executeQuery();
                if (resultSet.next() && resultSet.getInt(1) == 0) {
                    statement.setInt(1, parseInt(id));
                    statement.setString(2, name);
                    statement.setString(3, version);
                    statement.setString(4, owned_by);
                    statement.setString(5, date);
                    statement.addBatch();
                } else {
                    System.out.println("Duplicate entry for ID: " + id + ", skipping insert.");
                }

                if (count % batchSize == 0) {
                    statement.executeBatch();
                }
                count++;
            }
            lineReader.close();
            statement.executeBatch();
            connection.commit();
            connection.close();
            System.out.println("Data has been inserted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
