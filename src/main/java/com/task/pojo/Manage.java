package com.task.pojo;

public class Manage {
    private Integer id;

    private String username;

    private String managelevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getManagelevel() {
        return managelevel;
    }

    public void setManagelevel(String managelevel) {
        this.managelevel = managelevel == null ? null : managelevel.trim();
    }
}