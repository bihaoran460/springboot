package com.example.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id // 表明这个属性是主键
    @GeneratedValue // 自增长
    private long id;
    @Column(nullable = false, unique = true)    // 不允许为空，属性唯一
    private String username;
    @Column(nullable = false)   // 不允许为空
    private String password;

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
