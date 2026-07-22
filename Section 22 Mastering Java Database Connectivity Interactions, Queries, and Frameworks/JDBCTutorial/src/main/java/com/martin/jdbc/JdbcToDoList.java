package com.martin.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcToDoList {
    public static void main(String[] args) throws SQLException {
        // ;AUTO_SERVER=TRUE allows for multiple db connections.
        var connection = DriverManager.getConnection("jdbc:h2:./todo;AUTO_SERVER=TRUE");

        String createTableSql = "create table if not exists TASK (id identity primary key, name varchar)";
        var statement = connection.createStatement();
        statement.execute(createTableSql);


    }
}
