package com.martin.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcToDoList {
    public static void main(String[] args) throws SQLException {
        // ;AUTO_SERVER=TRUE allows for multiple db connections.
        var connection = DriverManager.getConnection("jdbc:h2:./todo;AUTO_SERVER=TRUE");

        // Query to create the table
        String createTableSql = "create table if not exists TASK (id identity primary key, name varchar)";
        var statement = connection.createStatement();
        statement.execute(createTableSql);

        // Query to add data
        String insertQuery = "insert into TASK (name) values ('Learn Java!')";
        statement.execute(insertQuery);

        // Prepared statement
        // In JDBC, the main difference is that PreparedStatement executes precompiled SQL queries with dynamic parameters,
        // whereas Statement executes simple, static SQL queries without parameters
        String insertStatement = "insert into TASK (name) values (?)";
        var preparedStatement = connection.prepareStatement(insertStatement);
        preparedStatement.setString(1, "Learn Spring!");
        preparedStatement.execute();

        // Update with prepared statement
        String updateCommand = "update TASK set name = ? where name = 'Learn Java!'";
        preparedStatement = connection.prepareStatement(updateCommand);
        preparedStatement.setString(1, "Learn Jakarta EE!");
        preparedStatement.execute();

        // Delete Query
         String deleteQuery = "delete from TASK where name = 'Learn Spring!'";
         statement.execute(deleteQuery);

        // Select * Query
        String selectAllQuery = "select * from TASK";
        var resultSet = statement.executeQuery(selectAllQuery);
        while (resultSet.next()){
            System.out.println("To Do Item: " + resultSet.getString("name"));
        }


    }
}
