package com.martin.jdbc;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Task {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    String name;

    public Task() {}

    public Task(long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Task(String name) {
        super();
        this.name = name;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
