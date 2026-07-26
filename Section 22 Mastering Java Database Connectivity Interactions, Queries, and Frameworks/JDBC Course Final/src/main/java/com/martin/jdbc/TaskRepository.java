package com.martin.jdbc;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

// Using Hikari to manage the connections pool, as creating a new connection is expensive (computationally).
public class TaskRepository {

    // Singleton DataSource instance to properly manage and share the connection pool
    private static final HikariDataSource dataSource;

    static {
        dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:h2:./todo;AUTO_SERVER=TRUE");

        // Automatically create the table on startup if it doesn't exist yet
        try (Connection conn = dataSource.getConnection();
             var stmt = conn.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS TASK (id IDENTITY PRIMARY KEY, name VARCHAR(255))");
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize database table", e);
        }
    }

    private static DataSource getDataSource(){
        return dataSource;
    }

    public static void create(Task task) throws  Exception{
        try (Connection connection = getDataSource().getConnection()){
            String insertStatement = "insert into TASK (name) values (?)";
            var preparedStatement = connection.prepareStatement(insertStatement);
            preparedStatement.setString(1, task.name);
            preparedStatement.execute();
        }
    }

    public static void update(Task updateTask, Task newTask) throws  Exception{
        try (Connection connection = getDataSource().getConnection()){
            String updateCommand = "update TASK set name = ? where id = ?";
            var preparedStatement = connection.prepareStatement(updateCommand);
            preparedStatement.setString(1, newTask.name);
            preparedStatement.setLong(2, updateTask.getId());
            preparedStatement.execute();
        }
    }

    public static void delete(Task task) throws  Exception{
        try (Connection connection = getDataSource().getConnection()){
            String updateCommand = "delete from TASK where id = ?";
            var preparedStatement = connection.prepareStatement(updateCommand);
            preparedStatement.setLong(1, task.getId());
            preparedStatement.execute();
        }
    }

    public static void deleteAll() throws  Exception{
        try (Connection connection = getDataSource().getConnection()){
            String deleteAll = "TRUNCATE TABLE TASK";
            var statement = connection.createStatement();
            statement.execute(deleteAll);
        }
    }

    public static List<Task> findAll() throws  Exception{
        List<Task> tasks = new ArrayList<>();
        try (Connection connection = getDataSource().getConnection()){
            var statement = connection.createStatement();
            var resultSet = statement.executeQuery("SELECT * FROM TASK");
            while (resultSet.next()){
                Task task = new Task(resultSet.getLong(1), resultSet.getString(2));
                tasks.add(task);
            }
        }
        return tasks;
    }

    public static void main(String[] args) throws Exception {
        deleteAll();

        Task task1 = new Task("Clean my room");
        Task task2 = new Task("Study SpingBoot");
        Task task3 = new Task("Workout");
        Task task4 = new Task("Prepare lunch");

        create(task1);
        create(task2);
        update(task1, task4);

        delete(task2);
        create(task3);

        List<Task> tasks = findAll();

        tasks.forEach(System.out::println);
    }

}
